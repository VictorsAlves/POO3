package poo.arraylist;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
/**
 * UsingToArray
 * @author victor.salves5
 */
public class Aula_06_16_4 {
    public static void main(String[] args) {
        String [] colors = {"black", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        
        links.addLast("red"); // add as ultimo item
        links.add("pink"); // add no final 
        links.add(3,"green"); // add no index 3
        links.addFirst("cyan"); // add como primeiro item 
        
        //obter elementos LinkedList como uma matriz
        colors = links.toArray(new String [links.size()]);
        System.out.println("colors");
        
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
