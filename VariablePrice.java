
public class VariablePrice {
	
	private static double basePrice, finalPrice;

	private static double stepPrice;
	
	private static  double noOfSeats,seatsFilled, occupancyRatio, daysTillJourney, daysFactor;
	
	public static double getPrice() {
		
		occupancyRatio = 1.0 * seatsFilled / noOfSeats;
		
		daysFactor = 1.0 - ( daysTillJourney / 100) ;
		
		finalPrice = basePrice + (occupancyRatio * stepPrice) + (daysFactor * stepPrice);
		
		return finalPrice;
	}
	
	public static void main(String[] args) {
		
		noOfSeats = 100;
		seatsFilled = 10;
		daysTillJourney = 50;
		basePrice = 1000;
		stepPrice = 250;
		
		System.out.println("no of seats: " + noOfSeats);
		System.out.println("seats Filled: " + seatsFilled);
		System.out.println("days Till Journey: " + daysTillJourney);	
		getPrice();
		System.out.println("occupancyRatio: " + occupancyRatio);
		System.out.println("daysFactor: " + daysFactor);
		System.out.println("extra price due to occupancy factor: " + occupancyRatio * stepPrice);
		System.out.println("extra price due to days factor: " + daysFactor * stepPrice);
		
		System.out.println();
		System.out.println("Final Price: " + getPrice());
		
		
		
	}

}























