public class MicrowaveButtons {
	private int time;
	private int power = 1;
	
	public int gettime() {
		return time;
	}
	public int getpower() {
		return power;
	}
	public void seconds() {
		time = time + 30;
	}

	public void powerlvl() {
		power = power + 1;
	}
	public void resettime() {
		time = 0;
	}
	public void resetpower() {
		power = 1;
	}


}
