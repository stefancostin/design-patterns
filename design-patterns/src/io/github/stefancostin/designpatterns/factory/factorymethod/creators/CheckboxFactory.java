package io.github.stefancostin.designpatterns.factory.factorymethod.creators;

import io.github.stefancostin.designpatterns.factory.products.AndroidCheckbox;
import io.github.stefancostin.designpatterns.factory.products.IOSCheckbox;
import io.github.stefancostin.designpatterns.factory.products.UIControl;
import io.github.stefancostin.designpatterns.factory.products.WindowsCheckbox;
import io.github.stefancostin.designpatterns.factory.util.Symbol;

/**
 * Factory Method Design Pattern
 * @author stefan
 *
 */
public class CheckboxFactory implements UIControlFactory {
	
	public UIControl getInstance(String OS) {		
		if (OS.startsWith("Windows")) {
			return new WindowsCheckbox(Symbol.dict.get("Windows"));
		} else if (OS.startsWith("Android") || OS.startsWith("Linux")) {
			return new AndroidCheckbox(Symbol.dict.get("Android"));
		} else {
			return new IOSCheckbox(Symbol.dict.get("IOS"));
		}
	}
	
}
