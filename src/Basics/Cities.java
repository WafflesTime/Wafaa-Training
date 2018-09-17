package Basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities= {"Auckland", "Christchurch", "Wellington", "Hamilton", "Dunedin"};
		
		for(int i=0;i<cities.length; i++) {
			
			System.out.println(cities[i]);
			
		}
		
		String countries[] = new String[4];
		countries[0] = "New Zealand";
		countries[1] = "Australia";
		countries[2] = "France";
		countries[3] = "Spain";
		
		System.out.println("..........Countries...........");
		int y = 0;
		
		while (y<countries.length) {
			System.out.println(countries[y]);
			y++;
		}
	}

}
