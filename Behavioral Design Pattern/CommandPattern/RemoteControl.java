public class RemoteControl {
    private LightCommand lightCommand;
    private IncreaseTempCommand increaseTempCommand;
    private DecreaseTempCommand decreaseTempCommand;
    private VolumeUpCommand volumeUpCommand;
    private VolumeDownCommand volumeDownCommand;

    public RemoteControl(LightCommand lightCommand, IncreaseTempCommand increaseTempCommand,
                         DecreaseTempCommand decreaseTempCommand, VolumeUpCommand volumeUpCommand, VolumeDownCommand volumeDownCommand) {
        this.lightCommand = lightCommand;
        this.increaseTempCommand = increaseTempCommand;
        this.decreaseTempCommand = decreaseTempCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
    }

    public void clickLightButton() {
        System.out.println(lightCommand.execute());
    }

    public void clickIncreaseTempButton() {
        System.out.println(increaseTempCommand.execute());
    }

    public void clickDecreaseTempButton() {
        System.out.println(decreaseTempCommand.execute());
    }

    public void clickVolumeUpButton() {
        System.out.println(volumeUpCommand.execute());
    }

    public void clickVolumeDownButton() {
        System.out.println(volumeDownCommand.execute());
    }
}