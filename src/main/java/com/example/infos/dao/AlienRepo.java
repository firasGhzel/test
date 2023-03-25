package com.example.infos.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.infos.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
