package io.github.stefancostin.designpatterns.factory.method.creators;

import io.github.stefancostin.designpatterns.factory.method.products.UIControl;

/**
 * Interface for Factory Method
 * @author stefan
 *
 */
public interface UIControlFactory {
	public UIControl getInstance(String OS);
}
