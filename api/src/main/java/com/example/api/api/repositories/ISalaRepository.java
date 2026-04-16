package com.example.api.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.api.models.SalaModel;

@Repository
public interface ISalaRepository extends JpaRepository<SalaModel, Long> {
}
