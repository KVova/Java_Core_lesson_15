package volodymyr;

import java.util.Scanner;

public class Application {

	public static void menu() {
		System.out.println("Press 1 to add user");
		System.out.println("Press 2 to add animal to club");
		System.out.println("Press 3 to remove animal with club");
		System.out.println("Press 4 to remove user with club");
		System.out.println("Press 5 to remove a specific animal");
		System.out.println("Press 6 to vizualization club");
		System.out.println("Press 9 to exit");
	}	
	
	public static void main(String[] args) {
	
		ZooClub zoo = new ZooClub();		
		Scanner scan = new Scanner(System.in);
		while(true) {
			menu();
			switch(scan.nextLine()) {
			case"1":
				zoo.addUser();
				break;
			case"2":
				zoo.addAnimal();
				break;
			case"3":
				zoo.removeAnimalToUser();
				break;
			case"4":
				zoo.removeUser();
				break;
			case"5":
				zoo.removeAnimalFromAllUser();
				break;
			case"6":
				zoo.vizualizationClub();
				break;
			case"9":
				System.exit(0);
			}
		}
	}
}