package br.com.ftt.Business;

public abstract class People {
	
	private int yearsOld;
	private String name;

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People(int yearsOld, String name) {
		super();
		this.yearsOld = yearsOld;
		this.name = name;
	}

	public abstract String salutation();

	public abstract String salutation(People people);

	public abstract String apresentation();

	public abstract String apresentation(People people);

	public abstract String emotion();

	public String dialogHeader() {
		return String.format("%s say: %n", this.getName());
	}

}
