package com.github.caluml.worstjavaever.julian;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class JulianDateConverterTest {

  @Test
  public void Can_convert_Julian_dates() {
    assertThat(JulianDateConverter.convertJulianDay(0)).isEqualTo(LocalDate.parse("-4713-01-01"));
    assertThat(JulianDateConverter.convertJulianDay(1)).isEqualTo(LocalDate.parse("-4713-01-02"));
    assertThat(JulianDateConverter.convertJulianDay(2)).isEqualTo(LocalDate.parse("-4713-01-03"));
    assertThat(JulianDateConverter.convertJulianDay(3)).isEqualTo(LocalDate.parse("-4713-01-04"));
    assertThat(JulianDateConverter.convertJulianDay(4713)).isEqualTo(LocalDate.parse("-4701-11-26"));
    assertThat(JulianDateConverter.convertJulianDay(100000)).isEqualTo(LocalDate.parse("-4440-10-14"));

    assertThat(JulianDateConverter.convertJulianDay(1000000)).isEqualTo(LocalDate.parse("-1976-10-21"));
    assertThat(JulianDateConverter.convertJulianDay(1721425)).isEqualTo(LocalDate.parse("-0001-12-31"));
    assertThat(JulianDateConverter.convertJulianDay(1721426)).isEqualTo(LocalDate.parse("0001-01-01"));

    assertThat(JulianDateConverter.convertJulianDay(2000000)).isEqualTo(LocalDate.parse("0763-09-18"));

    assertThat(JulianDateConverter.convertJulianDay(2361210)).isEqualTo(LocalDate.parse("1752-09-02"));
    assertThat(JulianDateConverter.convertJulianDay(2361217)).isEqualTo(LocalDate.parse("1752-09-09"));
    assertThat(JulianDateConverter.convertJulianDay(2361222)).isEqualTo(LocalDate.parse("1752-09-14"));


    assertThat(JulianDateConverter.convertJulianDay(2451544)).isEqualTo(LocalDate.parse("1999-12-31"));
    assertThat(JulianDateConverter.convertJulianDay(2451545)).isEqualTo(LocalDate.parse("2000-01-01"));
    assertThat(JulianDateConverter.convertJulianDay(2451546)).isEqualTo(LocalDate.parse("2000-01-02"));

    assertThat(JulianDateConverter.convertJulianDay(2500000)).isEqualTo(LocalDate.parse("2132-08-31"));
    assertThat(JulianDateConverter.convertJulianDay(3000000)).isEqualTo(LocalDate.parse("3501-08-15"));
    assertThat(JulianDateConverter.convertJulianDay(5373484)).isEqualTo(LocalDate.parse("9999-12-31"));
    assertThat(JulianDateConverter.convertJulianDay(10000000)).isEqualTo(LocalDate.parse("+22666-12-20"));
    assertThat(JulianDateConverter.convertJulianDay(100000000)).isEqualTo(LocalDate.parse("+269078-08-07"));
  }

}
