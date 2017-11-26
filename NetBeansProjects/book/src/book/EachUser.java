/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author narissingngam
 */
public class EachUser {
    private String user;
 private String pwd;

 public EachUser(String name, String pass) {
  user = name;
  pwd = pass;
 }

    EachUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 /**
  * return user's name
  */
 public String getUser() {
  return user;
 }
 /**
  * return user's password
  */
 public String getPwd() {
  return pwd;
 }
 
}
