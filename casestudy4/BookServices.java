package com.ac.service;

public class BookServices {

	public int addbookService(int bookId, String bookTitle, float bookPrice) {
		
		String grade="";
		 if(bookPrice <= 300)
		 {
			 grade = "C";
		 }
		 else if(bookPrice <= 600)
		 {
			 grade = "B";
		 }
		 else
		 {
			 grade = "A";
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
