package io.github.stefancostin.designpatterns.factory.abstractfactory.creators;

import io.github.stefancostin.designpatterns.factory.products.UIControl;

public abstract class UIToolkit {
	public static UIToolkit getFactory() {
		String OS = System.getProperty("os.name");
		
		if (OS.startsWith("Windows")) {
			return new WindowsFactory();
		} else if (OS.startsWith("Android") || OS.startsWith("Linux")) {
			return new AndroidFactory();
		} else {
			return new IOSFactory();
		}
	}
	
	public abstract UIControl getButton();
	public abstract UIControl getCheckbox();
	public abstract UIControl getRadio();
}
