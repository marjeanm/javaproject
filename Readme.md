# Rescue Animal Management System

This project is a system to manage the intake, reservation, and printing of data related to rescue animals, including **Dogs** and **Monkeys**. The system allows users to:

- Intake new dogs and monkeys
- Reserve animals for service
- View lists of animals based on certain criteria (e.g., all dogs, all monkeys, available animals)

## Table of Contents
- [Classes Overview](#classes-overview)
  - [RescueAnimal Class](#rescueanimal-class)
  - [Dog Class](#dog-class)
  - [Monkey Class](#monkey-class)
- [Functionality](#functionality)
  - [Main Menu](#main-menu)
  - [Menu Options](#menu-options)
- [How to Run the Project](#how-to-run-the-project)

## Classes Overview

### RescueAnimal Class

The `RescueAnimal` class is the base class for all animals. It contains common properties and methods shared by all animals, including:

- `name`
- `animalType`
- `gender`
- `age`
- `weight`
- `acquisitionDate`
- `acquisitionCountry`
- `trainingStatus`
- `reserved` (boolean indicating if the animal is reserved)
- `inServiceCountry`

### Dog Class

The `Dog` class extends the `RescueAnimal` class and adds additional properties specific to dogs, such as `breed`. 

#### Constructor:
The constructor initializes a dog with the following properties:
- `name`
- `breed`
- `gender`
- `age`
- `weight`
- `acquisitionDate`
- `acquisitionCountry`
- `trainingStatus`
- `reserved`
- `inServiceCountry`

#### Methods:
- **getBreed()**: Returns the breed of the dog.
- **setBreed(String dogBreed)**: Sets the breed of the dog.

### Monkey Class

The `Monkey` class extends the `RescueAnimal` class and adds properties specific to monkeys, such as `height`, `tailLength`, and `bodyLength`.

#### Constructor:
The constructor initializes a monkey with the following properties:
- `name`
- `species`
- `gender`
- `age`
- `weight`
- `height`
- `bodyLength`
- `tailLength`
- `acquisitionDate`
- `acquisitionCountry`
- `trainingStatus`
- `reserved`
- `inServiceCountry`

#### Methods:
- **getSpecies()**: Returns the species of the monkey.
- **getHeight()**: Returns the height of the monkey.
- **getBodyLength()**: Returns the body length of the monkey.
- **getTailLength()**: Returns the tail length of the monkey.

## Functionality

### Main Menu

The program operates through a text-based menu system. The main menu allows users to interact with the system by selecting different options to manage animals.

### Menu Options

1. **Intake a New Dog**: Adds a new dog to the system by entering its details.
2. **Intake a New Monkey**: Adds a new monkey to the system by entering its details.
3. **Reserve an Animal**: Marks an animal as reserved for service.
4. **Print a List of All Dogs**: Prints a list of all dogs in the system.
5. **Print a List of All Monkeys**: Prints a list of all monkeys in the system.
6. **Print a List of All Animals Not Reserved**: Prints a list of animals that are not reserved.
7. **Quit**: Exits the program.

### Print Animals

The `printAnimals()` method prints the list of animals based on the selected option. The animals can be filtered by:
- **Dogs**
- **Monkeys**
- **Animals Not Reserved** (combination of all animals that are trained and not reserved)

## How to Run the Project

1. Clone or download this repository to your local machine.
2. Compile the Java files using a Java compiler (e.g., `javac *.java`).
3. Run the program using the `java Driver` command.
4. Follow the on-screen instructions to interact with the system.

## Example Output

When running the program, you will be presented with the following menu:

