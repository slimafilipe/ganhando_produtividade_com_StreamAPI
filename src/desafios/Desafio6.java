package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);



       long maiorQue10 =  numeros.stream().filter(n -> n > 10).count();
        System.out.println("Quantidade de números maior de 10: " + maiorQue10 );
    }
}
