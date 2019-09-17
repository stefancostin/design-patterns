package io.github.stefancostin.designpatterns.factory.factorymethod.creators;

import io.github.stefancostin.designpatterns.factory.products.AndroidRadio;
import io.github.stefancostin.designpatterns.factory.products.IOSRadio;
import io.github.stefancostin.designpatterns.factory.products.UIControl;
import io.github.stefancostin.designpatterns.factory.products.WindowsRadio;
import io.github.stefancostin.designpatterns.factory.util.Symbol;

/**
 * Factory Method Design Pattern
 * @author stefan
 *
 */
public class RadioFactory implements UIControlFactory {
	
	public UIControl getInstance(String OS) {		
		if (OS.startsWith("Windows")) {
			return new WindowsRadio(Symbol.dict.get("Windows"));
		} else if (OS.startsWith("Android") || OS.startsWith("Linux")) {
			return new AndroidRadio(Symbol.dict.get("Android"));
		} else {
			return new IOSRadio(Symbol.dict.get("IOS"));
		}
	}
	
}
