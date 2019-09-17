package io.github.stefancostin.designpatterns.factory.abstractfactory;

import io.github.stefancostin.designpatterns.factory.abstractfactory.creators.UIToolkit;
import io.github.stefancostin.designpatterns.factory.products.UIControl;

public class AbstractFacoryMain {
	public static void main(String[] args) {
		UIToolkit systemFactory = UIToolkit.getFactory();
		UIControl button = systemFactory.getButton();
		UIControl checkbox = systemFactory.getCheckbox();
		UIControl radio = systemFactory.getRadio();
		
		button.render("Abstract Method");
		checkbox.render("Checkbox");
		radio.render("Radio");
	}
}
