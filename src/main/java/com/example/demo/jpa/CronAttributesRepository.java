package com.example.demo.jpa;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CronAttributes;



public interface CronAttributesRepository extends CrudRepository<CronAttributes,Integer> {
}