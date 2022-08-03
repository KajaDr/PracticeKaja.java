package powtorka29Tydzien;

import java.util.ArrayList;
import java.util.Scanner;

public class KajaZadanie {

    public void petla(Integer number){
        ArrayList<Integer> lista = new ArrayList<>();
        int i =0;
        for (i=0;i<number; i++ ){
            System.out.println("podaj liczbę nr" + i);
            Scanner scanner = new Scanner(System.in);
            Integer pierwsze= Integer.valueOf(scanner.nextLine());
            lista.add(Integer.valueOf(pierwsze));
        }
        System.out.println(lista);
    }
    public void petlaWhile(){
        System.out.println("podaj ilosc objektow w liscie");
        Scanner scanner1 = new Scanner(System.in);
        Integer number= Integer.valueOf(scanner1.nextLine());

        ArrayList<Integer> lista = new ArrayList<>();
        int i=0;
        while (i>5);
            System.out.println("podaj liczbę nr" + (i+1));
            Scanner scanner = new Scanner(System.in);
            Integer pierwsze= Integer.valueOf(scanner.nextLine());
            lista.add(Integer.valueOf(pierwsze));
            i++;
        }

}

