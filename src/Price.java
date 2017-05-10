
abstract class Price {
	abstract int getPriceCode();

	double getCharge(Movie movie, int daysRent) {
		double result = 0;
		switch (movie.getPriceCode()) {
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
}

class ChildrensPrice extends Price {
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
}

class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price {
	int getPriceCode() {
		return Movie.REGULAR;
	}
}