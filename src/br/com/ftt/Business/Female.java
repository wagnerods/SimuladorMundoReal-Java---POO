package br.com.ftt.Business;

public class Female extends People {

	public Female(String nome, int idade) {
		super(idade, nome);
	}

	@Override
	public String salutation() {
		return super.dialogHeader() + String.format("Hi, How are you?");
	}

	@Override
	public String salutation(People people) {
		return super.dialogHeader() + String.format("Hi $s, How are you?", people.getName());
	}

	@Override
	public String apresentation() {
		return super.dialogHeader() + String.format("My name is %s and i'm %d", this.getName(), this.getYearsOld());
	}

	@Override
	public String apresentation(People people) {
		return super.dialogHeader() + String.format("Do you have %d? you look younger than you show %s",
				people.getYearsOld(), people.getName());
	}

	@Override
	public String emotion() {
		return super.dialogHeader()
				+ String.format("Today I just wanted to open a beer and have a barbecue on the balcony!");
	}

}
