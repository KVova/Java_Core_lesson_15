package volodymyr;

public class Animal {

	private String petType;
	private String animalName;
	
	public Animal(String petType, String animalName) {
		super();
		this.petType = petType;
		this.animalName = animalName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		return "Animal [petType=" + petType + ", animalName=" + animalName + "]";
	}
}