import java.util.Date;

class Car {
	private String PlateNo;
	private int yearmanufacture;
	private int monthmanufacture;
	private String color;
	private double price;
	private String manufactureby;
	private int guaranteedueyear;
	private int guaranteeduemonth;
	private int year, month;
	Date time = new Date();
	private int currentyear, currentmonth;

	public Car() { // No-argument constructor: that creates a car object using the default
					// “Mercedes Benz” values in example.
		PlateNo = "0123-A";
		yearmanufacture = 2020;
		monthmanufacture = 10;
		color = "red";
		price = 50000;
		manufactureby = "Mercedes";
		guaranteedueyear = 2021;
		guaranteeduemonth = 4;
	}

	// A constructor with arguments using the basic 8 attributes that mentioned
	// before.
	public Car(String PlateNo, int yearmanufacture, int monthmanufacture, String color, double price,
			String manufactureby, int guaranteedueyear, int guaranteeduemonth) {
		this.PlateNo = PlateNo;
		this.yearmanufacture = yearmanufacture;
		this.monthmanufacture = monthmanufacture;
		this.color = color;
		this.price = price;
		this.manufactureby = manufactureby;
		this.guaranteedueyear = guaranteedueyear;
		this.guaranteeduemonth = guaranteeduemonth;
	}

	public int getYearManufacture() {
		return yearmanufacture;
	}

	public int getMonthManufacture() {
		return monthmanufacture;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public void setYearManufacture(int year) {
		this.year = year;
	}

	public void setMonthManufacture(int month) {
		this.month = month;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setGuarantee(int month, int year) {
		this.month = month;
		this.year = year;
	}

	public String getCarAge() {
		int thisyear = time.getYear(); // brings the current year - 1900
		int thismonth = time.getMonth(); // brings the current month
		int yearage, monthage;
		yearage = thisyear - yearmanufacture + 1900; // calculates car age in years, also i've add 1900 to get the value
														// of current year.
		monthage = thismonth - monthmanufacture; // calculates car age in months
		if (thismonth < monthmanufacture) { // if the current month is less than manufacture month , to void getting -ve
											// value.
			monthage += 12;
			yearage -= 1; // to discount one year when the current month is less than manufacture month
		}
		String syear = Integer.toString(yearage); // transfere int to String
		String smonth = Integer.toString(monthage);
		String s = "Car Age is " + syear + " years. and " + smonth + " months.";
		s = s.toUpperCase(); // make all digits in capital letter
		return s;
	}

	public String printCarInfo() {
		String s1 = "Plate No: " + PlateNo + "\n" + "Year manufacture: " + yearmanufacture + "\n"
				+ "Month manufacture: " + monthmanufacture + "\n" + "color: " + color + "\n" + "Manufactureby: "
				+ manufactureby + "\n" + "Guarantee due to year: " + guaranteedueyear + "\n"
				+ "Guarantee due to month: " + guaranteeduemonth + "\n" + "Car Age: " + getCarAge() + "\n"
				+ "Guarantee Time Left: " + getCalculateGuarantee() + "\n"
				+ "---------------------------------------------";

		s1 = s1.toUpperCase();
		return s1;
	}

	public String getmanufactureby() {
		return manufactureby;
	}

	public String getCalculateGuarantee() {
		int nowyear = time.getYear();
		int nowmonth = time.getMonth();
		int guaranteeyear, guaranteemonth;
		guaranteeyear = guaranteedueyear - nowyear - 1900;
		guaranteemonth = guaranteeduemonth - nowmonth;
		if (nowmonth > guaranteemonth) {
			guaranteemonth += 12;
			guaranteeyear -= 1;
		}
		String syear = Integer.toString(guaranteeyear);
		String smonth = Integer.toString(guaranteemonth);
		String s = syear + " years. and " + smonth + " months.";
		s = s.toUpperCase();
		return s;

	}

}