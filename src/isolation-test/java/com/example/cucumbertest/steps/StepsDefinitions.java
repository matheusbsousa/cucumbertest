package com.example.cucumbertest.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.testcontainers.containers.KafkaContainer;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RequiredArgsConstructor
public class StepsDefinitions {

    private final KafkaContainer kafkaContainer;

//    @Given("today is Sunday")
//    public void today_is_sunday() {
//        // Write code here that turns the phrase above into concrete actions
//        assertThat(kafkaContainer.isRunning());
//    }
//
//    @When("I ask whether it's Friday yet")
//    public void i_ask_whether_it_s_friday_yet() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("I should be told {string}")
//    public void i_should_be_told(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
