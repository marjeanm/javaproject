import java.util.ArrayList;

// imports the array list 
import java.util.Scanner;
// imports the scanner method

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    // adding monkey array
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    /// STRING FOR SPECIES

    public static void main(String[] args) {
        // scanner to input
        Scanner scan = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.

        char userChoice = 0;

        while (userChoice != 'q') {

            displayMenu();
            userChoice = scan.nextLine().charAt(0);
            // wanted to switch it up and use a switch statment instead of ifelse i find it
            // is easier to read.
            switch (userChoice) {
                case '1':
                    intakeNewDog(scan);
                    break;

                case '2':
                    intakeNewMonkey(scan);
                    break;
                case '3':
                    reserveAnimal(scan);
                    break;
                case '4':
                    printAnimals(userChoice);
                    break;

                case '5':
                    printAnimals(userChoice);
                    break;
                case '6':
                    printAnimals(userChoice);
                    break;

                default:
                    break;
            }

        }

        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
        // method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "Canada", "trained",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "trained", false,
                "canada");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Peru ");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("pops", "Capuchin", "Female", "15", "Pops", "5", "35", "15", " 5-25-62",
                "United States",
                "trained", true, "United States");
        Monkey monkey2 = new Monkey("cheeseBurger", "Guenon", "male", "6", "250", "male", "60", "12", "4-5-02",
                "United States",
                "trained", false, "United States");
        Monkey monkey3 = new Monkey("River", "Marmoset", "female", "40", "380", "52", "85", "25", "5-6-88",
                "United States",
                "trained", false, "United States");
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println(("dog's breed?"));
        String breed = scanner.nextLine();

        System.out.println("Gender?");
        String gender = scanner.nextLine();

        System.out.print("Age?");
        String age = scanner.nextLine();

        System.out.print("Weight ?");
        String weight = scanner.nextLine();

        System.out.println(" Acquisition Date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("Acquisition Country?");
        String acquisitionCounty = scanner.nextLine();

        System.out.println("Training Status ?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Reserved [true or false]");
        boolean reserved = scanner.nextBoolean();

        System.out.println("Service Country");
        String ServiceCountry = scanner.next();
        // ADDED the added varibles by the user to the array

        dogList.add(new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCounty, trainingStatus,
                reserved, ServiceCountry));

    }

    // Complete intakeNewMonkey

    // For the project submission you must also validate the input
    // to make sur the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the Monkey's name?");
        String Mname = scanner.nextLine();

        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(Mname)) {
                System.out.println("\n\nThis Monkey is already in our system\n\n");
                return;
            }

        }
        // Instantiate and add the new monkey to the appropriate list

        System.out.println(("Species?"));
        String species = scanner.nextLine();

        while (!species.equals("Capuchin")
                && !species.equals("Guenon") && !species.equals("Macaque")
                && !species.equals("Marmoset")
                && !species.equals("Squirrel monkey")
                && !species.equals("Tamarin")) {

            System.out.println("Not a valid species.");
            scanner.next();

        }

        // revamp this and match the varibles

        System.out.print("What is " + Mname + " age");
        String age = scanner.nextLine();

        System.out.print("What is " + Mname + " gender");
        String gender = scanner.nextLine();

        System.out.print("What is " + Mname + " weight");
        String weight = scanner.nextLine();

        System.out.print("What is " + Mname + " height");
        String height = scanner.nextLine();

        System.out.print("What is " + Mname + " bodyLength");
        String bodyLength = scanner.nextLine();

        System.out.print("What is " + Mname + " tailLength");
        String tailLength = scanner.nextLine();

        System.out.print("what is " + Mname + " acquisitionDate");
        String acquisitionDate = scanner.nextLine();

        System.out.print("what is " + Mname + "acquisitionCountry");
        String acquisitionCountry = scanner.nextLine();

        System.out.print("What is " + Mname + " trainingStatus");
        String trainingStatus = scanner.nextLine();

        System.out.print(" is " + Mname + " Reserved [true or false]");
        boolean reserved = scanner.nextBoolean();
        System.out.print(reserved);

        System.out.print(" is " + Mname + " inServiceCountry");
        String inServiceCountry = scanner.nextLine();

        // adding the updated varibles to the array.
        Monkey NewMonkey = new Monkey(Mname, species, gender, age, weight, height, bodyLength, tailLength,
                acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        monkeyList.add(NewMonkey);
    }

    // this method has been really challanging for me. I was able to get the reset
    // but i just can't access the Inservicecountry datavarible.

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("what animal will be needed.");
        String animalType = scanner.nextLine();

        System.out.println("where will the animal bbe serving  (Country)");
        String animalCountry = scanner.nextLine();

        if (animalType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equalsIgnoreCase(animalCountry) && !dog.getReserved()) {
                    dog.setReserved(true);
                    dog.setInServiceCountry(animalCountry);
                    System.out.print(dog.getName() + " Has been reserved.");
                    return;
                }

            }
        }

        if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(animalCountry) && !monkey.getReserved()) {
                    monkey.setReserved(true);
                    monkey.setInServiceCountry(animalCountry);

                    System.out.println(monkey.getName() + " has been reserved.");
                    return;
                }
            }
        }
    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is
    // reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be
    // implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(char userChoice) {

        if (userChoice == '4') {
            for (Dog dog : dogList) {
                System.out.println(dog.getName());
            }
        } else if (userChoice == '5') {
            for (Monkey monkey : monkeyList) {
                System.out.println(monkey.getName());

            }
        } else if (userChoice == '6') {
            // loop around and get all information for the dogs
            for (Dog dog : dogList) {
                // create varibles to print out all non reserved dogs

                // validate the reserved status
                if (dog.getReserved()) {
                    // continue if the validation passes
                    System.out.print(dog.getName() + " " + " is Reserved " + dog.getReserved() + " , "
                            + dog.getTrainingStatus() + ","
                            + dog.getAcquisitionLocation());
                }
                for (Monkey monkey : monkeyList) {

                    if (monkey.getReserved()) {
                        System.out.print(monkey.getName() + " " + " is  Reserved " + monkey.getReserved() + " , "
                                + monkey.getTrainingStatus() + " , "
                                + monkey.getAcquisitionLocation());
                    }
                    // print all non reserved dogs

                }

            }
        }
    }
}