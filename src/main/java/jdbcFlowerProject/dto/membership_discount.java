package jdbcFlowerProject.dto;

public class membership_discount {
	private String membership_title;
	private String discount_rate;
	
	public membership_discount() {
		
	}

	public membership_discount(String membership_title, String discount_rate) {
		super();
		this.membership_title = membership_title;
	}

	/**
	 * @return the membership_title
	 */
	public String getMembership_title() {
		return membership_title;
	}

	/**
	 * @param membership_title the membership_title to set
	 */
	public void setMembership_title(String membership_title) {
		this.membership_title = membership_title;
	}

	/**
	 * @return the discount_rate
	 */
	public String getDiscount_rate() {
		return discount_rate;
	}

	/**
	 * @param discount_rate the discount_rate to set
	 */
	public void setDiscount_rate(String discount_rate) {
		this.discount_rate = discount_rate;
	}

	@Override
	public String toString() {
		return String.format("membership_discount [membership_title=%s, discount_rate=%s]", membership_title,
				discount_rate);
	}
	
	
	
	
	
	
	

}