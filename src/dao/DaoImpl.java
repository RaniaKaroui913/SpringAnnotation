package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*@Component(value="dao")*/
/*@Component("dao")*/
@Repository("dao")
public class DaoImpl implements IDao{

	@Override
	public double getData() {
		/*
		 * je me connecte � la bd 
		 */
		double data=98;
		return data;
	}
	public void init() {
		System.out.println("Instancial de Dao Impl");
		}

}
