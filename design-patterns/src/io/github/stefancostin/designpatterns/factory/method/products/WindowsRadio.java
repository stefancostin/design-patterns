package io.github.stefancostin.designpatterns.factory.method.products;

public class WindowsRadio implements UIControl {
	final String SYMBOL;
	boolean isSelected;
	
	public WindowsRadio(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		System.out.println(" " + SYMBOL + " ");
		System.out.println(SYMBOL + " " + SYMBOL + "    " + label);
		System.out.println(" " + SYMBOL + " ");
	}
	
	public void onClick() {
		isSelected = true;
		System.out.println("Clicked on Windows Radio.");
	}
}
