package poo.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author victor.salves5
 */
public class Aula_06_16_2 {
    public static void main(String[] args) {
        // Adiciona Elementos no Array
        String[] colors = {"Magenta","Red","white","Blue","Cyan"};
        List<String> list = new ArrayList<String>();
    
        for (String color : colors) {
            list.add(color); // add cores no fim da lista
        }
        // add elementos no array removeColors que serao removidos da lista
        String [] removeColors = {"Red","White","Blue"};
        List<String> removeList = new ArrayList<String>();
        
        for (String color : removeColors) {
            removeList.add(color);
        }
        //Conteudo da lista de saida
        System.out.println("ArrayList: ");
        
        for (int i = 0; i < list.size(); i++) {
            
            System.out.printf("%s", list.get(i));
        
        }
        //
// remove da lista os detalhes contidos em removeList
removeColors(list, removeList);

// conteudo da lista de saida
System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String color : list) {
            System.out.printf("%s", color);
        }
// remove cores especificadas na coleção2 da coleção1

    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
    
    // get iterator
    Iterator<String> iterator = collection1.iterator();
    // loop enquanto collection tem itens
    
    while(iterator.hasNext()){{
        
        if(collection2.contains(iterator.next())){
        iterator.remove(); // remove o elemento atual
        }
        
        
    }}
    }
}
