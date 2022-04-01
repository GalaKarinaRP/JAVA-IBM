package CarFactory;

public class RunCar {

	public static void main(String[] args) {
		VersionCar smallCar = CarFactory.buidCar(CarType.LUXURY);
		smallCar.getVersion();
		
		VersionCar luxuryCar = CarFactory.buidCar(CarType.LUXURY);
		luxuryCar.getVersion();
		
		VersionCar sedanCar = CarFactory.buidCar(CarType.SEDAN);
		sedanCar.getVersion();
	}	
}
