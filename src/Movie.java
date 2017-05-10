public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    }
	double getCharge(int daysRent) {
		double result = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRent > 2)
				result += (daysRent - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRent * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRent > 3)
				result += (daysRent - 3) * 1.5;
			break;
		}
		return result;
	}
	int getFrequentRenterPoints(int daysRent) {
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRent > 1)
			return 2;
		else
			return 1;
	};
}