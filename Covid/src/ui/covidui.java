package ui;

import java.util.Scanner;

import service.covidservice;

public class covidui {
	
		public static void main(String[] args) {
			
			int iso_code;
			String location;
			String continent;
			int new_cases=0;
			int total_cases=0;
		    
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the iso_code");
					iso_code=sc.nextInt();
				System.out.println("Enter the location");
					location=sc.next();
				System.out.println("Enter the continent");
					 continent = sc.next();
			    System.out.println("Enter new cases");
					new_cases=sc.nextInt();
				System.out.println("Enter total cases");
					total_cases=sc.nextInt();
					
		    covidservice Covidservice = new covidservice();
		    int updateCount = Covidservice.addcovidservice(iso_code, location, continent, new_cases, total_cases);
		    	System.out.println("inserted   "+updateCount+"   record success");
	  
			}catch (Exception e) {
			    System.out.println(e.toString());
			}
		}
	}

