package estructurales.adapter;

public class BlackCreditCard implements Secure {

	@Override
	public void payWithSecureLevelA() {
	System.out.println("TARJETA BLACK: pagando con seguridad Alta");
		
	}

	@Override
	public void payWithSecureLevelz() {
		// TODO Auto-generated method stub
		
	}

}
