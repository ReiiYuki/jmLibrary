/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author narissingngam
 * @author Tanasorn Tritawisup
 */
public class signup {
    
    public static String DATA = "src/book/user.txt";
    public static String data = "book/user.txt";
    
    public static void write(String usr, String pwd) throws FileNotFoundException {
        try {
            FileOutputStream os = new FileOutputStream(DATA,true);
            
            os.write(usr.getBytes());
            os.write(";".getBytes());
            os.write(pwd.getBytes());
            os.write(";".getBytes());
            os.write("\n".getBytes());
            os.close();
                    
                    
                    
        } catch (IOException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    public static String readFile() throws FileNotFoundException, IOException{
  
        
        File file = new File("src/book/user.txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String read = "";
        String line = "";
              
              while((line = bf.readLine()) != null){
                  read += line + "\n";
              }
              bf.close();
        

         return read;

     }
    
    public static boolean find(String read, String ur, String pw){
            Scanner sc = new Scanner(read);
            String user = "";
	    String pass = "";
            
		while(sc.hasNextLine()) {
		    String line = sc.nextLine();                   
		    user = line.split(";")[0].trim();
                    if(user.equals(ur)) {
                        pass = line.split(";")[1].trim();
                        if(pass.equals(pw)){
                            return true;
                        }
                    }
	            
                    
		}
                return false;
    }
    
    
    
}
    
    
 

