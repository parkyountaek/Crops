package com.crop.application.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "teams")
class TeamEntity(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "team_id", columnDefinition = "bigint") val teamId: Long?
)