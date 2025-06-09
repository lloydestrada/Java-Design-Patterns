public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        if (!this.light.getIsOn()) {
            return light.switchOn();
        } else {
            return light.switchOff();
        }
    }
}