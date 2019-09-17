package io.github.stefancostin.designpatterns.factory.method;

import java.util.ArrayList;

import io.github.stefancostin.designpatterns.factory.method.creators.ButtonFactory;
import io.github.stefancostin.designpatterns.factory.method.creators.CheckboxFactory;
import io.github.stefancostin.designpatterns.factory.method.creators.RadioFactory;
import io.github.stefancostin.designpatterns.factory.method.creators.UIControlFactory;
import io.github.stefancostin.designpatterns.factory.method.products.UIControl;

/**
 * Test Drive class for Factory design pattern.
 * The factory design patterns abstracts the logic of
 * object creation from the user.
 * 
 * @author stefan
 *
 */
public class FactoryMethodMain {
	
	public static void main(String[] args) {
		String OS = System.getProperty("os.name");
		
		// Buttons
		UIControlFactory buttonFactory = new ButtonFactory();
		UIControl btn = buttonFactory.getInstance(OS);
		btn.render("Hello World");
		btn.onClick();
		System.out.println();
		
		// Checkboxes
		UIControlFactory checkboxFactory = new CheckboxFactory();
		UIControl checkbox = checkboxFactory.getInstance(OS);
		checkbox.render("UNIX");
		checkbox.onClick();
		checkbox.onClick();
		System.out.println();
		
		// Radios
		ArrayList<UIControl> radioList = new ArrayList<>();
		String[] radioItems = {"Apples", "Oranges", "Bananas", "Kiwis"};
		
		UIControlFactory radioFactory = new RadioFactory();
		for (String item: radioItems) {
			radioList.add(radioFactory.getInstance(OS));
			radioList.get(radioList.size() - 1).render(item);
			System.out.println();
		}
		
	}

}
