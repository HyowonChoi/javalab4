package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		this.discount = discount;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		this.discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** 援ы쁽 �븯�떆�삤 **/ 
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** 援ы쁽 �븯�떆�삤 **/ 
		//sysout
		return getPrice() * (1-discount/100);
		
	}
	
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		this.discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** 援ы쁽 �븯�떆�삤 **/ 
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			DiscountSale otherSale = (DiscountSale) otherObject;
			return (discount == otherSale.discount);
		}	
	}
	
	
	public DiscountSale clone() {
		/** 援ы쁽 �븯�떆�삤....  �엫�떆�깮�꽦�옄 �궗�슜 **/ 
	
		return new DiscountSale(this);
	}
}
