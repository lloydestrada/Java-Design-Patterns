public class FrontDesk {

    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping houseKeeping, Cart cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}