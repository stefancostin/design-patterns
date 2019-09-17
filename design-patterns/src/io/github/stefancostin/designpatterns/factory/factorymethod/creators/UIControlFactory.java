package io.github.stefancostin.designpatterns.factory.factorymethod.creators;

import io.github.stefancostin.designpatterns.factory.products.UIControl;

/**
 * Interface for Factory Method
 * @author stefan
 *
 */
public interface UIControlFactory {
	public UIControl getInstance(String OS);
}
