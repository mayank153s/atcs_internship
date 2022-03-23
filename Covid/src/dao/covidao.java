package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import service.covid;

public class covidao {

		private static final int Iso_code = 0;
		public int addCovid(covid Covid) {
			Connection con=null;
			PreparedStatement psmt=null;
			try {
			 con=covidb.getConnection();
			 String ins_str="insert into covid values(?,?,?,?,?,?)";
			 psmt=con.prepareStatement(ins_str);
			 psmt.setInt(1,Covid.getIso_code());
			 psmt.setString(2,Covid.getLocation());
			 psmt.setString(3,Covid.getContinent());
			 psmt.setFloat(4,Covid.getNew_cases());
			 psmt.setLong(5,Covid.getTotal_cases());
			 psmt.setString(6,Covid.getZone());
			 int updateCount=psmt.executeUpdate();
			 
			 con.close();
			 return updateCount;
			}
			catch (Exception e) {
				System.out.println(e.toString());
				return 0;
			}
			
		}
	    public ArrayList getBookDetailsById(int bookId) throws SQLException {
	    	Connection con=null;
			PreparedStatement psmt=null;
			ResultSet rs =null;
			con=covidb.getConnection();
			System.out.println(con);
			String sel_str="select location,new_cases from covid where iso_code=?";
			       
			psmt=con.prepareStatement(sel_str);
			psmt.setInt(1,Iso_code);
			rs=psmt.executeQuery();
			
			ArrayList<String> result=new ArrayList();
			if(rs.next()) {
				result.add(rs.getString(1));
				result.add(rs.getString(1));
			}else
			{
				result.add("invaild iso_code");
			}
	           return result;
	           
	    
	    }
	}
