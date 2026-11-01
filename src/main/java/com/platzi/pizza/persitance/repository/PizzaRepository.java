package com.platzi.pizza.persitance.repository;

import com.platzi.pizza.persitance.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {

}
