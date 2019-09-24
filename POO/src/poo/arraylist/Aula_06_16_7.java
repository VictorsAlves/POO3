/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sort2
 * @author victor.salves5
 */
public class Aula_06_16_7 {
    public static void main(String[] args) {
        String [] suits = {"Hearts", "Diaamonds", "Clubs", "Spades"};
        // create and displau a list contaning the suits array elements
        List<String> list = Arrays.asList(suits); // create List
        System.out.printf("Unsorted arrau elements: %s%n", list);
        
        //sort in descending order using a comparator
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s%n", list);
    }
}
