package volodymyr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	
	private Map<Person, List<Animal>> club = new HashMap<>();
//	private String petType;
	
	public Map<Person, List<Animal>> getClub() {
		return club;
	}

	public void setClub(Map<Person, List<Animal>> club) {
		this.club = club;
	}
    
	public void addUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: ");
		String name = scan.next();
		System.out.println("Enter userage: ");
		Integer age = scan.nextInt();
		club.put(new Person(name, age), new ArrayList<>());
		System.out.println("User "+name+" was add to club!");
	}
	
	public void addAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pet type: ");
		String petType = scan.next();
		System.out.println("Enter animalname: ");
		String animalName = scan.next();
		
		Iterator<Map.Entry<Person, List<Animal>>> iterator = club.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Person, List<Animal>> pet = iterator.next();
			if(pet.getKey().getName().equalsIgnoreCase(animalName)){
				pet.getValue().add(new Animal(petType, animalName));
			}
		}
		System.out.println("Animal "+animalName+" was add to user!");
	}
	
	public void removeAnimalToUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username :");
		String name = scan.next();
		System.out.println("Enter animalname :");
		String animalName = scan.next();
		
		Iterator<Map.Entry<Person, List<Animal>>> iterator = club.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Person, List<Animal>> pet = iterator.next();
			Iterator<Animal> iterator2 = pet.getValue().iterator();
			while(iterator2.hasNext()) {
				if(iterator2.next().getAnimalName().equalsIgnoreCase(animalName)) {
					iterator2.remove();
				}
			}
		}
		System.out.println("Aminal "+animalName+" was removed from "+name+" user");
	}
	
	public void removeUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username :");
		String name = scan.next();
		
		Iterator<Map.Entry<Person, List<Animal>>> iterator = club.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Person, List<Animal>> pet = iterator.next();
			if(pet.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
		System.out.println("User "+name+" was removed");
	}
	
	public void removeAnimalFromAllUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pet type :");
		String petType = scan.next();
		
		Iterator<Map.Entry<Person, List<Animal>>> iterator = club.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Person, List<Animal>> pet = iterator.next();
			Iterator<Animal> iterator2 = pet.getValue().iterator();
			while(iterator2.hasNext()) {
				if(iterator2.next().getPetType().equalsIgnoreCase(petType));
				iterator2.remove();
			}
		}
		System.out.println("Animals with pet type "+petType+" was removed!");
	}
	
	public void vizualizationClub() {
//		Iterator<Entry<Person, List<Animal>>> iterator = club.entrySet().iterator();
//		while (iterator.hasNext()) {
//            Map.Entry<Person, List<Animal>> pet = iterator.next();
//            System.out.println(pet);
//		}
		Collection<Entry<Person,List<Animal>>> entrySet = club.entrySet();
		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
	}
}