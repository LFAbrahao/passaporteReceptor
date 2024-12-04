package com.senac.passaporte.receptor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.passaporte.receptor.entities.Passaporte;

public interface PassaporteRepository extends JpaRepository<Passaporte, Integer> {

}
