
public class CouponGenerator1 {

	
	public static String getCoupon() {
		
		String rand = getRandom();
		
		int checkSum = getCheckSum(rand);
		
		String s = "AX" + rand + checkSum;
		
		return s;
	}
	
	private static int getCheckSum(String s) {
		
		int r = Integer.parseInt(s);
		
		int sum = 0;
		
		int checkSum;
		
		for(int i = 0; i < 6; i++) {
			
			int x = r % 10;
			
			sum  += x;
			
			r = r /10;
			
		}
		
		
		if( sum % 11 == 0) {
			
			checkSum = 0;	
		}
		
		else {
			
			checkSum = 11 - (sum % 11);		
		}
		
		
		return checkSum;
	}

	public static String getRandom() {
		
		String s = "";
		
		for (int i = 0 ; i < 6; i++) {
			
			int r = (int) (Math.random() * 10);
			
			s = s + r;
			
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getCoupon());
		

	}

}
