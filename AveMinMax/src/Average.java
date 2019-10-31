
public class Average implements Runnable{

	private int[] nums;
	private AveMinMax a;
	
	public Average(int[] nums, AveMinMax a){
		
		this.nums = nums;
		this.a = a;
		
	}
	
	@Override
	public void run(){
		
		int sum = 0;
		int ave = 0;
		
		for (int i = 0; i < this.nums.length; i++) {
			
			sum += this.nums[i];
			
		}
		
		ave = sum / this.nums.length;
		
		this.a.setAve(ave);
	}
		
}
