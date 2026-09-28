/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_2026_test_kaluwathandi;

/**
 *
 * @author emeris
 */
public class IConsole {
    
}
abstract class consoles implements IConsole {
    private String consolesType;
    private String getStore;
    private int getTotalSales;

    public RoadAccidents(String vehicleType, String city, int consolesTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentTotal() {
        return accidentTotal;
    }
}