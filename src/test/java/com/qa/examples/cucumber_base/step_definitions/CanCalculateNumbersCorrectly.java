package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanCalculateNumbersCorrectly {
	
	private Calculator calculator;
	private double actualResult;

	@Given("a calculator")
	public void aCalculator() {
		calculator = new Calculator();
	}

	@When("{double} and {double} are added")
	public void andAreAdded(Double leftOperand, Double rightOperand) {
	    this.actualResult = this.calculator.add(leftOperand, rightOperand);
	}
	
	@Then("the result should be {double}")
	public void theResultShouldBe(Double expectedResult) {
	    assertEquals(expectedResult, actualResult, 7);
	}
}
