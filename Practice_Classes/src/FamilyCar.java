/**
 * Created by aharshberger on 4/19/17.
 */
public class FamilyCar extends Car{

    int noSeats;


    public FamilyCar(String newModel, String newNoPlate, String newColor, int newNoDoors, int noNewSeats) {
        super(newModel, newNoPlate, newColor, newNoDoors);

        noSeats = noNewSeats;
    }

    public static void main(String[] args) {
        FamilyCar.car.start();
        FamilyCar familyCar = new FamilyCar("Ford Van", "FVB234","Blue" ,4, 7 );
        System.out.println(familyCar.noSeats);
    }
}
