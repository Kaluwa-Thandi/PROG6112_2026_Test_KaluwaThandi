public class IConsole {
    
}
abstract class consoles implements IConsole {
    private String consolesType;
    private String getStore;
    private int getTotalSales;

    public ElectronicsFranchise(String consoleType, String city, int TotalSales) {
        this.consoleType = consoleType;
        this.city = city;
        this.TotalSales = TotalSales;
    }

    public String getAccidentVehicleType() {
        return consoleType;
    }

    public String getCity() {
        return city;
    }

    public int getTotalSales() {
        return TotalSales;
    }
}