
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App2806 {
    public static void main(String[] args){
        //es1();
        es2();
        //es3();
        //es4();
        //es5();
    }

    public static void es1(){  //parole che iniziano con A
        List<String> stringhe = Arrays.asList("Amaca", "Alessio", "Casa", "Auto", "PC", "Telefono");
        stringhe.stream()
        .filter(s-> s.startsWith("A"))
        .forEach(System.out::println);
    }

    public static void es2() {     //da il quadrato di questi numeri
        List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> quadrati = numeri.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());
        quadrati.forEach(System.out::println);
    }
    
    public static void es3(){   //primo numeri pari
        List<Integer> num= Arrays.asList(1,3,5,8,10,13);
        Optional<Integer> primoPari=num.stream()
        .filter(n-> n%2==0)
        .findFirst();
        if (primoPari.isPresent()) {
            System.out.println("Il primo numero pari è: " + primoPari.get());
        } else {
            System.out.println("Nessun numero pari trovato");
        }
    }

    public static void es4(){    //somma elementi in lista di numeri decimali
        List<Double> numDem= Arrays.asList(1.2,3.4,5.6,7.8,9.2);
        double somma = numDem.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("La somma degli elementi è: " + somma);
    }

    public static void es5(){    //nomi ordinata in ordine alfabetico inverso
        List<String> nomi=Arrays.asList("Claudia","Gerardo","Maurizio","Sara");
        List<String> nomiOrdinati= nomi.stream()
        .sorted((n1,n2)->n2.compareTo(n1))
        .collect(Collectors.toList());

        nomiOrdinati.forEach(System.out::println);
    }
}



