//Marjean Mayo-Baker 

// inheriets attributes form the resuce animal calss
public class Monkey extends RescueAnimal {
	//defines the public varibles
private int height; 
private int tailLength; 
private int bodyLength;
private String species; 
	// creates new attributes for the monkey class
public Monkey(int height, int tailLength, int bodyLength,String species,String name, String gender, String age,
String weight, String acquisitionDate, String acquisitionCountry,
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
		//define the attribles
       	setHeight(height);
       setTailLength(tailLength);
       setBodyLength(bodyLength);   
       setSpecies(species);
}
//Accessors method 
	public int  getTailLength() {
		return tailLength; 
	}
	
	public int getHeight() {
		return height; 
	}
	public int getBodyLength() {
		return bodyLength; 
	}
	public String getSpecies() {
		return species; 
	}      

	//Mutator mehtod 
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	public void setHeight(int height) {
		this.height = height; 
	}
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength; 
	}
	public void setSpecies(String species) {
		this.species = species; 
	}

	
	}
	
	






