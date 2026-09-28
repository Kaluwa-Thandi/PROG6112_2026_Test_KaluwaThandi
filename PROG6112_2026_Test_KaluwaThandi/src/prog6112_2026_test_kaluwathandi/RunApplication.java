public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select the console type: ");
        String consoleType = sc.nextLine();

        System.out.print("Enter the store: ");
        String city = sc.nextLine();

        System.out.print("Enter the total " + consoleType + " sales for " + city + ": ");
        int total = sc.nextInt();

        ElectronicsFranchise report = new ElectronicsFranchise(consoleType, city, total);
        report.printAccidentReport();

        sc.close();
    }
}