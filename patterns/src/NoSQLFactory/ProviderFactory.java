package NoSQLFactory;

import abstractFactory.AbstractFactory;
import abstractFactory.CardFactory;
import abstractFactory.PaymentMethodFactory;

public class ProviderFactory {
	
	public static AbstracFactory getFactory(String chooseFactory) {
		if("CURSOSREPOSITORY".equals(chooseFactory)) {
			return new NoSQLFactory();
		}else if("ALUMNOSREPOSITORY".equals(chooseFactory)) {
			return new RelacionalFactory();
		}
		return null;
	}

}
