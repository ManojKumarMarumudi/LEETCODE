import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_Expression {
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("Manoj");
		Matcher matcher = pattern.matcher("student with regd no 20pa1a0597 name is Manoj");
		boolean matcher_found= matcher.find();
		
		if(matcher_found){
			System.out.println("match found");
		}else {
			System.out.println("match not found");
		}
	}
}
