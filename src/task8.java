public class task8 {

    public static void main(String[] args) {

        // Create 2D array of countries:
        // north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored

        String[][] countries = {{"United States", "Canada", "Mexico"},
                {"Bolivia", "Peru", "Brazil"},
                {"Poland", "Germany", "France"},
                {"Mozambique", "Zambia", "Niger"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
        }

        System.out.println("-----------------");

        for (String[] country : countries) {
            for (String country2 : country) {
                System.out.println(country2);
            }
        }

        int totalCountries = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {

            }
            totalCountries = totalCountries + countries[i].length;
        }
        System.out.println("--------------------");
        System.out.println("The total number of countries are " + totalCountries);

    }
}
