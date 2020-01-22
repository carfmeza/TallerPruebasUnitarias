package tallerpruebas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PruebaValorCero {
	
	/* Se utiliza esta prueba para saber que el salario no es 0
	
	Employee tester = new Employee(0, "USD", 0.15F, EmployeeType.Worker);
	
	@Test
	void testCsCero() {
		Assertions.assertTrue(tester.cs() == 0, "El salario no puede dar 0");
	}
	@Test
	void testCalculateYearBonusCero() {
		Assertions.assertTrue(tester.CalculateYearBonus() == 0, "El salario no puede dar 0");
	
}
