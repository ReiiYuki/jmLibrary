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
 * @author Tanasorn Tritawisup
 */
public class Book {

     public static void saveBook(String book, String status){
        try {
             
        File file = new File("src/book/book.txt");
        
        FileOutputStream ou = new FileOutputStream(file); 
           
        ou.write(book.getBytes());
        ou.write(";".getBytes());
        ou.write(status.getBytes());
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
     
     public static String FILE = "src/book/book.txt";
        
     public static void readBook(){
      
         
         ClassLoader loader = Book.class.getClassLoader();
         InputStream in = loader.getResourceAsStream(FILE);
         
         Scanner scan = new Scanner(in);

		String book = "";
		
		while(scan.hasNextLine()){
			book += scan.nextLine() + "\n";
			
		}
		scan.close();
                
                
     }
     
     
     
     
     
     
}
