public class task4 {

    public static void main(String[] args) {

        // Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String[][] cars = {{"American","German","Korean","Italian"},
                            {"Ford","Land Rover","Hyundai","Fiat"}
        };

        System.out.println("For Loop Method");
        System.out.println();

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        System.out.println("---------------------");

        System.out.println("For each method");
        System.out.println();

        for(String[] car: cars){
            for(String car2: car){
                System.out.println(car2);
            }
        }
    }
}
