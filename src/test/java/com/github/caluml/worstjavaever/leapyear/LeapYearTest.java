package com.github.caluml.worstjavaever.leapyear;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {

  @Test
  public void Can_calculate_leap_years() {
    assertThat(LeapYear.isLeapYear(Year.of(-1))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(0))).isTrue();
    assertThat(LeapYear.isLeapYear(Year.of(1))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(2))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(900))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1600))).isTrue();
    assertThat(LeapYear.isLeapYear(Year.of(1700))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1800))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1900))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1997))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1998))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(1999))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(2000))).isTrue();
    assertThat(LeapYear.isLeapYear(Year.of(2001))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(2004))).isTrue();
    assertThat(LeapYear.isLeapYear(Year.of(2006))).isFalse();
    assertThat(LeapYear.isLeapYear(Year.of(2008))).isTrue();
    assertThat(LeapYear.isLeapYear(Year.of(2100))).isFalse();
  }

}
