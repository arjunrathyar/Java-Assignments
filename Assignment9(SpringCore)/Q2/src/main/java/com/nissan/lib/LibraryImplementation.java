package com.nissan.lib;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nissan.model.LibraryMethods;
import com.nissan.model.LibraryPojo;

//@Scope()
@Component
public class LibraryImplementation implements LibraryMethods {

	private static ArrayList<LibraryPojo> library = new ArrayList<>();
	Scanner in = new Scanner(System.in);

	/*
	 * //LibraryPojo libObj = new LibraryPojo(); LibraryPojo libObj;
	 * 
	 * @Autowired public LibraryImplementation(LibraryPojo libObj) { // TODO
	 * Auto-generated constructor stub this.libObj = libObj; }
	 */

	@Override
	public void addBook(int iSBN, String title, String author, LibraryPojo obj) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (LibraryPojo a : library) {
			if (a.getISBN() == iSBN) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			obj.setAuthor(author);
			obj.setTitle(title);
			obj.setISBN(iSBN);
			library.add(obj);
		} else {
			System.out.println("ReEnter the details with a different ISBN!");
		}

	}

	@Override
	public void getBookDetails(int isbn) {
		// TODO Auto-generated method stub
		for (LibraryPojo a : library) {
			if (a.getISBN() == isbn) {
				System.out.println("Book ISBN: " + a.getISBN());
				System.out.println("Book Title: " + a.getTitle());
				System.out.println("Book Author: " + a.getAuthor());
			}
		}
	}

	@Override
	public void getAllBooks() {
		// TODO Auto-generated method stub
		for (LibraryPojo a : library) {
			System.out.println("Book ISBN: " + a.getISBN());
			System.out.println("Book Title: " + a.getTitle());
			System.out.println("Book Author: " + a.getAuthor());
		}
	}
}
