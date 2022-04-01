package prototype;

public class Visa implements PrototypeCard{
	
	private String name; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getCard() {
		System.out.println("Tarjeta Visa");
		
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Esto es una tarjeta Visa");
		return (Visa) super.clone();
	}
}
