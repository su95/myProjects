public class CouponGenerator2 {

	private int sum = 0;
	private int checkSum;
	private String coupon = "";
	private String alphanums = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
	
	public String getCoupon() {
		
		String rand = getRandom();
		
		checkSum = getCheckSum(sum);
		
		if (checkSum < 10) { coupon = "AX" + rand + checkSum; }
		
		else               { coupon = "AX" + rand + "X"; }
		
		return coupon;
	}
	
	private int getCheckSum(int sum) {
		
		if (sum % 11 == 0) { checkSum = 0; }
		
		else { checkSum = 11 - (sum % 11);	}
		
		return checkSum;
			
	}

	private String getRandom() {
		
		String s = "";
		
		for(int i = 0; i < 5; i++) {
			
			int r = (int) (Math.random() * 36) ;
			
			s = s + alphanums.charAt(r);
			
			if(i % 2 == 0) { sum += alphanums.charAt(r); }
			
		}
		
		return s;
		
	}

}