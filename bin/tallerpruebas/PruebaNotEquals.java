package tallerpruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PruebaNotSame {
	
	/Comprueba que los resultados de empleados iguales sean desiguales.
	
	
	Employee tester1 = new Employee(53.25F, "USD", 0.15F, EmployeeType.Worker);
	Employee tester2 = new Employee(-53.25F, "USD", 0.15F, EmployeeType.Worker);


	@Test
	void testCsForNegatives() {
		Assertions.assertNotSame(tester1.cs,tester2.cs);

	@Test
	void testCalculateYearBonusForNegatives() {
		Assertions.assertNotSame(tester1.cs,tester2.cs);
	}

}
