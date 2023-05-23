package com.example.springsecurity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringSecurityApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringSecurityApplication.class);

    @Test
    void contextLoads() {
        logger.info("Checking test case");
        Assertions.assertEquals(true, true);
    }


}
