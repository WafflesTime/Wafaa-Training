package Basics;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dayOfTheWeek = "Thursday";
		
		switch (dayOfTheWeek) {
		case ("Monday") : 
			System.out.println("Today is Monday");
			break;
		case ("Tuesday") : 
			System.out.println("Today is Tuesday");
			break;
		case ("Wednesday") : 
			System.out.println("Today is Wednesday");
			break;
		case ("Thursday") : 
			System.out.println("Today is Thursday");
		    break;
		case ("Friday") : 
			System.out.println("Today is Friday");
			break;
		case ("Saturday") : 
			System.out.println("Today is Saturday");
		case ("Sunday") : 
			System.out.println("Today is Sunday");
			break;
		}
		String month = "February";
		 
		 switch (month) {
		 case "January" :
		 System.out.println("Today is January");
		 case "February" :
		 System.out.println("Today is February");
		 case "March" :
		 System.out.println("Today is March");
		 break;
		 case "April" :
		 System.out.println("Today is April");
		 break;
		 case "May" :
		 System.out.println("Today is May");
		 break;
		 default : System.out.println("Error!");
		}
	}

}
