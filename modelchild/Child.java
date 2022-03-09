package modelchild;

/**
 * Write a description of class Barn here.
 */
public class Child {
	public int age;
	private boolean boy; // true if the child is a boy

	private double[] nyWeight = new double[10];

	public Child(int age, boolean boy, double[] nyWeight) {
		this.age = age;
		this.boy = boy;

		this.nyWeight = nyWeight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}
	public double getWeight(int age){
		return nyWeight[age];
	}

	//Opgave 4
	public double getIncrease(){
		double maxIncrement = nyWeight[0];
		for (int i = 1; i < nyWeight.length; i++) {
			if(nyWeight[i] - nyWeight[i-1] > maxIncrement){
				maxIncrement = nyWeight[i] - nyWeight[i-1];
			}
		}
		return maxIncrement;
	}

}
