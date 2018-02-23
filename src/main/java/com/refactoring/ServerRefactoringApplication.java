package com.refactoring;

import com.refactoring.examples.datavaluetoobject.Order;
import com.refactoring.examples.hidedelegate.Person;
import com.refactoring.examples.methodobject.MethodObject;
import com.refactoring.examples.Refactorings;
import com.refactoring.examples.movemethod.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerRefactoringApplication {

		public static void main(String[] args) {
			SpringApplication.run(ServerRefactoringApplication.class, args);
			new Refactorings().printOwing(12.5);
			new Refactorings().getComplicatedPrice();

			System.out.println("Replace Method by Method Object [" +
					new MethodObject().price(120.30, 12, 2010) + "]");

			System.out.println("MoveMethod bankCharge [" + new Account().bankCharge() + "]");

			System.out.println("Hide Delegate [" + new Person().getManager() + "]");

			System.out.println("Data Value to Object [" + new Order("John").getOrdersQtyByCustomer() + "]");
	}
}
