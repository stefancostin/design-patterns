package io.github.stefancostin.designpatterns.factory.abstractfactory.creators;

import io.github.stefancostin.designpatterns.factory.products.IOSButton;
import io.github.stefancostin.designpatterns.factory.products.IOSCheckbox;
import io.github.stefancostin.designpatterns.factory.products.IOSRadio;
import io.github.stefancostin.designpatterns.factory.products.UIControl;
import io.github.stefancostin.designpatterns.factory.util.Symbol;

public class IOSFactory extends UIToolkit {
	public final String SYMBOL = Symbol.dict.get("IOS");
	
	@Override
	public UIControl getButton() {
		return new IOSButton(SYMBOL);
	}

	@Override
	public UIControl getCheckbox() {
		return new IOSCheckbox(SYMBOL);
	}

	@Override
	public UIControl getRadio() {
		return new IOSRadio(SYMBOL);
	}
}
