package br.com.ftt.Application;
import br.com.ftt.Business.Female;
import br.com.ftt.Business.Male;
import br.com.ftt.Business.People;

public class Main {

	public static void main(String[] args) {

		People f = new Female("Trinity", 35);
		People m = new Male("Neo", 28);

		System.out.println(m.salutation());
		System.out.println(m.apresentation());

		System.out.println(f.salutation(m));
		System.out.println(f.apresentation(m));

		System.out.println(m.emotion());

	}

}