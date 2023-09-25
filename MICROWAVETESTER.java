
public class MICROWAVETESTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicrowaveButtons tester = new MicrowaveButtons();
		int value = tester.gettime();
		int pow = tester.getpower();
		tester.seconds();
		value = tester.gettime();
		System.out.println("time button was pressed. time is " + value + "seconds");
		tester.seconds();
		value = tester.gettime();
		System.out.println("time button was pressed. time is " + value + "seconds");
		tester.powerlvl();
		pow = tester.getpower();
		System.out.println("power button was pressed. power is " + pow);
		tester.resettime();
		tester.resetpower();
		value = tester.gettime();
		pow = tester.getpower();
		System.out.println("reset button was pressed. time is " + value + " power is " + pow);
			
		
		
		
		
	}

}
