
public class Minimum implements Runnable{

	private int[] nums;
	private AveMinMax m;
	
	public Minimum(int[] nums, AveMinMax m){
		
		this.nums = nums;
		this.m = m;
		
	}
	
	@Override
	public void run(){
		
		int min = this.nums[0];
		
		for(int i = 1; i < this.nums.length; i++) {
			
			if (this.nums[i] < min) {
				
				min = this.nums[i];
				
			}
			
		}
		
		this.m.setMin(min);
		
	}
	
}
