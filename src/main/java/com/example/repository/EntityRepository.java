package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.EntityDTO;

@Repository
public interface EntityRepository extends CrudRepository<EntityDTO, String> {

}
