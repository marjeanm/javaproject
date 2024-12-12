//Marjean Mayo-Baker 

// inheriets attributes form the resuce animal calss
public class Monkey extends RescueAnimal {
	// defines the public varibles
	private String height;
	private String tailLength;
	private String bodyLength;
	private String species;

	// wanted to create a new class with the array but the instructions in doesn't
	// allow for another file

	// creates new attributes for the monkey class
	public Monkey(String name, String species, String gender, String age,
			String weight, String height, String bodyLength, String tailLength,
			String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		// define the attributes
		setHeight(height);
		setTailLength(tailLength);
		setBodyLength(bodyLength);
		setSpecies(species);
	}

	// Accessors method
	public String getTailLength() {
		return tailLength;
	}

	public String getHeight() {
		return height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	// Mutator method
	public void setTailLength(String tailLength) {
		tailLength = tailLength;
	}

	public void setHeight(String height) {
		height = height;
	}

	public void setBodyLength(String bodyLength) {
		bodyLength = bodyLength;
	}

	public void setSpecies(String species) {
		species = species;
	}

}
