package Alex;

import java.util.Scanner;

public class Main {


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
	// write your code here
        int a;
        int b;
        int summa;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        summa = sum(a, b);
        System.out.println(summa);



    }
}
