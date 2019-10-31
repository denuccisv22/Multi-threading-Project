
public class Maximum implements Runnable{

	private int[] nums;
	private AveMinMax m;
	
	public Maximum(int[] nums, AveMinMax m) {
		
		this.nums = nums;
		this.m = m;
		
	}
	
	@Override
	public void run(){
		
		int max = nums[0];
		
		for (int i = 1; i < this.nums.length; i++) {
			
			if(this.nums[i] > max) {
				
				max = this.nums[i];
				
			}
			
		}
		
		m.setMax(max);
		
	}

}
