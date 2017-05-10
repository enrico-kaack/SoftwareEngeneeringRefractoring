import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String result = "Welcome to the Movie Store\n";
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        result += "Let's get the Statement\n";
        result += c1.statement();
        

        String expected = "Welcome to the Movie Store\n"
        			+ "Let's get the Statement\n"
        			+ "Rental Record for joe\n"
        			+ "\tmovie1\t30.0\n"
        			+ "\tmovie2\t4.5\n"
        			+ "Amount owed is 34.5\n"
        			+ "You earned 3 frequent renter points";
        		
        		
        assertEquals("Out correct", expected, result);
	}

}
