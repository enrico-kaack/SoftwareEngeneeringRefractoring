public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;

	public Movie(String newtitle, int newpriceCode) {
		title = newtitle;
		setPriceCode(newpriceCode);
		;
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	private Price _price;

	public String getTitle() {
		return title;
	}

	/**
	 * @deprecated Use {@link Price#getCharge(Movie,int)} instead
	 */
	double getCharge(int daysRent) {
		return _price.getCharge(daysRent);
	}

	/**
	 * @deprecated Use {@link Price#getFrequentRenterPoints(Movie,int)} instead
	 */
	int getFrequentRenterPoints(int daysRent) {
		return _price.getFrequentRenterPoints(daysRent);
	};
}