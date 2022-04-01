package CarFactory;

public class CarFactory {
	
	public static  VersionCar buidCar(CarType type) {
		
		switch (type) {
		case SMALL:			
			return new SmallCar();
			
		case LUXURY: 
			return new LuxuryCar();
			
		case SEDAN:
			return new SedanCar();
		
		default:
			return null;
			
		}
		
	}
}
