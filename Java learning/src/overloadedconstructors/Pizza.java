package overloadedconstructors;

class Pizza {
	String pieczywo;
	String sos;
	String ser;
	String topping;
	Pizza(String pieczywo) {
		this(pieczywo, null);
	}
	Pizza(String pieczywo, String sos) {
		this(pieczywo, sos, null);
	}
	Pizza(String pieczywo, String sos, String ser) {
		this(pieczywo, sos, ser, null);
	}
	Pizza(String pieczywo, String sos, String ser, String topping) {
		this.pieczywo = pieczywo;
		this.sos = sos;
		this.ser = ser;
		this.topping = topping;
		make();
	}
	void make() {
		System.out.println("Upiekles pizze " + pieczywo +  " o skladnikach: "  + ser + ", " + topping + ", " + sos);
	}
}
