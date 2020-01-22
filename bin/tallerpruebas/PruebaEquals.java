package tallerpruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PruebaEquals {
	
	/Comprueba que los resultados de empleados iguales sean iguales.
	
	
	Employee tester1 = new Employee(53.25F, "USD", 0.15F, EmployeeType.Worker);
	Employee tester2 = new Employee(53.25F, "USD", 0.15F, EmployeeType.Worker);


	@Test
	void testCsForNegatives() {
		Assertions.assertEquals(tester1.cs,tester2.cs);

	@Test
	void testCalculateYearBonusForNegatives() {
		Assertions.assertEquals(tester1.cs,tester2.cs);
	}

}
