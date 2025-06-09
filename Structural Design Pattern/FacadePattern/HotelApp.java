import java.util.Scanner;

public class HotelApp {

    private FrontDesk frontDesk;
    private Scanner scanner;
    private boolean running;

    public HotelApp(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    public void pickUpVehicle(String plateNumber) {
        frontDesk.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        frontDesk.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        frontDesk.requestCart(numberOfCarts);
    }

    public void run() {
        while (running) {
            System.out.println("Please select a hotel service:");
            System.out.println("1. Pick up vehicle");
            System.out.println("2. Clean room");
            System.out.println("3. Request luggage cart");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the vehicle plate number:");
                    String plateNumber = scanner.next();
                    pickUpVehicle(plateNumber);
                    break;
                case 2:
                    System.out.println("Please enter the room number:");
                    int roomNumber = scanner.nextInt();
                    cleanRoom(roomNumber);
                    break;
                case 3:
                    System.out.println("Please enter the number of luggage carts you need:");
                    int numberOfCarts = scanner.nextInt();
                    requestCart(numberOfCarts);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Valet valet = new Valet();
        HouseKeeping houseKeeping = new HouseKeeping();
        Cart cart = new Cart();
        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        HotelApp hotelApp = new HotelApp(frontDesk);

        hotelApp.run();
    }
}