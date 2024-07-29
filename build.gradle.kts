import com.google.protobuf.gradle.*

plugins {
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.9.10"
	kotlin("plugin.spring") version "1.9.10"
	kotlin("plugin.jpa") version "1.9.10"
	kotlin("plugin.allopen") version "1.9.10"
	kotlin("plugin.noarg") version "1.9.10"
	kotlin("kapt") version "1.9.10"
	id("com.google.protobuf") version "0.9.3"
}

group = "com.crop.application"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	google()
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
	runtimeOnly("mysql:mysql-connector-java:8.0.33")

	// gRPC
	implementation("io.grpc:grpc-kotlin-stub:1.4.0")
	implementation("io.grpc:grpc-netty-shaded:1.56.0")
	implementation("io.grpc:grpc-protobuf:1.56.0")
	implementation("io.grpc:grpc-stub:1.56.0")

	// Protocol Buffers
	implementation("com.google.protobuf:protobuf-java:3.24.0")

	// QueryDSL
	implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
	implementation("com.querydsl:querydsl-apt:5.0.0:jakarta")
	implementation("jakarta.persistence:jakarta.persistence-api")
	implementation("jakarta.annotation:jakarta.annotation-api")

	kapt("com.querydsl:querydsl-apt:5.0.0:jakarta")
	kapt("org.springframework.boot:spring-boot-configuration-processor")

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
			srcDirs("src/main/kotlin", "build/generated/source/kapt/main")
		}
		proto {
			srcDir("src/main/proto")
		}
	}
}

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
	annotation("jakarta.persistence.Embeddable")
}

noArg {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.Embeddable")
	annotation("jakarta.persistence.MappedSuperclass")
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:3.24.0"
	}
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:1.56.0"
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