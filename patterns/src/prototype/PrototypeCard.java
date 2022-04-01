package prototype;

public interface PrototypeCard extends Cloneable {
	
	public PrototypeCard clone() throws CloneNotSupportedException;
	public void getCard();
}
