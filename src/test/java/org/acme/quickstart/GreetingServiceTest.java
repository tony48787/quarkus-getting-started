package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class GreetingServiceTest {

    @Inject
    GreetingService greetingService;

    @Test
    public void givenNameIsTony_whenGreeting_thenGreetTony() {
        String result = greetingService.greeting("Tony");
        Assertions.assertEquals("hello Tony", result);
    }

}
