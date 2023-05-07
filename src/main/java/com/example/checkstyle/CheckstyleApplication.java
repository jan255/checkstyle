package com.example.checkstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Checkstyle application.
 */
@SpringBootApplication
public class CheckstyleApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    Test test = new Test(25, "testowo mi");

    SpringApplication.run(CheckstyleApplication.class, args);

  }

}
