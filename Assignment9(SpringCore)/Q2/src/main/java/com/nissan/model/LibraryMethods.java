package com.nissan.model;

public interface LibraryMethods {
	
	public void addBook(int iSBN, String title, String author, LibraryPojo obj);
	
	public void getBookDetails(int isbn);
	
	public void getAllBooks();

}
