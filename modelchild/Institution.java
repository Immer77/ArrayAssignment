package modelchild;

import java.util.Arrays;

public class Institution {
    private String name;
    private String adress;
    private Child[] children; //Indeholder alle børnene
    private int numberOfChildren;
    private final int MAX_NUMBER_OFF_CHILDREN = 100;


    public Institution(String name, String adress){
        this.adress = adress;
        this.name = name;

        numberOfChildren = 0;
        children = new Child[MAX_NUMBER_OFF_CHILDREN];

    }

    public void addChild(Child child){
        if(numberOfChildren < MAX_NUMBER_OFF_CHILDREN){
            children[numberOfChildren] = child;
            numberOfChildren++;
        }
    }

    public int averageAge(){
        int average = 0;
        int sum;
        for (int i = 0; i < numberOfChildren; i++) {
            average = children[i].getAge() + average;
        }
        return sum = average / numberOfChildren;
    }
    public int numberOfGirls(){
        int sum = 0;

        for (int i = 0; i < numberOfChildren; i++) {
            if(!children[i].isBoy()){
                sum++;
            }
        }
        return sum;
    }

    public int numberOfBoys(){
        int sum = 0;

        for (int i = 0; i < numberOfChildren; i++) {
            if(children[i].isBoy()){
                sum++;
            }
        }
        return sum;
    }
}
