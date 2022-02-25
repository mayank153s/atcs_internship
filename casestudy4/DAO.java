package com.ac.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class DAO {

	public int addBook(Book book) 
	  {	  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  {  
			  con=BookDB.getConnection(); 
			 
			  String ins_str = "insert into product values(?,?,?,?)";
			 
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,book.getBookId());
			  pstmt.setString(2,book.getBookTitle());
			  pstmt.setFloat(3,book.getBookPrice());
			  pstmt.setString(4,book.getBookGrade());
			  int updateCount = pstmt.executeUpdate();  //16,
			       //17.
			  con.close();
			  return updateCount; //18
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	  }
	 // Below method, Search by ID Module.    
	  public ArrayList getBookDetailsById(int bookId)
				throws Exception
				{
					Connection con = null;
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					
					con = BookDB.getConnection();
					
			    String sel_str ="Select producttitle,productprice from product where productId=?";
					  
					  
					  pstmt = con.prepareStatement(sel_str);
					  pstmt.setInt(1,bookId);
					  rs = pstmt.executeQuery();
					  
					  ArrayList result = new ArrayList();
					  if(rs.next())
					  {
						  result.add(rs.getString(1));
						  result.add(rs.getString(2));
						  
					  }
					  else
					  {
						  result.add("Invalid Id");
					  }
					  return result;
					
				}

}
