import java.util.Scanner;

public class AveMinMax {
	
	private static int ave;
	private static int min;
	private static int max;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] passNums = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			
			passNums[i] = Integer.parseInt(args[i]);
			System.out.println("passNums[" + i + "] = " + passNums[i]);
			
		}
		
		AveMinMax aMM = new AveMinMax();
		
		Thread t1 = new Thread(new Average(passNums, aMM), "AverageThread");
		Thread t2 = new Thread(new Minimum(passNums, aMM), "MinimumThread");
		Thread t3 = new Thread(new Maximum(passNums, aMM), "MaximumThread");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Average = " + getAve());
		System.out.println("Minimum = " + getMin());
		System.out.println("Maximum = " + getMax());
		
	}

	public static int getAve() {
		return ave;
	}

	public void setAve(int ave) {
		this.ave = ave;
	}

	public static int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public static int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
