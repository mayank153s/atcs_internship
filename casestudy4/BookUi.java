package com.ac.Ui;

import java.util.Scanner;

import com.ac.service.BookServices;

public class BookUi {

	public static void main(String[] args)   //1.
	{	int productId=0;
		String producttitle="";
		float productprice=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id");
			productId = s.nextInt();
			System.out.println("Enter Title");
			producttitle = s.next();	
			System.out.println("Enter price");
			productprice = s.nextFloat();
			BookServices bookService = new BookServices(); //2.
			   int updateCount = Service.addBookService(productId, producttitle, productprice); //3.
	  //.	20	
			System.out.println("inserted "+updateCount+" record   Success");
			//.21
	} //22

}
