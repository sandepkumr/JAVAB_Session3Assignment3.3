/**
 * 
 */
package assignment3_3;

/**
 * java program to demonstrate Constructor Chaining. Between the same class and between the child and parent class.
 *
 */

class SolarSystem { //Class Solar system
	
	SolarSystem() { // Default constructor to print a message
		System.out.println("Welcome to you our solar system"); // Print 
	}
	
	SolarSystem(String planetName){//Constructor overloading with a Parameter as planetName
		this();						// Calling the default constructor 
		System.out.println(planetName+" belongs to our solar system"); // Print the message that planet belongs to Solarsystem
	}
} // solar system class closed

class Planet extends SolarSystem { 	//Class planet a child in Solar system
	
	static String planetName;	   	// Declaring planetName as class variable 
	
	Planet(String planetName){		// Define Single parameter constructor to call parent constructor an print a message
		super(planetName);			// Call single parameter constructor from solar system to say its from this solar system
		System.out.println(planetName+" is a planet");	// Print message that its a planet
	}
	
	Planet(){						//  Default constructor
		this(planetName);			// Calling Single parameter constructor to say details of planet
		System.out.println(planetName+" is round"); // Print planets is round
	}
	
	
	public String toString() {		// toString method to print planets name	
		return planetName;
	}
	
} // Planet class closed
class Assignment3_3 { // Class with main to create and call Planet object

	public static void main(String[] args) { // main method start
		// TODO Auto-generated method stub
		Planet.planetName="Earth"; 			// Instantiate planet name as earth
		Planet planet = new Planet();		// Create planet object using default constructor and see constructor chaining
		System.out.println(planet);			// Print plant object
		

	}

}// Class closed
