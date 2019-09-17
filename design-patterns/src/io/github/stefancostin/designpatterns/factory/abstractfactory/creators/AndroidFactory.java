package io.github.stefancostin.designpatterns.factory.abstractfactory.creators;

import io.github.stefancostin.designpatterns.factory.products.AndroidButton;
import io.github.stefancostin.designpatterns.factory.products.AndroidCheckbox;
import io.github.stefancostin.designpatterns.factory.products.AndroidRadio;
import io.github.stefancostin.designpatterns.factory.products.UIControl;
import io.github.stefancostin.designpatterns.factory.util.Symbol;

public class AndroidFactory extends UIToolkit {
	public final String SYMBOL = Symbol.dict.get("Android");
	
	@Override
	public UIControl getButton() {
		return new AndroidButton(SYMBOL);
	}

	@Override
	public UIControl getCheckbox() {
		return new AndroidCheckbox(SYMBOL);
	}

	@Override
	public UIControl getRadio() {
		return new AndroidRadio(SYMBOL);
	}
}
