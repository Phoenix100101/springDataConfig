package com.epam;

import com.epam.config.DataBaseConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DataBaseConfig.class)
public class RunTests {

    @Test
    public void testExample() {

    }
}
