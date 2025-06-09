public class ApplianceApp {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptopAdapter laptopAdapter = new laptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        refrigeratorAdapter refrigeratorAdapter = new refrigeratorAdapter(refrigerator);

        Smartphone smartphone = new Smartphone();
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphone);

        // Turn on the appliances
        System.out.println("Laptop:");
        System.out.println(laptopAdapter.plugIn());
        System.out.println();

        System.out.println("Refrigerator:");
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println();

        System.out.println("Smartphone:");
        System.out.println(smartphoneAdapter.plugIn());
    }
}
