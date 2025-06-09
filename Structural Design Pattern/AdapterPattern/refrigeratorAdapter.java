public class refrigeratorAdapter implements PowerOutlet {

    private Refrigerator refrigerator;

    public refrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn() {
        return refrigerator.startCooling();
    }

}