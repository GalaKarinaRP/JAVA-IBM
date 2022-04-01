package abstractFactory;

import NoSQLFactory.AbstracFactory;
import NoSQLFactory.NoSQLFactory;
import NoSQLFactory.RelacionalFactory;

public class ProviderFactory {
	
	public static AbstractFactory getFactory(String chooseFactory) {
		if("Cursos".equals(chooseFactory)) {
			return new CardFactory();
		}else if("Alumnos".equals(chooseFactory)) {
			return new PaymentMethodFactory();
		}
		return null;		
		
	}

}
