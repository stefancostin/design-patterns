package io.github.stefancostin.designpatterns.factory.products;

public class IOSCheckbox implements UIControl {
	final String SYMBOL;
	boolean state;
	
	public IOSCheckbox(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		System.out.println(" " + SYMBOL + SYMBOL + " ");
		System.out.println(SYMBOL + "  " + SYMBOL + "  " + label);
		System.out.println(" " + SYMBOL + SYMBOL + " ");
	}
	
	public void onClick() {
		state = !state;
		System.out.println("Clicked on iOS Checkbox from an Apple device.");
		System.out.println("State: " + state);
	}
}
