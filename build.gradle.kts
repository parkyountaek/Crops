import com.google.protobuf.gradle.*

plugins {
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.8.0"
	kotlin("plugin.spring") version "1.8.0"
	kotlin("plugin.jpa") version "1.8.0"
	kotlin("kapt") version "1.8.0"
	id("com.google.protobuf") version "0.9.3"
}

group = "com.crop.application"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	google() // 추가 저장소
	maven { url = uri("https://plugins.gradle.org/m2/") } // 추가 저장소
}

dependencies {
	// Spring Boot Starter
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// Database
	runtimeOnly("com.h2database:h2")
	runtimeOnly("mysql:mysql-connector-java:8.0.33") // 명시적으로 버전 추가

	// gRPC
	implementation("io.grpc:grpc-kotlin-stub:1.4.0")
	implementation("io.grpc:grpc-netty-shaded:1.55.1") // 최신 버전으로 변경
	implementation("io.grpc:grpc-protobuf:1.56.0") // 최신 버전으로 변경
	implementation("io.grpc:grpc-stub:1.56.0") // 최신 버전으로 변경

	// Protocol Buffers
	implementation("com.google.protobuf:protobuf-java:3.24.0")

	// QueryDSL
	implementation("com.querydsl:querydsl-jpa:5.0.0")
	kapt("com.querydsl:querydsl-apt:5.0.0:jpa")

	// Testcontainers
	testImplementation("org.testcontainers:junit-jupiter:1.18.0")
	testImplementation("org.testcontainers:mysql:1.18.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

kapt {
	arguments {
		arg("querydsl.entityAccessors", "true")
		arg("querydsl.entityCopy", "true")
	}
}

sourceSets {
	main {
		java {
			srcDirs("src/main/kotlin")
		}
	}
}

// Protocol Buffers
protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:3.24.0"
	}
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:1.55.0"
		}
		id("grpckt") {
			artifact = "io.grpc:protoc-gen-grpc-kotlin:1.4.0:jdk8@jar"
		}
	}
	generateProtoTasks {
		all().forEach { task ->
			task.plugins {
				create("grpc")
				create("grpckt")
			}
		}
	}
}
