package io.github.stefancostin.designpatterns.factory.method.products;

public class WindowsCheckbox implements UIControl {
	final String SYMBOL;
	boolean state;
	
	public WindowsCheckbox(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		System.out.println(" " + SYMBOL + SYMBOL + " ");
		System.out.println(SYMBOL + "  " + SYMBOL + "  " + label);
		System.out.println(" " + SYMBOL + SYMBOL + " ");
	}
	
	public void onClick() {
		state = !state;
		System.out.println("Clicked on Windows Checkbox.");
		System.out.println("State: " + state);
	}
	
}
