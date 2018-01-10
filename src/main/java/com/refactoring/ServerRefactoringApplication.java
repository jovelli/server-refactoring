package com.refactoring;

import com.refactoring.examples.Refactorings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerRefactoringApplication {

		public static void main(String[] args) {
			SpringApplication.run(ServerRefactoringApplication.class, args);
			new Refactorings().printOwing(12.5);
	}
}
