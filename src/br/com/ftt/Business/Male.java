package br.com.ftt.Business;

public class Male extends People {

	public Male(String name, int yearsOld) {
		super(yearsOld, name);
	}

	@Override
	public String salutation() {
		return super.dialogHeader() + String.format("Hi, it's all right?");
	}

	@Override
	public String salutation(People people) {
		return super.dialogHeader() + String.format("Hi %s, how are you?", people.getName());
	}

	@Override
	public String apresentation() {
		return super.dialogHeader() + String.format("My name is %s and i'm %d", this.getName(), this.getYearsOld());
	}

	@Override
	public String apresentation(People people) {
		return super.dialogHeader() + String.format("Do you have %d? doesn't look like you're that age %s",
				people.getYearsOld(), people.getName());
	}

	@Override
	public String emotion() {
		return super.dialogHeader() + String.format("I'm feeling wonderfully well this morning!!! Thanks!!");
	}

}