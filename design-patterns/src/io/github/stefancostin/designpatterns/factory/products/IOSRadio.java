package io.github.stefancostin.designpatterns.factory.products;

public class IOSRadio implements UIControl {
	final String SYMBOL;
	boolean isSelected;
	
	public IOSRadio(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		System.out.println(" " + SYMBOL + " ");
		System.out.println(SYMBOL + " " + SYMBOL + "  " + label);
		System.out.println(" " + SYMBOL + " ");
	}
	
	public void onClick() {
		isSelected = true;
		System.out.println("Clicked on iOS Radio from an Apple device.");
	}
	
}
