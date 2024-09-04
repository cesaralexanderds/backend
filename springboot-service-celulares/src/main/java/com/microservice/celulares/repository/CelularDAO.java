package com.microservice.celulares.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.celulares.entity.Celular;

public interface CelularDAO extends CrudRepository<Celular, Long>{

}
