/**
 * Created by aharshberger on 4/19/17.
 */
public class Car {

    String model;
    String noPlate;
    String color;
    int noDoors;

    void start(){
        System.out.println("The car starts");
    }

    void drive(){

    }

    void handBrake(){

    }

    public Car(String newModel, String newNoPlate, String newColor, int newNoDoors){

        model = newModel;
        noPlate = newNoPlate;
        color = newColor;
        noDoors = newNoDoors;

    }

    public static Car car = new Car("Honda", "FVB123", "Red", 4);


    public static void main(String[] args) {

        System.out.println();

        car.start();
    }

}


