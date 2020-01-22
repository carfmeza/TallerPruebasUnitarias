package tallerpruebas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PruebaNotNull {
	
	/ Se utiliza esta prueba para saber si el objeto no esta vacio
	Employee tester1 = new Employee(1, "USD", 0.15F, EmployeeType.Worker);
	
	
	@Test
	void testCsNotNull() {
		Assertions.assertNull(tester1);
	}

	@Test
	void testCalculateYearBonusNotNull() {
		Assertions.assertNotNull(tester1);
	}
}
