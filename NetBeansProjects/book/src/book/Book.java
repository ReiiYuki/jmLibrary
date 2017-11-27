/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author narissingngam
 * @author Tanasorn Tritawisup
 */
public class Book {

     public static void saveBook(String name, String book, String date){
        try {
             
        File file = new File("src/book/book.txt");
        
        FileOutputStream ou = new FileOutputStream(file,true); 
                
        ou.write(book.getBytes());
        ou.write(";            ".getBytes());
        ou.write(date.getBytes());
        ou.write(";            ".getBytes());
        ou.write(name.getBytes());
        ou.write(";\n".getBytes());
        ou.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
 
     }    
     
     public static void remove(String name) throws FileNotFoundException{
         File FILE = new File("src/book/book.txt"); 
         String file = new String("book/book.txt");
         ClassLoader loader = Book.class.getClassLoader();
         InputStream in = loader.getResourceAsStream(file);
         
         Scanner scan = new Scanner(in);
         
         ArrayList<String> list = new ArrayList<String>();
         String line = "";
         
         while(scan.hasNextLine()){
             line = scan.nextLine();
             if(line.startsWith(name)) continue;
             list.add(line);
         }
         
         FileOutputStream ou = new FileOutputStream(FILE);
         
         for(String temp : list) {
             try {
                 ou.write((temp + "\n").getBytes());
                 
             } catch (IOException ex) {
                 Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         
     }
     
     
     
     
     public static String FILE = "book/book.txt";
        
     public static String readBook(){
      
         
         ClassLoader loader = Book.class.getClassLoader();
         InputStream in = loader.getResourceAsStream(FILE);
         
         Scanner scan = new Scanner(in);

		String book = "";
		
		while(scan.hasNextLine()){
			book += scan.nextLine() + "\n";
			
		}
		scan.close();
                return book;        
                
     }
     
     
     
     public static boolean findBook(String read, String bk){
        Scanner sc = new Scanner(read);
            String book = "";
	    String date = "";
            String user = "";
            
		while(sc.hasNextLine()){
		    String line = sc.nextLine();                   
		    book = line.split(";")[0].trim();
                    if(book.equals(bk)){
                        return true;
                    }
//                    date = line.split(";")[1].trim();
//                    user = line.split(";")[2].trim();                   
		}
            return false;
    }
     
     public static boolean findDate(String read, String day){
        Scanner sc = new Scanner(read);
            String book = "";
	    String date = "";
            String user = "";
            
		while(sc.hasNextLine()){
		    String line = sc.nextLine();                   
		    book = line.split(";")[0].trim();
                    date = line.split(";")[1].trim();
                    if(date.equals(day)){
                        return true;
                    }
                    user = line.split(";")[2].trim();
	                             
		}
            return false;
    }

    static void setText(String dd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
     
     
     
     
}
