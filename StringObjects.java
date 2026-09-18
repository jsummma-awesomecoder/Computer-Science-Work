/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringobjects;

/**
 *
 * @author jsumma2027
 */
public class StringObjects {

   
   
   
    public static void main(String[] args) {
        //Setting my name equal to a string
        String name = "Mac Summa";
        System.out.println("My name is \"" + name + "\"");
        System.out.println("My name length is " + name.length());
        System.out.println("My name in upper case is \"" + name.toUpperCase() + "\"");
        System.out.println("My name in lower case is \"" + name.toLowerCase() + "\"");
        System.out.println("The first letter in my name is \"" + name.charAt(0) + "\"");
        System.out.println("The last letter in my name is \"" + name.charAt(name.length() - 1) + "\"");
        System.out.println("The index of the space between the names is " + name.indexOf(" "));
    }
       
    }
