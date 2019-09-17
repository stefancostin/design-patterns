package io.github.stefancostin.designpatterns.factory.products;

public class AndroidButton implements UIControl {
	final String SYMBOL;
	
	public AndroidButton(String osSpecificSymbol) {
		SYMBOL = osSpecificSymbol;
	}
	
	public void render(String label) {
		addBorder(label.length());
		System.out.println(SYMBOL + "  " + label + "  " + SYMBOL);
		addBorder(label.length());
	}
	
	public void onClick() {
		System.out.println("Clicked on Android Button.");
	}
	
	private void addBorder(int length) {
		System.out.print(" ");
		for (int i = 0; i < length + 4; i++) {
			System.out.print(SYMBOL);
		}
		System.out.print(" \n");
	}
	
}
