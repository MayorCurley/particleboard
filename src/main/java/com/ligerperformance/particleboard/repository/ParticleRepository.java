package com.ligerperformance.particleboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ligerperformance.particleboard.model.Particle;

public interface ParticleRepository extends JpaRepository<Particle, Integer> {
}
