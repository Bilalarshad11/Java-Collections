/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//For HashSet
package hashset.vs.sortedset;
import java.util.HashSet; 

//For SortedSet
import java.util.SortedSet;
import java.util.TreeSet; 
/**
 *
 * @author Bilal Arshad
 */
public class HashSetVsSortedSet {

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
            
            
            
            
        // Create a TreeSet and inserting elements 
        SortedSet<String> sites = new TreeSet<>(); 
        sites.add("a"); 
        sites.add("b"); 
        sites.add("c"); 
        sites.add("d"); 
  
        System.out.println("Sorted Set: " + sites); 
        System.out.println("First: " + sites.first()); 
        System.out.println("Last: " + sites.last()); 
  
        // Getting elements before quiz (Excluding) in a sortedSet 
        SortedSet<String> beforec = sites.headSet("c"); 
        System.out.println(beforec); 
  
        // Getting elements between code (Including) and  
        // practice (Excluding) 
        SortedSet<String> betweendAndb = 
                                  sites.subSet("d","b"); 
        System.out.println(betweendAndb); 
  
        // Getting elements after code (Including) 
        SortedSet<String> aftera = sites.tailSet("a"); 
        System.out.println(aftera); 
            
            
        } 
    }
    
}
