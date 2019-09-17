package io.github.stefancostin.designpatterns.factory.method.creators;

import io.github.stefancostin.designpatterns.factory.method.products.AndroidButton;
import io.github.stefancostin.designpatterns.factory.method.products.IOSButton;
import io.github.stefancostin.designpatterns.factory.method.products.UIControl;
import io.github.stefancostin.designpatterns.factory.method.products.WindowsButton;
import io.github.stefancostin.designpatterns.factory.method.util.Symbol;

/**
 * Factory Method Design Pattern
 * @author stefan
 *
 */
public class ButtonFactory implements UIControlFactory {
	
	public UIControl getInstance(String OS) {		
		if (OS.startsWith("Windows")) {
			return new WindowsButton(Symbol.dict.get("Windows"));
		} else if (OS.startsWith("Android") || OS.startsWith("Linux")) {
			return new AndroidButton(Symbol.dict.get("Android"));
		} else {
			return new IOSButton(Symbol.dict.get("IOS"));
		}
	}
	
}
