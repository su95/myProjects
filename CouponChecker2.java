public class CouponChecker2 {
	
	private int sum = 0;
	private int checkSum;

	public boolean checkCoupon(String s) {
		
		s = s.substring(2);
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i < c.length; i++){
		
			if(i % 2 == 0) { sum += c[i]; }
			
		}
		
		char cs = c[c.length - 1];
		
		if(cs == 'X') {	checkSum = 10; }
		
		else {
			
			String cx = cs + "";
			
			checkSum = Integer.parseInt(cx);
			
		}
		
		sum = sum + checkSum;
				
		if(sum % 11 == 0) { return true; }
		
		else              { return false; }
		
	}

}