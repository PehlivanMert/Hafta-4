import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Nullable<Integer> a = new Nullable(30);
        a.run();
        Nullable<String> b = new Nullable<>("Mert");
        b.run();


        System.out.println("------------------------------------");
        System.out.println("------------------------------------");


        Integer c = 10;
        String d = "Mert";
        double e = 2.14;

        Test <Integer,String,Double> m = new Test <> (c,d,e);

        m.showInfo();


        System.out.println("   ----------------------");
        System.out.println("   ----------------------");


        String [] kelime = {"Mert" , "Pehlivan" , "Rabia" , "1234"};
        Integer [] rakam = {1,2,3,4};

        for (String i : kelime) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : rakam) {
            System.out.print(i + "-");
      }
        Print.printArray(kelime);
        System.out.println();
        Print.printArray(rakam);*/

/*
        Student<String> student = new Student<>();
        student.insert("abc");*/


        // Bu fonksiyon çağrısını burada tut
        Scanner s = new Scanner(System.in);

        System.out.print(LetterCapitalize(s.nextLine()));



    }

    public static String LetterCapitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}