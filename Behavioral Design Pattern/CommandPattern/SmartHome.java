public class SmartHome {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl remoteControl = new RemoteControl(new LightCommand(light),
                new IncreaseTempCommand(thermostat), new DecreaseTempCommand(thermostat),
                new VolumeUpCommand(musicPlayer), new VolumeDownCommand(musicPlayer));

        System.out.println("Smart Home Remote Control!");

        System.out.println("Simulating remote control actions...");

        System.out.println("Turning on the Light!");
        remoteControl.clickLightButton();

        System.out.println("Increasing Thermostat Temperature!");
        remoteControl.clickIncreaseTempButton();

        System.out.println("Decreasing Thermostat Temperature!");
        remoteControl.clickDecreaseTempButton();

        System.out.println("Increasing Music Player Volume!");
        remoteControl.clickVolumeUpButton();

        System.out.println("Decreasing Music Player Volume!");
        remoteControl.clickVolumeDownButton();

        System.out.println("\nRemote control action simulation complete!");
    }
}