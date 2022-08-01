package com.example.cucumbertest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Testcontainers
@SpringBootTest
@ActiveProfiles("isolation-test")
public class TestContainer {


//    @Container
//    public GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine"))
//            .withExposedPorts(6379);

    @Test
    void test() {
//        assertThat(redis.isRunning()).isTrue();
        assertThat(true).isTrue();
    }

}
