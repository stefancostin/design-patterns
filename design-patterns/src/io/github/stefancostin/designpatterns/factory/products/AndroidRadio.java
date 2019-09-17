package io.github.stefancostin.designpatterns.factory.products;

public class AndroidRadio implements UIControl {
	final String SYMBOL;
	boolean isSelected;
	
	public AndroidRadio(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		System.out.println(" " + SYMBOL + " ");
		System.out.println(SYMBOL + " " + SYMBOL + "  " + label);
		System.out.println(" " + SYMBOL + " ");
	}
	
	public void onClick() {
		isSelected = true;
		System.out.println("Clicked on Android Radio.");
	}
}
