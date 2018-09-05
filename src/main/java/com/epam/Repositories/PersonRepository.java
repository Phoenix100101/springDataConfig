package com.epam.Repositories;

import com.epam.Entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

//@NoRepositoryBean
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
