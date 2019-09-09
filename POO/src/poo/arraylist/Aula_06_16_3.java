package poo.arraylist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author victor.salves5
 */
public class Aula_06_16_3 {
    public static void main(String[] args) {
          // add elementos de cor na list1
       String[] colors = {"black","yellow","green","blue","violet","silver"};

       List<String> list1 = new LinkedList<>();
      
        for (String color : colors) {
            list1.add(color);
        }
       
       
    // add elementos de cor na list2
    String [] colors2 = {"gold","white","brown","blue","gray","silver"};
   List<String> list2 = new LinkedList<>();
        for (String color : colors2) {
            list2.add(color);
        }
    list1.addAll(list2);// concatena listas
    list2 = null; // libera recursos
    printList(list1);// imprime elementos da list1
    
    
    convertToUpperCaseString(list1); // converte para uppercase as strings
    printList(list1);// imprime elementos da list1
    
        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1,4,7); // remove items 4-6 da lista
        printList(list1); // imprimeos elementos da list1
        printReversedList(list1);// imprime a lista em ordem reversa
        
        
        
        
        
        
        
        
    }

    private static void printList(List<String> list) {
     
        System.out.printf("%nlist:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
            System.out.println();
    
    
    }

    private static void convertToUpperCaseString(List<String> list) {
   ListIterator<String> iterator = list.listIterator();
    
   while(iterator.hasNext()){
   
   String color = iterator.next(); // pega item
   iterator.set(color.toUpperCase());// convert para upper case
   }
    
    
    }

    private static void removeItems(List<String> list, int start, int end) {
 list.subList(start, end).clear();
    
    }

    private static void printReversedList(List<String> list) {
  ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");
    
        // imprime lista em ordem reversa
        while (iterator.hasPrevious()){
            System.out.printf("%s",  iterator.previous());
        }
        
    }
    
    
    
    
    
}
