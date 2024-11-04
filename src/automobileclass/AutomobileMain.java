package automobileclass;

import java.io.FileWriter;
import java.util.Scanner;

public class AutomobileMain {
	//Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). 

	public static void main(String args[]) {
		//Include a try..catch construct and print it to the console.
		try {
			//Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
			Automobile vehicle = new Automobile("Ford", "Taurus", "Black", 2004, 125000);
			
			System.out.println();

			//Then call the method to list the values. Loop through the array and print to the screen.
			for (int i = 0; i < vehicle.ListVehicleInfo().length; i++)
			{
				System.out.print(vehicle.ListVehicleInfo()[i] + " ");
			}

			//Call the remove vehicle method to clear the variables.
			vehicle.RemoveVehicleInfo();
			
			System.out.println();

			//Print the return value.
			for (int i = 0; i < vehicle.ListVehicleInfo().length; i++)
			{
				System.out.print(vehicle.ListVehicleInfo()[i] + " ");
			}
			//Add a new vehicle.
			Automobile newVehicle = vehicle.CreateNewVehicle("Subaru", "Crosstrek", "White", 2024, 50000);

			//Print the return value.
			System.out.println(newVehicle);

			//Call the list method and print the new vehicle information to the screen.
			for (int i = 0; i < newVehicle.ListVehicleInfo().length; i++)
			{
				System.out.print(newVehicle.ListVehicleInfo()[i] + " ");
			}
			
			System.out.println();

			//Update the vehicle.
			newVehicle.UpdateVehicle("Toyota", "Camry", "Tan", 2001, 125333);

			//Print the return value.
			System.out.println(newVehicle);
			System.out.println();

			//Call the listing method and print the information to the screen.
			for (int i = 0; i < newVehicle.ListVehicleInfo().length; i++)
			{
				System.out.print(newVehicle.ListVehicleInfo()[i] + " ");
			}
			System.out.println();


			//Display a message asking if the user wants to print the information to a file (Y or N).
			System.out.println("Would you like to print this information to a file (Y or N)?");

			//Use a scanner to capture the response. If "Y", print the file to a predefined location (e.g., C:\Temp\Autos.txt). 
			Scanner scannerObj = new Scanner(System.in);
			String userResponse = scannerObj.nextLine();
			
			String filepath = "Autos.txt";
		
			if (userResponse.equalsIgnoreCase("y"))
			{
				try (FileWriter fw = new FileWriter(filepath))
				{
					for (int i = 0; i < newVehicle.ListVehicleInfo().length; i++)
					{
						String str = newVehicle.ListVehicleInfo()[i];
						for (int j = 0; j < str.length(); j++)
						{
							fw.write(str.charAt(j));
						}
						fw.write(" ");
					}
					fw.close();
				}
				catch (Exception e) {
					e.getStackTrace();
				}
			
			}
			//Note: you may want to create a method to print the information in the main class.
			//If "N", indicate that a file will not be printed.
			else if (userResponse.equalsIgnoreCase("n"))
			{
				System.out.println("The information will not be printed");
			}
			
			scannerObj.close();
			
			
		} catch (Exception e) {
				System.out.println("Could not initialize Automobile object");
		}
	}
}
