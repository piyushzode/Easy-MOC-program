package Problem1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.easymock.EasyMock;

public class getRealFeelTempTest 
{	
	@Test
	public void testTemp1() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 0.00;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.VERY_COLD, actual);
		EasyMock.verify(mockobj);
	}
	
	@Test
	public void testTemp2() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 0.06;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.COLD, actual);
		EasyMock.verify(mockobj);
	}
	
	@Test
	public void testTemp3() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 4.39;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.COLD, actual);
		EasyMock.verify(mockobj);
	}
	
	@Test
	public void testTemp4() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 4.45;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.WARM, actual);
		EasyMock.verify(mockobj);
	}
	
	@Test
	public void testTemp5() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 26.62;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.WARM, actual);
		EasyMock.verify(mockobj);
	}
	
	@Test
	public void testTemp6() {
		CelciusServerTemp mockobj = EasyMock.createMock(CelciusServerTemp.class);
		double mockvalue = 26.67;
		EasyMock.expect(mockobj.serverTemp()).andReturn(mockvalue);
		EasyMock.replay(mockobj);
		getRealFeelTemp realtemp = new getRealFeelTemp();
		tempEnum actual = realtemp.getRealFeel(mockobj);
		assertEquals(tempEnum.HOT, actual);
		EasyMock.verify(mockobj);
	}
}