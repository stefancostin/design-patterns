package io.github.stefancostin.designpatterns.factory.abstractfactory.creators;

import io.github.stefancostin.designpatterns.factory.products.UIControl;
import io.github.stefancostin.designpatterns.factory.products.WindowsButton;
import io.github.stefancostin.designpatterns.factory.products.WindowsCheckbox;
import io.github.stefancostin.designpatterns.factory.products.WindowsRadio;
import io.github.stefancostin.designpatterns.factory.util.Symbol;

public class WindowsFactory extends UIToolkit {
	public final String SYMBOL = Symbol.dict.get("Windows");
	
	@Override
	public UIControl getButton() {
		return new WindowsButton(SYMBOL);
	}

	@Override
	public UIControl getCheckbox() {
		return new WindowsCheckbox(SYMBOL);
	}

	@Override
	public UIControl getRadio() {
		return new WindowsRadio(SYMBOL);
	}

}
