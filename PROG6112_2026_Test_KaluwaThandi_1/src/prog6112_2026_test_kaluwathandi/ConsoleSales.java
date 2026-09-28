public class ConsoleSales {
    
}
class ElectronicsFranchise extends ElectronicsFranchise {

    public ElectronicsFranchise(String consoleType, String city, int TotalSales) {
        super(consoleType, city, TotalSales);
    }

    public void printAccidentReport() {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("CITY: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("************************");
    }
}
