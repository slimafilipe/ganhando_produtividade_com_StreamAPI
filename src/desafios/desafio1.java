package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio: Criar um rograma que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */
public class desafio1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> ordemCrescente = numeros.stream()
                .sorted()
                .toList();

        System.out.println(ordemCrescente);
    }
}
