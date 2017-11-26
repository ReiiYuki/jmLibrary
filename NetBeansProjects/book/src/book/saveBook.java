/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author narissingngam
 */
public class saveBook {

     public static void saveBook(String name, String book, Calendar cal){
        try {
             
        File file = new File("src/book/book.txt");
        
        FileOutputStream ou = new FileOutputStream(file,true); 
              
        ou.write(name.getBytes());
        ou.write(";".getBytes());
        ou.write(book.getBytes());
        ou.write(";".getBytes());
        ou.write(cal.toString().getBytes());
        ou.write("\n".getBytes());
        ou.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
 
//        File file = new File("src/book/book.txt");
//        
//        FileOutputStream ou = new FileOutputStream(file,true); 
//        ou.write();        
     }    
     
     static final String FILE = "src/book/book.txt";
     
     public static void readBook(){
         ClassLoader loader = saveBook.class.getClassLoader();
         InputStream input = loader.getResourceAsStream(FILE);
         
         Scanner sc = new Scanner(input);

		String book = "";
		
		while(sc.hasNextLine()){
			book += sc.nextLine() + "\n";
			
		}
		sc.close();
     }
     
}
