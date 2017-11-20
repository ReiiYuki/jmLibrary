/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class function {

	
	static Scanner scan = new Scanner(System.in);
	
	static String book;
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void borrow(String book){
                if (list.contains(book)) {
		     System.out.printf("This book are borrowed!");
		} 
		list.add(book);
		SimpleDateFormat sdf = new SimpleDateFormat("dd:M:yyyy");
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DATE, +14);
		System.out.println("please return in " + sdf.format(calendar.getTime()));
		System.out.print("Thank you");
	}
	
	public static void back(String book){
		list.remove(book);
		System.out.println("the book are returned.");
		System.out.print("Thank you");
	}


}

