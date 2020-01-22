package tallerpruebas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PruebaSame {
	
	/* Se utiliza esta prueba para saber si existe la posibilidad de que exista overflow en los metodos
	 * de cs y CalculateYearBonus, es una prueba rudimentaria y podría tener mejores controles como
	 * convertir el retorno en double si es que esto sucede y se necesita manejar tales cantidades de dinero
	 */
	
	Employee tester = new Employee(Float.MAX_VALUE, "USD", 0.15F, EmployeeType.Worker);
	
	@Test
	void testCsForOverFlow() {
		Assertions.assertTrue(tester.cs() == Float.MAX_VALUE ||tester.cs() == Float.MIN_VALUE , "Existe Overflow");
	}

	@Test
	void testCalculateYearBonusOverflow() {
		Assertions.assertTrue(tester.CalculateYearBonus() == Float.MAX_VALUE ||tester.cs() == Float.MIN_VALUE, "Existe Overflow");
	}
}
