package bikeproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

public class BikeDriver {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Bike> bikes = new ArrayList<Bike>();

		String command;
		boolean isValidCommand;
		do {
			do {
				System.out.println("\n\nWELCOME TO E-BIKE COMPANY");
				System.out.println("\n\tLet save gas and the Mother Nature\n");
				System.out.println("Pick one...");
				System.out.println("\nA) Create Bike Object\t\t" + "B) Print Inputs\t\t" + "C)Log out");
				System.out.println("\n*Please use Uppercase Letter.*");
				System.out.print("Selected: ");

				command = in.nextLine();
				isValidCommand = !(command.equals("A") || command.equals("B") || command.equals("C"));

				if (isValidCommand) {
					System.out.println("\n****Please follow the instruction.***\n");
				}

			} while (isValidCommand);

			// Executing Command
			switch (command) {
				case "A":
					createBikeObj(bikes);
					break;
				case "B":
					seeBikeDesc(bikes);
					break;
			}

		} while (!command.equals("C"));

		System.out.println("\n\n***Thank you For using this code!***\n\n");
		in.close();
	}

	private static void createBikeObj(ArrayList<Bike> bikes) {

		String bikeVariant;
		boolean isValidBike;

		// Pick which kind of Bike
		do {
			System.out.println("\n\nPick Bike Category: \n");
			System.out.println("A) Touring Bike\t\t" + "B) Road Bike\t" + "C) Mountain Bike\t\t" + "D) Back");
			System.out.print("\nEnter Chosen Bike: ");

			bikeVariant = in.nextLine();
			isValidBike = !(bikeVariant.equals("A") || bikeVariant.equals("B") || bikeVariant.equals("C")
					|| bikeVariant.equals("D"));
		} while (isValidBike);

		// Creating chosen Bike
		switch (bikeVariant) {

			case "A":
				bikes.add(createBike());
				System.out.println("\n\n***Information is now Processing***\n\n");
				break;
			case "B":
				Bike temp1 = createBike();
				// Create Road Bike
				bikes.add(createMountainBike(temp1));
				break;
			case "C":
				Bike temp2 = createBike();
				// Create Mountain Bike
				bikes.add(createRoadBike(temp2));
				break;
		}

	}

	private static Bike createBike() {

		System.out.println("\n\nFill-up the Information...\n");
		System.out.print("Enter Handle Bars: ");
		String handleBars = in.nextLine();

		System.out.print("Enter Frame: ");
		String frame = in.nextLine();

		System.out.print("Enter Tyres: ");
		String tyres = in.nextLine();

		System.out.print("Enter Seat Type: ");
		String seatType = in.nextLine();

		int numGears = 0;
		boolean validInput;
		do {
			validInput = true;
			try {
				System.out.print("Enter No. of Gears: ");
				numGears = in.nextInt();
			} catch (Exception e) {
				System.out.print("\nInput Number ONLY.\n");
				validInput = false;
			} finally {
				in.nextLine();
			}

		} while (!validInput);

		return new Bike(handleBars, frame, tyres, seatType, numGears);
	}

	private static Bike createRoadBike(Bike temp) {

		boolean validInput;

		int tyreWidth = 0;
		do {
			validInput = true;
			try {
				System.out.print("Enter Tyre Width: ");
				tyreWidth = in.nextInt();
			} catch (Exception e) {
				System.out.println("Input Number ONLY.");
				validInput = false;
			} finally {
				in.nextLine();
			}

		} while (!validInput);

		int postHeight = 0;
		do {
			validInput = true;
			try {
				System.out.print("Enter Post Height: ");
				postHeight = in.nextInt();
			} catch (Exception e) {
				System.out.println("Input Number ONLY.");
				validInput = false;
			} finally {
				in.nextLine();
			}

		} while (!validInput);

		return new RoadBike(temp.getHandleBars(), temp.getFrame(), temp.getTyres(), temp.getSeatType(),
				temp.getNumGears(), tyreWidth, postHeight);
	}

	private static Bike createMountainBike(Bike temp) {

		System.out.print("Enter Suspension: ");
		String suspension = in.nextLine();

		System.out.print("Enter type: ");
		String type = in.nextLine();

		int frameSize = 0;
		boolean validInput;
		do {
			validInput = true;
			try {
				System.out.print("Enter Frame size: ");
				frameSize = in.nextInt();
			} finally {
				in.nextLine();
			}

		} while (!validInput);

		return new MountainBike(temp.getHandleBars(), temp.getFrame(), temp.getTyres(), temp.getSeatType(),
				temp.getNumGears(), suspension, type, frameSize);
	}

	private static void seeBikeDesc(ArrayList<Bike> bikes) {

		// Traverse the Bike List
		for (Bike bike : bikes) {
			bike.printDescription();
			System.out.println();
		}
	}

}