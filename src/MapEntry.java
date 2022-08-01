import java.util.*;

public class MapEntry {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		HashMap<String, String> Vehicles = new HashMap<String, String>();

		Vehicles.put("Honda", "Civic");
		Vehicles.put("Toyota", "Camry");
		Vehicles.put("Ford", "F-Series");
		Vehicles.put("Chevy", "Silverado");
		Vehicles.put("GMC", "Sierra");

		System.out.println("What model of Car are you looking for?");
		String Model = input.nextLine();

		for (Map.Entry<String, String> cars : Vehicles.entrySet()) {
			String currentModel = cars.getValue();
			if (Model.equals(currentModel)) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", Model,
						cars.getKey());
			}
		}
	}
}