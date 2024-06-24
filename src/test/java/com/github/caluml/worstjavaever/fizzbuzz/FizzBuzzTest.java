package com.github.caluml.worstjavaever.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

  @Test
  public void FizzBuzz_can_be_calculated() {
    assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1");
    assertThat(FizzBuzz.fizzBuzz(2)).isEqualTo("2");
    assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
    assertThat(FizzBuzz.fizzBuzz(4)).isEqualTo("4");
    assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("Buzz");
    assertThat(FizzBuzz.fizzBuzz(6)).isEqualTo("Fizz");
    assertThat(FizzBuzz.fizzBuzz(7)).isEqualTo("7");
    assertThat(FizzBuzz.fizzBuzz(8)).isEqualTo("8");
    assertThat(FizzBuzz.fizzBuzz(9)).isEqualTo("Fizz");
    assertThat(FizzBuzz.fizzBuzz(10)).isEqualTo("Buzz");
    assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("Fizz Buzz");
    assertThat(FizzBuzz.fizzBuzz(100)).isEqualTo("Buzz");
    assertThat(FizzBuzz.fizzBuzz(1000)).isEqualTo("Buzz");
  }

}
