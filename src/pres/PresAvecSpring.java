package pres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresAvecSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		/*IMetier metier =  (IMetier) ctx.getBean ("metier");
		System.out.println(metier.calcul());
		*/
		IMetier metier = ctx.getBean (IMetier.class);
		System.out.println(metier.calcul());

	}

}
