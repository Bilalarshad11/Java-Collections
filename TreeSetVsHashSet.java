/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeset.vs.hashset;
import java.util.HashSet; 
import java.util.TreeSet;
/**
 *
 * @author Bilal Arshad
 */
public class TreeSetVsHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("1"); 
        hset.add("2"); 
        hset.add("3"); 
        hset.add("4"); 
  
        // Duplicate removed 
        hset.add("1"); 
        
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 
        
        //For TreeSet
         // Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("a"); 
        tset.add("b"); 
        tset.add("c"); 
        tset.add("d"); 
  
        // Duplicate removed 
        tset.add("a"); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
    }
    
}
