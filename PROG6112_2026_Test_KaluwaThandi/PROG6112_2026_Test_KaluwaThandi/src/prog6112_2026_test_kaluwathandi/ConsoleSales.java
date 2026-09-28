/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_2026_test_kaluwathandi;

/**
 *
 * @author emeris
 */
public class ConsoleSales {
    
}
class RoadAccidentReport extends RoadAccidents {

    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    public void printAccidentReport() {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("************************");
    }
}
