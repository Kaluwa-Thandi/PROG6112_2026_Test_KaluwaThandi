package prog6112_2026_test_kaluwathandi;

import java.util.Scanner;

public class ElectronicsFranchise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // STEP 1: DECLARE & POPULATE
        // Single-dimensional array -> holds the labels (city names)
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // Two-dimensional array -> rows = cities, columns = gaming consoles
        // column 0 = PS5, column 1 = Xbox, column 2= Switch
        int[][] consoles = new int[cities.length][2];

        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of consoles for PS5 " + cities[i] + ": ");
            consoles[i][0] = sc.nextInt();
            System.out.print("Enter the number of consoles for Xbox " + cities[i] + ": ");
            consoles[i][1] = sc.nextInt();
            System.out.print("Enter the number of consoles for Switch " + cities[i] + ": ");
            consoles[i][2] = sc.nextInt();
        }
        
        

        // STEP 2: PRINT THE TABLE
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("YEARLY SALES OF GAMING CONSOLES");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%n", "", "CAR", "MOTOR BIKE");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-15d%-15d%n", cities[i], consoles[i][0], consoles[i][1]);
        }

        // STEP 3: PROCESS -> row totals (sales per city for all 3 cgaming consoles)
        int[] totals = new int[cities.length];
        for (int i = 0; i < cities.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < consoles[i].length; j++) {
                rowTotal += consoles[i][j];
            }
            totals[i] = rowTotal;
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("TOTAL SALES FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s%d%n", cities[i], totals[i]);
        }

        // STEP 3b: find the city with the highest total (track the INDEX, not just the value)
        int maxIndex = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST GAMING CONSOLE SALES: " + cities[maxIndex]);
        System.out.println("-----------------------------------------------------------------");

        sc.close();
    }
} 