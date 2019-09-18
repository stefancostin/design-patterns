package io.github.stefancostin.designpatterns.bridge;

import io.github.stefancostin.designpatterns.bridge.devices.Device;
import io.github.stefancostin.designpatterns.bridge.devices.Radio;
import io.github.stefancostin.designpatterns.bridge.remotes.AdvancedRemote;
import io.github.stefancostin.designpatterns.bridge.remotes.BasicRemote;

public class BridgeMain {

	public static void main(String[] args) {
		// could use factory method for object creation
		Device device = new Radio();
		
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.maxVolume();
        advancedRemote.setFavoriteChannel(42);
        advancedRemote.goToFavoriteChannel();
        device.printStatus();
	}

}
