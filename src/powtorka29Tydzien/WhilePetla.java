package powtorka29Tydzien;

import java.util.ArrayList;
import java.util.Scanner;

public class WhilePetla {

    public void petla(){
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("podaj ilosc objektow w liscie");
        Scanner scanner1 = new Scanner(System.in);
        Integer number= Integer.valueOf(scanner1.nextLine());

        int i = 0;
        while (i<number){
            System.out.println("podaj liczbę nr" + (i+1));
            Scanner scanner = new Scanner(System.in);
            Integer pierwsze= Integer.valueOf(scanner.nextLine());
            lista.add(Integer.valueOf(pierwsze));
            i++;
        }
        System.out.println(lista);

        for (Integer pierwsza:lista) {
            if (pierwsza<5) {
                System.out.println("mniejsze od 5 > " + pierwsza);
            }else{
                System.out.println("wieksze od 5 < " + pierwsza);

        }
    }

    }
}
