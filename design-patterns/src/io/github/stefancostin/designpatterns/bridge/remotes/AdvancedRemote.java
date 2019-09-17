package io.github.stefancostin.designpatterns.bridge.remotes;

import io.github.stefancostin.designpatterns.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
	private int favoriteChannel;
    
	public AdvancedRemote(Device device) {
        super.device = device;
    }
	
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
    
    public void maxVolume() {
    	System.out.println("Remote: max volume (100%)");
    	device.setVolume(100);
    }
    
    public void goToFavoriteChannel() {
    	if (favoriteChannel != 0) {
    		System.out.println("Remote: go to favorite channel: " + favoriteChannel);
    		device.setChannel(favoriteChannel);
    	} else {
    		System.out.println("Remote: no favorite channel selected");
    	}
    }
    
    public void setFavoriteChannel(int favoriteChannel) {
    	this.favoriteChannel = favoriteChannel;
    }
    
}
