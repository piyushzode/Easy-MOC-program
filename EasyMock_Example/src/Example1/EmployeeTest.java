package Example1;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testCalc() {
		IcalcSalary mockobj = EasyMock.createMock(IcalcSalary.class);
		int mockvalue = 8000;
		EasyMock.expect(mockobj.newSalary()).andReturn(mockvalue);	//behavior of the mock objects has been recorded with expectations
		EasyMock.replay(mockobj);	//replay the expectations
		Employee emp = new Employee();
		int actual  = emp.calcAnnualSal(mockobj);
		//assertEquals(96000, actual);
		EasyMock.verify(mockobj);
	}

}
