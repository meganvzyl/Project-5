
public class Animal { //a class to display the attributes of an animal
	private int numTeeth = 0; //declaring attributes
	private boolean veg = false;
	private boolean spots = false;
	private int weight = 0;
	
	public Animal(int numTeeth,boolean veg, boolean spots, int weight){ //declaring the animal class
		this.setNumTeeth(numTeeth); //declaring keywords
		this.setVeg(veg);
		this.setSpots(spots);
		this.setWeight(weight);
		
	}
	
	public int getNumTeeth(){ //method returns the variable value
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) { //sets the value
		this.numTeeth = numTeeth;
	}
	
	public boolean getVeg( ) { //method returns the variable value
		return veg;
	}
	
	public void setVeg(boolean veg) { //sets the value
		this.veg = veg;
	}
	
	public boolean getSpots() { //method returns the variable value
		return spots;
	}

	public void setSpots(boolean spots) { //sets the value
		this.spots = spots;
	}

	public int getWeight() { //method returns the variable value
		return weight;
	}

	public void setWeight(int weight) { //sets the value
		this.weight = weight;
	}
	      
}

class Lion extends Animal { // a subclass which extends to Animal
	private boolean mane; //create variables specific to this class
	private String type;
	
	public Lion(int numTeeth,boolean veg, boolean spots, int weight, boolean mane) { //declaring the lion class
		super (numTeeth,veg ,spots, weight); //refers to attributes in the animal class
		this.setMane(mane);
		this.setType(type); //type of lion conditions
		if (weight < 80) {
			type = "Cub";
		}
		else if (weight < 120) {
			type = "Female";
		}
		else if (weight > 120) {
			type = "Male";
		}
	}
	public boolean getMane() { //method returns the variable value
		return mane;
	}
	
	public void setMane(boolean mane) { //sets the value
		this.mane = mane;
	}
	public String getType() { //method returns the variable value
		return type;
	}
	
	public void setType(String type) { //sets the value
		this.type = type;
	}
	
	public String toString() //to String method, string representation of the object
    { 
        return ("The type of lion is: "+ type); 
    } 
}




