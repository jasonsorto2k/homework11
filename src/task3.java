public class task3 {

    public static void main(String[] args) {

        // Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String[][] grades = {{"Jason", "Javier", "Jasmin", "Jess"},
                             {"A", "B", "B", "C"}
        };

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if(j<=2){
                    System.out.println(grades[i][j]);
                }

            }

        }

    }
}
