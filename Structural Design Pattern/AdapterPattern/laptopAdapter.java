public class laptopAdapter implements PowerOutlet {

    private Laptop laptop;

    public laptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }

}