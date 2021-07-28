package design_patterns_2.bridge;

public class AdvancedRemoteControl extends RemoteControl {

  public AdvancedRemoteControl(Device device) {
    super(device);
  }

  public void setChannel(int number) {
    device.setChannel(number);
  }
}
