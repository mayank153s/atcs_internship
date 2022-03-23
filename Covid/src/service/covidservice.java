package service;

import dao.covidao;

public class covidservice {
	 public int addcovidservice(int iso_code, String location,String continent, int new_cases, int total_cases)
		
	{
			//making conditions
			String zone="";
			if( new_cases <= 100) {
				zone="green zone";		
			}
			else if(new_cases < 200) {
				zone="Yellow zone";
			}
			else if (new_cases < 300){
				zone="orange zone";
			}
			else {
				zone="red zone";
			}
			//objects
			
			System.out.println(zone);
			covidao Cdao = new covidao();
			
			covid Covid =new covid();
			   
			
			Covid.setIso_code(iso_code);
			Covid.setLocation(location);
			Covid.setContinent(continent);
			Covid.setNew_cases(new_cases);
			Covid.setTotal_cases(total_cases);
			Covid.setZone(zone);
			
			
			int updateResult =0;
			try {
			updateResult=Cdao.addCovid(Covid);
			return updateResult;
			}
			catch (Exception e) {
				System.out.println(e.toString());
				return 0;
			}
			
			
		}

		
	}
	
		
		
		
		
		
		
		
		
		
		
		
