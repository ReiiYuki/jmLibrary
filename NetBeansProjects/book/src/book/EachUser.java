/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author narissingngam
 * @author Tanasorn Tritawisup
 */
public class EachUser {
    private String user;
 private String pwd;

 public EachUser(String name, String pass) {
  user = name;
  pwd = pass;
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
