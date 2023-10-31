package com.xl1.iquibase.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private UUID id;
	private String name;
	private String email;
}
