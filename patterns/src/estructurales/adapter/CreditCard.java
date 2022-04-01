package estructurales.adapter;

public class CreditCard implements Payment {

	Adapter adapter;
	
	@Override
	public void pay(String type) {
		if("classic".equals(type)) {
			System.out.println("Tarjeta classic: pagando sin ningun tipo de seguridad");
			
		}else if("gold".equals(type)) {
			adapter = new Adapter(type);
			adapter.pay(type);
		}
		else {
			System.out.println("no se puede hacer el pago, no se detecta la tarjeta");
		}
		
	}

}
