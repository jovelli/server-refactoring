package com.refactoring;

import com.refactoring.beans.Refactorings;
import com.refactoring.examples.conditionals.DecomposeConditional;
import com.refactoring.examples.datavaluetoobject.Order;
import com.refactoring.examples.encapsulatecollections.Studant;
import com.refactoring.examples.extractclass.Department;
import com.refactoring.examples.extractclass.Employee;
import com.refactoring.examples.hidedelegate.Person;
import com.refactoring.examples.methodobject.MethodObject;
import com.refactoring.examples.movemethod.Account;
import com.refactoring.examples.parameterbymethod.Price;
import com.refactoring.examples.parameterobject.BillManager;
import com.refactoring.examples.parameterobject.DateRange;
import com.refactoring.examples.separatequerymodifier.QueryAndModifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ServerRefactoringApplication {

		private static final Logger LOGGER = LogManager.getLogger(ServerRefactoringApplication.class);

		public static void main(String[] args) {
			SpringApplication.run(ServerRefactoringApplication.class, args);
			new Refactorings().printOwing(12.5);
			LOGGER.info("getComplicatedPrice " + new Refactorings().getComplicatedPrice());

			LOGGER.info("Replace Method by Method Object [" +
					new MethodObject().price(120.30, 12, 2010) + "]");

			LOGGER.info("MoveMethod bankCharge [" + new Account().bankCharge() + "]");

			LOGGER.info("Hide Delegate [" + new Person().getManager() + "]");

			LOGGER.info("Data Value to Object [" + new Order("John").getOrdersQtyByCustomer() + "]");

			Studant studant = new Studant();
			LOGGER.info("Encapsulate Collections [" + studant.getCourses() + ", " +
					"Advanced Courses Count [" + studant.advancedCoursesCount() + "]");

			LOGGER.info("Decompose Conditionals [" +
					new DecomposeConditional(LocalDate.of(2017, 12, 22)).charge(100) + "]");

			LOGGER.info("Separate modifier and setter - Found");
			new QueryAndModifier().sendAlert(new String[]{"Mike", "Mary", "James"});

			LOGGER.info("Replace parameter by method [" + new Price(100.00, 10).getPrice() + "]");

			LocalDate start = LocalDate.of(2010, 01, 01);
			LocalDate end = LocalDate.of(2010, 12, 01);
			DateRange dateRange = new DateRange(start, end);
			LOGGER.info("Replace parameter by object [" + new BillManager().getEntriesBetween(dateRange) + "]");

			Department department = new Department(1, "Sales");
			department.addParty(new Employee(1, "Mike", 30.0));
			department.addParty(new Employee(2, "John", 35.0));
			department.addParty(new Employee(3, "Mary", 50.0));
			Department subDepartment = new Department(5, "Regional Sales");
			subDepartment.addParty(new Employee(1, "Prom", 70.0));
			department.addParty(subDepartment);

 			LOGGER.info("Extract class [" + department.getAnnualCost() + "] headCount [" + department.headCount() + "]");
	}
}
