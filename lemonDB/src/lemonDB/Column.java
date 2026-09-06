package lemonDB;

public class Column{
	protected String name;
	String[] stringValues;
	int[] intValues;
	float[] floatValues;
	double[] doubleValues;
	long[] longValues;
	byte[] byteValues;
	short[] shortValues;
	boolean[] boolValues;
	char[] charValues;

	public Column(String name, boolean[] values) {
		this.name = name;
		this.boolValues = values;
	}
	public Column(String name, String[] values) {
		this.name = name;
		this.stringValues = values;
	}
	public Column(String name, int[] values) {
		this.name = name;
		this.intValues = values;
	}
	public Column(String name, float[] values) {
		this.name = name;
		this.floatValues = values;
	}
	public Column(String name, double[] values) {
		this.name = name;
		this.doubleValues = values;
	}
	public Column(String name, long[] values) {
		this.name = name;
		this.longValues = values;
	}
	public Column(String name, byte[] values) {
		this.name = name;
		this.byteValues = values;
	}
	public Column(String name, short[] values) {
		this.name = name;
		this.shortValues = values;
	}
	public Column(String name, char[] values) {
		this.name = name;
		this.charValues = values;
	}
	public String getName() {
		return name;
	}
	

}
