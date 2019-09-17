package io.github.stefancostin.designpatterns.factory.products;

public interface UIControl {
	public void render(String label);
	public void onClick();
}
