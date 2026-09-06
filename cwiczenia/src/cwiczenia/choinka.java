package cwiczenia;

import javax.swing.JOptionPane;

public class choinka {

	public static void main(String[] args) {
		String znak = JOptionPane.showInputDialog(null, "Wprowadz znak z ktorego bedzie skladala sie choinka");
		int liczbaInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadz wielkosc choinki (linie)"));
		int dekoracje = JOptionPane.showConfirmDialog(null, "Czy chcesz aby na twojej choince znalazly sie dekoracje?");
		for (int numerLinii = 1; numerLinii<=liczbaInt; numerLinii++) {
			int grubosc = numerLinii;
			for (int k = (liczbaInt-grubosc)*znak.length()/2; k>0; k--) {
				System.out.print(" ");
			}
			while (grubosc>0) {
				if (dekoracje==0) {
					int losowa = (int)Math.floor(Math.random()*10);
					if (losowa>1) {
						System.out.print(znak);
					}
					else if (znak.equals("+")) {
						for (int wielkoscDekoracji = znak.length(); wielkoscDekoracji>0; wielkoscDekoracji--) {
							System.out.print("*");
						}
					}
					else {
						for (int wielkoscDekoracji = znak.length(); wielkoscDekoracji>0; wielkoscDekoracji--) {
							System.out.print("+");
						}
					}
				}
				else {
					System.out.print(znak);
				}
				grubosc--;
			}
			System.out.println();
		}
		if (liczbaInt>=5) {
			int gruboscPnia = liczbaInt*znak.length()/4;
			for (int linie = liczbaInt/5; linie>0; linie--) {
				for (int wciecie = (liczbaInt*znak.length()-gruboscPnia)/2; wciecie>0; wciecie--) {
					System.out.print(" ");
				}
				for (int i = gruboscPnia; i>0; i--) {
					System.out.print("■");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Wesołych świąt!!!");

		
	}

}
