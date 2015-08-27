
public class CouponTesting {
	
	public static void main(String[] args) {
		
		CouponGenerator2 couponGen = new CouponGenerator2(); 
		CouponChecker2 couponChecker = new CouponChecker2();
		
		String coupon1 = couponGen.getCoupon();
		
		String coupon2 = "AXGJY9Y7";
		
		System.out.println(coupon1 + " is " + couponChecker.checkCoupon(coupon1));
		
		System.out.println(coupon2 + " is " + couponChecker.checkCoupon(coupon2));
		
	}

}
