package com.example.api.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.api.models.ObraModel;

@Repository
public interface IObraRepository extends JpaRepository<ObraModel, Long> {

    List<ObraModel> findBySala_Id(Long salaId);

}
