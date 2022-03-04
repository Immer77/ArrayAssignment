package modelchild;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(0, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old
		Child c3 = new Child(2,false);

		c1.getAge();
		Institution institution = new Institution("Troldebassen","Villerup");

		institution.addChild(c1);
		institution.addChild(c2);
		institution.addChild(c3);
		System.out.println(institution.averageAge());
		System.out.println(institution.numberOfGirls());
		System.out.println(institution.numberOfBoys());

		System.out.println("Et barn på " + c1.getAge());


	}

}
