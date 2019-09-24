package poo.arraylist;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author victor.salves5
 */
public class Aula_06_16_6 {
    public static void main(String[] args) {
        String [] suits = {"Hearts", "Diamonds","clubs","Spades"};
        // create and display a list containing suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);
        
        Collections.sort(list); //sort Arraylist
        
        System.out.printf("Sorted array elements: %s%n", list);
        
    }
}
