package com.refactoring;

import com.refactoring.examples.datavaluetoobject.Order;
import com.refactoring.examples.encapsulatecollections.Studant;
import com.refactoring.examples.hidedelegate.Person;
import com.refactoring.examples.methodobject.MethodObject;
import com.refactoring.examples.Refactorings;
import com.refactoring.examples.movemethod.Account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerRefactoringApplication {

		private static final Logger LOGGER = LogManager.getLogger(ServerRefactoringApplication.class);

		public static void main(String[] args) {
			SpringApplication.run(ServerRefactoringApplication.class, args);
			new Refactorings().printOwing(12.5);
			new Refactorings().getComplicatedPrice();

			LOGGER.info("Replace Method by Method Object [" +
					new MethodObject().price(120.30, 12, 2010) + "]");

			LOGGER.info("MoveMethod bankCharge [" + new Account().bankCharge() + "]");

			LOGGER.info("Hide Delegate [" + new Person().getManager() + "]");

			LOGGER.info("Data Value to Object [" + new Order("John").getOrdersQtyByCustomer() + "]");

			Studant studant = new Studant();
			LOGGER.info("Encapsulate Collections [" + studant.getCourses() + ", " +
					"Advanced Courses Count [" + studant.advancedCoursesCount() + "]");
	}
}
