/**
 * Created by Austin on 4/18/2017.
 */
import java.util.*;
public class NumberArrays {
    public static void main(String[] args) {
        int numbers2[] = new int [200];
        numbers2[0] = 3;
        numbers2[1] = 1;
        numbers2[2] = 1;
        numbers2[3] = 2;

        System.out.print(lucky_sevens(numbers2));
    }

    public static boolean lucky_sevens(int arr[]) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                counter = counter + arr[i];
            }
        }
        if (counter == 7) {
            return true;
        } else {
            return false;
        }
    }
}


