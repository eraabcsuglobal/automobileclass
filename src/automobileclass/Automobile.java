package automobileclass;

public class Automobile {

	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	public Automobile(String carMake, String carModel, String carColor, int carYear, int carMileage) {
		try {
			make = carMake;
			model = carModel;
			color = carColor;
			year = carYear;
			mileage = carMileage;
		}
		catch (Exception e) {
			System.out.println("error creating object");
		}
	}
	
	public Automobile()
	{
		try {
			make = "";
			model = "";
			color = "";
			year = 0;
			mileage = 0;
		}
		catch (Exception e) {
			System.out.println("error creating object");
		}
	}

	
	//list vehicle information (return string array)
	public String[] ListVehicleInfo()
	{
		try {
			String[] vehicleInfo = {make, model, color, Integer.toString(year), Integer.toString(mileage) };
			return vehicleInfo;
		} catch (Exception e) {
			System.out.println("Error while trying to list vehicle information");
			return new String[0];
		}
	}
	
	
	
	public Automobile CreateNewVehicle(String newMake, String newModel, String newColor, int newYear, int newMileage)
	{
		try {
			Automobile newVehicle = new Automobile(newMake, newModel, newColor, newYear, newMileage);
			return newVehicle;	
		} catch (Exception e) {
			System.out.println("Error creating the new object");
			return null;
		}
	}
	
	public void UpdateVehicle(String updatedMake, String updatedModel, String updatedColor, int updatedYear, int updatedMileage)
	{
		try {
			make = updatedMake;
			model = updatedModel;
			color = updatedColor;
			year = updatedYear;
			mileage = updatedMileage;
		}
		catch (Exception e) {
			System.out.println("Error updating this vehicle's info");
		}
	
	}
	
	public void RemoveVehicleInfo()
	{
		try {
			make = "";
			model = "";
			color = "";
			year = 0;
			mileage = 0;
		}
		catch (Exception e) {
			System.out.println("Unable to remove vehicle info");
		}
	}

}