package RExpression;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
public class DateandTime {
	public static void main(String[] args) {
	    LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    LocalTime myObj1 = LocalTime.now();
	    System.out.println(myObj1);

	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	  }
 }

