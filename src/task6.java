public class task6 {

    public static void main(String[] args) {

        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int [][] numbers = {{2,3,4},
                            {6,10,9},
                            {5,9,3}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                sum = sum+numbers[i][j];
            }
        }

        System.out.println("The sum of the elements in the array is:"+sum);


        }
    }

