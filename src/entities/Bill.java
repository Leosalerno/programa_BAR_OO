package entities;

public class Bill {
	public static final int BEER_PRICE = 5;
	public static final int SODA_PRICE = 3;
	public static final int BARBECUE_PRICE = 7;
	
	public int beer;
	public int barbecue;
	public int soft_drink;
	public char gender;
	
	public double feeding() {
		return (beer * BEER_PRICE) + (barbecue * BARBECUE_PRICE) + (soft_drink * SODA_PRICE);
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double total() {
		return ticket() + feeding() + cover();
	}
	
}
