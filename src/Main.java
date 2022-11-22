import java.util.HexFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj imie");
        String name=scanner.nextLine();

        System.out.println("podaj wiek");
        int age=scanner.nextInt();
        System.out.println("czesc mam na imie"+name+"mam"+age);
    }
}


