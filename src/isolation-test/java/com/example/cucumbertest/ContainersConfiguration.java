package com.example.cucumbertest;

import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
class ContainersConfiguration {

//    @ClassRule
//    public static DockerComposeContainer environment =
//            new DockerComposeContainer(new File("../../../docker-compose.yml"));
    public static final KafkaContainer kafka;

    //    @Container
//    private static PostgreSQLContainer container = DB_CONTAINER;


    static {
        kafka = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:6.2.1"));
        kafka.start();
        System.out.println("Kafka Status");
        System.out.println(kafka.isRunning());
    }


}
