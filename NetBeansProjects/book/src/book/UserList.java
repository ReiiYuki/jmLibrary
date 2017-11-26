/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author narissingngam
 */
public class UserList {
     static List<EachUser> workers = new ArrayList<>();
 private final static File usertext = new File("src/Texts/User.txt");

 /**
  * import all users from text file and collect in the list
  */
 public static void setUser() throws FileNotFoundException {
  usertext.getParentFile().mkdirs();
  Scanner search = new Scanner(usertext);
  while (search.hasNextLine()) {
   String phrase = search.nextLine().trim();
   String[] user = phrase.split(";");
   workers.add(new EachUser(user[0], user[1]));
  }
  search.close();
 }

 /**
  * return true if the @param match the username in the .txt
  */
 public static boolean getthatUser(String name) {
  for (int i = 0; i < workers.size(); i++) {
   if (workers.get(i).getUser().equals(name))
    return true;
  }
  return false;
 }

 /**
  * return true if the @param match the password in the .txt
  */
 public static boolean getthatPass(String pass) {
  for (int i = 0; i < workers.size(); i++) {
   if (workers.get(i).getPwd().equals(pass))
    return true;
  }
  return false;
 }

 /**
  * return list of user
  */
 public static String[] getlistofUser() {
  String[] names = new String[workers.size()];
  for (int i = 0; i < names.length; i++)
   names[i] = workers.get(i).getUser();
  return names;
 }

 /**
  * the @param are written out to the text file
  */
 public static void addUser(String name, String pass) throws IOException {
  usertext.getParentFile().mkdirs();
  BufferedWriter bw = new BufferedWriter(new FileWriter(usertext, true));
  bw.newLine();
  bw.close();
  resetUser();
 }
 /**
  * remove the user which match the @param
  */
 public static void removeUser(String name) throws IOException {
  for (int i = 0; i < workers.size(); i++) {
   if (workers.get(i).getUser().equals(name)) {
    workers.remove(i);
   }
  }
  usertext.getParentFile().mkdirs();
  BufferedWriter bw = new BufferedWriter(new FileWriter(usertext));
  for (int i = 0; i < workers.size(); i++) {
   bw.write(workers.get(i).getUser()+";"+workers.get(i).getPwd());
   bw.newLine();
  }
  bw.close();
  resetUser();
 }
 /**
  * remove the old users in the list
  * and adds the new ones from the text
  */
 private static void resetUser() throws FileNotFoundException{
  workers.removeAll(workers);
  UserList.setUser();
 }
 // public static void removeUser(String name) throws IOException {
 // File file = new File("src/Texts/Foods.txt");
 // Scanner scan = new Scanner(file);
 // BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
 // String phrase = scan.nextLine().trim();
 // while (scan.hasNextLine()) {
 // String[] user = phrase.split(";");
 // for (int i = 0; i < user.length; i++) {
 // if(user[i].equals(name)){
 // //replace old text
 // bw.write("\"\";\"\";\"\"");
 // }
 // }
 // }
 // bw.close();
 // scan.close();
 // }
 // String user = jTextField4.getText();
 // String pwd = new String(jPasswordField1.getPassword());
 // {
 // if ((pwd.length() == 0) && (user.length()) == 0) {
 // JFrame error = new JFrame("UserName and Password");
 // error.setSize(401, 401);
 // // error.setVisible(true);
 // // error.setDefaultCloseOperation(error.EXIT_ON_CLOSE);
 // JOptionPane.showMessageDialog(error, "Username and Password is empty");
 // }
 //
 // else if ((user.length()) == 0) {
 //
 // JFrame error = new JFrame("Username");
 // error.setSize(401, 401);
 // JOptionPane.showMessageDialog(error, "Username is empty");
 // }
 //
 // else if (pwd.length() == 0) {
 // JFrame error = new JFrame("Password");
 // error.setSize(401, 401);
 // JOptionPane.showMessageDialog(error, "Password is empty");
 // }
 // }
}
