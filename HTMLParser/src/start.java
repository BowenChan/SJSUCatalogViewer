import java.util.Scanner;

public class start {
	private final static String FALL_URL = "http://info.sjsu.edu/web-dbgen/soc-fall-courses/all-departments.html";
	private final static String SPRING_URL = "http://info.sjsu.edu/web-dbgen/soc-spring-courses/all-departments.html";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loopFlag = true;
		while(loopFlag){
			Scanner scan = new Scanner(System.in);
			//Ask user whether they would like the fall or spring course
			System.out.println("Would you like the fall course or spring course");
			String input = scan.next();
			input = input.toLowerCase();
			importHTML data;
			//switch case to determine the next step
			switch(input){
			case "fall":
				data = new importHTML(FALL_URL);
				loopFlag = false;
				break;
			case "spring":
				data = new importHTML(SPRING_URL);
				loopFlag = false;
				break;
			default:
				System.out.println("That is not one of the option");
			}
		}
	}

}
