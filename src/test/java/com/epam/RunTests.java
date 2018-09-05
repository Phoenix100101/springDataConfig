package com.epam;

import com.epam.Entities.Person;
import com.epam.Repositories.PersonRepository;
import com.epam.config.DataBaseConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DataBaseConfig.class)
public class RunTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testExample() {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("firstName");
        person.setLastName("lastName");
        personRepository.save(person);
    System.out.println(personRepository.findById(1));

    }
}
