/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.vs.vector;

// Java Program to illustrate use of ArrayList 
// and Vector in Java 
import java.io.*; 
import java.util.*;
/**
 *
 * @author Bilal Arshad
 */
public class ArrayListVsVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creating an ArrayList 
        ArrayList<String> al = new ArrayList<String>(); 
  
        // adding object to arraylist 
        al.add("First Element"); 
        al.add("Second Element"); 
        al.add("Third Element"); 
        
  
        // traversing elements using Iterator' 
        System.out.println("ArrayList elements are:"); 
        Iterator it = al.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
  
        // creating Vector 
        Vector<String> v = new Vector<String>(); 
        v.addElement("First Element"); 
        v.addElement("Second Element"); 
        v.addElement("Third Element"); 
  
        // traversing elements using Enumeration 
        System.out.println("Vector elements are:"); 
        Enumeration e = v.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement()); 
    } 
 }
    

