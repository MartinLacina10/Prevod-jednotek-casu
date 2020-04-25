import java.util.*;
public class Pjednotek{
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Napis hodiny: ");
        a = sc.nextInt();

        
        int b;
        Scanner sx = new Scanner(System.in);
        System.out.print("Napis minuty: ");
        b = sx.nextInt();

        
        int c;
        c = a * 3600 + b * 60;

        System.out.print("Vteriny = " + c);

    }
}