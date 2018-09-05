package com.epam.repositories;

import com.epam.entities.Person;
import com.epam.config.DataBaseConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DataBaseConfig.class)
public class PersonRepositoryTest {

  @Autowired PersonRepository personRepository;

  @Test
  public void saveFindPerson() {
    Person expectedPerson = new Person();
    expectedPerson.setFirstName("firstName");
    expectedPerson.setLastName("lastName");
    personRepository.save(expectedPerson);
    Person actualPerson = personRepository.findById(1).get();
    Assert.assertEquals(expectedPerson, actualPerson);
  }
}
