/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Cezarino Hora
 */
public class ExemploPredicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(7);
        numeros.add(20);
        
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        
        // Remove números maiores que 10
        numeros.removeIf(maiorQueDez);
        
        System.out.println(numeros); // Saída: [5, 7]
        
    }
    
}
