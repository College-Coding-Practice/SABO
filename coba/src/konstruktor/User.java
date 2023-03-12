/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author hp
 */
public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
        this.username=username;
        this.password=password;
    }
    
}
class DemoConstructor{
    public static void main(String[]args){
        User petani = new User("petanikode", "kopi");
        System.out.println("Username:"+petani.username);
        System.out.println("Password:"+petani.password);
    }
}
