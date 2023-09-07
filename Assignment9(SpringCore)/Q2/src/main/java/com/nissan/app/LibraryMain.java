package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.model.LibraryMethods;
import com.nissan.model.LibraryPojo;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext iocContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibraryMethods libObj = iocContext.getBean("libraryImplementation", LibraryMethods.class);

		int choice = 0;
		char choice2 = 'y';
		int isbn;
		String title, author;

		while (true) {
			if (choice2 != 'y') {
				System.exit(0);
			}
			System.out.println(
					"1.Add a new book to the library. \n2.Retrieve the details of a book by its ISBN. \n3.List all the books in the library. \nEnter your desired action: ");
			choice = Integer.parseInt(in.next());
			switch (choice) {
			case 1:
				LibraryPojo obj = iocContext.getBean("LibraryPojo",LibraryPojo.class);
				System.out.println("Enter ISBN: ");
				isbn = Integer.parseInt(in.next());
				System.out.println("Enter title: ");
				title = in.next();
				System.out.println("Enter author: ");
				author = in.next();
				libObj.addBook(isbn, title, author,obj);
				System.out.println("Do you wish to continue?(y/n): ");
				choice2 = in.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter ISBN: ");
				isbn = Integer.parseInt(in.next());
				libObj.getBookDetails(isbn);
				System.out.println("Do you wish to continue?(y/n): ");
				choice2 = in.next().charAt(0);
				break;
			case 3:
				libObj.getAllBooks();
				System.out.println("Do you wish to continue?(y/n): ");
				choice2 = in.next().charAt(0);
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}

		}

	}

}
