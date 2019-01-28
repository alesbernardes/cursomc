package com.alessandro.cursmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.alessandro.cursmc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


		
}
