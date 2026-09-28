/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_2026_test_kaluwathandi;

/**
 *
 * @author emeris
 */
public class RunApplication {
    
}
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = sc.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int total = sc.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, total);
        report.printAccidentReport();

        sc.close();
    }
}