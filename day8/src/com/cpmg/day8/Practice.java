package com.cpmg.day8;

class Studentss{
	public Studentss(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Studentss [name=" + name + "]";
	}

	private String name;
}

class Engineering extends Studentss {
	public Engineering(String name, String field) {
		super(name);
		this.field = field;
	}

	@Override
	public String toString() {
		return "Engineering [field=" + field + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	private String field = "Engineering";
}

class Medical extends Studentss {

	public Medical(String name, String field) {
		super(name);
		this.field = field;
	}

	public Medical(String name) {
		super(name);
		this.field = "Medical";
	}

	@Override
	public String toString() {
		return "Medical [field=" + field + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	private String field = "Medical";
}

class Aero extends Medical {
	public Aero(String name) {
		super(name);
		this.stream = "Aero";
	}

	@Override
	public String toString() {
		return "Aero [stream=" + stream + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private String stream = "Aero";
}

public class Practice {
	public static void main(String aegs[]) {
		Studentss s1 = new Studentss("hi");
		Engineering e1 = new Engineering("ujfujg", "Engineering");
		Medical m1 = new Medical("dis");
		Aero a1 = new Aero("igoyy");

		System.out.println(a1.toString());

	}
}
