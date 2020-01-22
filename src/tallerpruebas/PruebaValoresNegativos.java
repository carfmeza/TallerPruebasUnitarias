package tallerpruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PruebaValoresNegativos {
	
	/*Se revisa que nunca retorne valores negativos de salario y de bono
	 * aunque se le manden valores negativos al constructor, esto se podría
	 * expandir con un test de excepciones, pero no las tenemos implementadas
	 */
	
	Employee tester1 = new Employee(-53.25F, "USD", 0.15F, EmployeeType.Worker);
	Employee tester2 = new Employee(53.25F, "USD", -0.15F, EmployeeType.Worker);
	Employee tester3 = new Employee(-53.25F, "USD", -0.15F, EmployeeType.Worker);

	@Test
	void testCsForNegatives() {
		Assertions.assertAll(
				() -> Assertions.assertTrue(tester1.cs() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos de salario"),
				() -> Assertions.assertTrue(tester2.cs() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos de bonus"),
				() -> Assertions.assertTrue(tester3.cs() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos"));
	}

	@Test
	void testCalculateYearBonusForNegatives() {
		Assertions.assertAll(
				() -> Assertions.assertTrue(tester1.CalculateYearBonus() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos de salario"),
				() -> Assertions.assertTrue(tester2.CalculateYearBonus() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos de bonus"),
				() -> Assertions.assertTrue(tester3.CalculateYearBonus() >= 0, "Debe siempre ser cero o mayor, existe un error con valores negativos"));
	}

}
