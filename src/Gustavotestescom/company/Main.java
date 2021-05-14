package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int cityA, cityB, year = 0, taxA, taxB;

        System.out.println("Type the population of city A and city B.");
        cityA = scanner.nextInt();
        cityB = scanner.nextInt();

        System.out.println("Type the growth rate growth of city A and city B.");
        taxA = scanner.nextInt();
        taxB = scanner.nextInt();

        while(cityA <= cityB){
            cityA += cityA * taxA;
            cityB += cityB * taxB;
            year += 1;
        }
        System.out.println("the growth is " + year );
    }
}
