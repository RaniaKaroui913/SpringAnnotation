package ext;

import org.springframework.stereotype.Component;

import dao.IDao;

@Component("dao")
public class DaoImplV2 implements IDao {

	@Override
	public double getData() {
		/*
		 * vesion WS
		 */
		System.out.println("version web service");
		double data=12;
		return data;
	}

}
