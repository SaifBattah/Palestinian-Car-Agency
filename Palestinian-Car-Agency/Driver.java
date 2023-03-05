import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		Car[] cars = new Car[5];
		cars[0] = new Car("0123-A", 2018, 7, "Red", 20000, "MercedesBenz", 2019, 1);
		cars[1] = new Car("0324-D", 2019, 2, "Blue", 35000, "BMW", 2019, 8);
		cars[2] = new Car("0155-G", 2019, 11, "Green", 385000, "Audi", 2020, 5);
		cars[3] = new Car("1126-H", 2005, 5, "White", 499999.99, "Mitsubishi Motors", 2006, 1);
		cars[4] = new Car("0137-b", 2007, 12, "Black", 749999.99, "Ford", 2008, 6);
		printCarsInfo(cars);
		maxPrice(cars);
		System.out.println("MAXIMUM CAR PRICE: " + maxPrice(cars).getPrice());

	}

	public static void printCarsInfo(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			cars[i].printCarInfo();
			System.out.println(cars[i].printCarInfo());

		}
	}

	public static Car maxPrice(Car[] cars) {
		Car max = cars[0];
		for (int i = 1; i < 5; i++) {
			if (cars[i].getPrice() > max.getPrice()) {
				max = cars[i];
			}
		}
		return max;

	}

}