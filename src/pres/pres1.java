package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;



import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class pres1 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 * injection des dependances par l'instanciation statique 
		 */
		/*
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		*/
		/*
		try{
			Scanner scanner= new Scanner(new File("config.txt"));
			String daoClassName=scanner.nextLine();
			System.out.println(daoClassName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		*/
		
		/*Scanner scanner= new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class cDao=Class.forName(daoClassName);
		IDao dao=  (IDao) cDao.newInstance();
		
		System.out.println(dao.getData());
		*/
		 
        Scanner scanner= new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class cDao=Class.forName(daoClassName);
		IDao dao=  (IDao) cDao.newInstance();
		
		String metierClassName=scanner.nextLine();
		Class cMetier=Class.forName(metierClassName);
		IMetier metier=(IMetier) cMetier.newInstance();
		
		Method m=cMetier.getMethod("setDao", IDao.class);
		m.invoke(metier, dao);
		
		
		System.out.println(metier.calcul());
		
		
	}

}
