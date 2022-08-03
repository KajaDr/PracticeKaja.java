package powtorka29Tydzien;

import java.util.Scanner;

public class MartaZadania {
    //zad1
    // od 1 do 50 wyswietl tyk=lko te które nie są parzyste( raz for raz while)

    public void uruchom() {
        // zad1();
        //zad2();
        zad5();
    }

    private void zad1() {
        System.out.print("for\n");
        for (int liczba = 1; liczba <= 50; liczba++) {
            if (liczba % 2 == 0) {
                System.out.println(liczba);
            }
        }
        System.out.println("while");

        int liczba = 0;
        while (liczba <= 50 && liczba % 2 == 0) {
            System.out.println(liczba++);
            liczba++;
        }
    }

    //zad2
    // WYswietl liczby od 1 do 100 ale:
    //podzielne przez 3 -> "liczba podzielna przez 3"
    //podzielne przez 5 -> "liczba podzielna przez 5"
    //podzielne przez 3 i 5 -> "liczba podzielna przez 3 i 5"

    private void zad2() {
        int liczba = 1;
        for (liczba = 1; liczba <= 100; liczba++) {
            if (liczba % 3 == 0 && liczba % 5 == 0) {
                System.out.println(liczba + "liczba podzielna przez 5 i 3");
            } else if (liczba % 5 == 0) {
                System.out.println(liczba + "liczba podzielna przez 5");
            } else if (liczba % 3 == 0) {
                System.out.println(liczba + "liczba podzielna przez 3");
            }
        }
        int num1 = 0;
        System.out.println("WHile");
        while (num1 % 2 == 0 && num1 < 10) {
            System.out.println(num1);
            num1++;
        }

    }


    //zad3
    //SWITCH czy podana ręcznie zmienna to 1 czy 5
    // jesli 1 "liczba 1"
    //jeśli 5 "liczba 5"
    // "to nie 1 ani 5"

    public void zad3(Integer liczba) {
        switch (liczba) {
            case 1:
                System.out.println("liczba 1");
                break;
            case 5:
                System.out.println("liczba 5");
                break;
            default:
                System.out.println("to nie 1 ani 5");
        }
    }

    //zad 4
    //program który napisze to bylo banalne

    private void zad4(){
        int i=0;
        while (i<5){
            System.out.println("to było proste");
            i++;
        }
        System.out.println("for");
        for (i=0;i<5;i++){
            System.out.println("to było proste");
        }
    }
    //zadanie 5
    // Do while - 10 razy " umiem w petle

    private void zad5(){
        int n=0;
        do {
            System.out.println("petla " + n);
            n++;
        }
        while (n<10);
        System.out.println("koniec");
    }

    //zadanie6
    // pet;a ltpra wprowadza *** zaleznie od tego ile wproawdzi użytkownik
    public void zad6() {
        System.out.println("ile pokazac gwiazdek?");
        Scanner scanner = new Scanner(System.in);
        Integer n=scanner.nextInt();

        Integer i=0;
       for(i=0; i<n;i++)
            System.out.print("*");
        }
}


