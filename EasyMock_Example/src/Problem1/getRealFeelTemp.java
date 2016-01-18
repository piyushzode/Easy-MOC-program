package Problem1;

public class getRealFeelTemp {
	public tempEnum getRealFeel (CelciusServerTemp input) {
		
		// convert the server temp from Celsius to Fahrenheit
		double temp=input.serverTemp()*1.8+32.0;

		tempEnum feels;
		if (temp<=32.0)
			feels=tempEnum.VERY_COLD;
		else {
			if (temp<40.0)
				feels=tempEnum.COLD;
			else {
				if (temp<80.0)
					feels=tempEnum.WARM;
				else
					feels=tempEnum.HOT;
				}}
		
		return feels;
	}
}
