package menuswitch;
 
import java.io.IOException;
import java.util.Scanner;
 
public class MenuSwitch {
 
    public static int suma(int a, int b){
        return a+b;
    }
  public static int roznica(int x, int y){
        return x-y;
    }
    public static double sinus(int n){
        return Math.sin(n);
    }
  public static double potega(int c, int d){
        return Math.pow(c,d);
    }
    public static void informacja(){
        System.out.println("To jest przykład wyświetlania menu z "
                                + "zastosowaniem instrukji switch.");
    }
 
    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *             MENU SWITCH              *");
        System.out.println("     ****************************************");
        System.out.println("                   1. Suma");
        System.out.println("                   2. Różnica");
        System.out.println("                   3. Sinus");
        System.out.println("                   4. Potęga");
        System.out.println("                   5. Informaja");
        System.out.println("                   0. Koniec");
 
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
 
        return w;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
 
        int wybor = menu();
 
        while(wybor!=0){
            switch(wybor){
                case 1:
                    int a, b;
                    System.out.println("Podaj dwie liczby do zsumowania");
                    a = in.nextInt();
                    b = in.nextInt();
 
                    int wynik = suma(a,b);
 
                    System.out.format("Suma liczb wynosi "+wynik);
 
                    break;
                    
                    case 2:
                    int x, y;
                    System.out.println("Podaj dwie liczby do odejmowania");
                    x= in.nextInt();
                    y = in.nextInt();
 
                    int wynik3 = roznica(x,y);
 
                    System.out.format("Różnica liczb wynosi "+wynik3);
 
                    break;
 
                case 3:
                    System.out.println("Podaj liczbę do obliczenia sinusa");
                    a = in.nextInt();
 
                    double wynik2 = sinus(a);
 
                    System.out.format("Sinus wynosi "+wynik2);
 
                    break;
 
                  case 4:
                    int c, d;
                    System.out.println("Podaj dwie liczby ");
                    c = in.nextInt();
                    d = in.nextInt();
 
                    double wynik4 = potega(c,d);
 
                    System.out.format("Wynik potęgowania wynosi "+ wynik4);
 
                    break;
                         
                case 5:
                    informacja();
 
            }
 
            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();
 
            wybor = menu();
        }
 
 
        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");
    }
}