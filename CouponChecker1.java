
public class CouponChecker1 {
	
	public static void main(String[] args) {
		
		String s = CouponGenerator1.getCoupon();
		
		String t = "AX1234567";
		
		System.out.println(s + " is " + checkCoupon(s));
		
		System.out.println(t + " is " + checkCoupon(t));
		
	}

	public static boolean checkCoupon(String s) {
		
		s = s.substring(2);
		
		int r = Integer.parseInt(s);
		
		int sum = 0;

		for(int i = 0; i < 7; i++) {
			
			int x = r % 10;
			
			sum  += x;
			
			r = r /10;
			
		}
		
		if(sum % 11 == 0) {
			return true;
		}
		
		else {
			return false;
		}
		
	}

}
