/**
 * Created by Austin on 4/18/2017.
 */
public class OddNumbers {
    public static void main(String[] args) {

        int [] myarray = {6, 2, 3};

        System.out.println(returnOddNumbers(myarray));

    }

    public static int returnOddNumbers(int numbers []){

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] %  2 == 0) {

                System.out.println("The number is even");

                int [] myarray_of_evens = new int[10];

                myarray_of_evens[i] = numbers[i];

                for (int j = 0; j < myarray_of_evens.length; j++) {

                    System.out.println(myarray_of_evens[i]);
                }

                return numbers[i];

            }else
                System.out.println("The number is odd");
                return numbers[i];
            }

        return 0;
    }

    public static int returnOddNumbers1(int numbers []){

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] %  2 == 0) {

                System.out.println("The number is even");

                int [] myarray_of_evens = new int[10];

                myarray_of_evens[i] = numbers[i];

                for (int j = 0; j < myarray_of_evens.length; j++) {

                    System.out.println(myarray_of_evens[i]);
                }

                return numbers[i];

            }else
                System.out.println("The number is odd");
            return numbers[i];
        }

        return 0;
    }
}
