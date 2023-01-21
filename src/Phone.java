public class Phone {

    // 1. Create a Class “Phone”.
    // Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.


    // ATTRIBUTES

    int size;
    String color;
    String carrier;
    String model;
    int storage;
    String connection;
    boolean faceID;
    boolean fingerPrintScan;

    // BEHAVIORS

    void ring() {
        System.out.println("Phone plays ringtone...");
    }

    void vibrate() {
        System.out.println("buzzz...buzzzz...");
    }

    void call() {
        System.out.println("Ringing...");
    }

    void message() {
        System.out.println("Message sending...");
    }


    public static void main(String[] args) {

        System.out.println("iPhone");
        Phone phone1 = new Phone();
        phone1.size = 6;
        phone1.color = "Black";
        phone1.carrier = "AT&T";
        phone1.model = "iPhone14";
        phone1.storage = 256;
        phone1.connection = "5G";
        phone1.faceID = true;
        phone1.fingerPrintScan = false;

        phone1.ring();
        phone1.vibrate();
        phone1.call();
        phone1.message();

        System.out.println("--------------------");

        System.out.println("Pixel");
        Phone phone2 = new Phone();
        phone2.color = "White";
        phone2.carrier = "Verizon";
        phone2.model = "Google Pixel";
        phone2.storage = 150;
        phone2.connection = "5G";
        phone2.faceID = true;
        phone2.fingerPrintScan = false;

        phone2.ring();
        phone2.vibrate();
        phone2.call();
        phone2.message();

        System.out.println("---------------------");

        System.out.println("Samsung");
        Phone phone3 = new Phone();
        phone3.color = "Gray";
        phone3.carrier = "T-Mobile";
        phone3.model = "Samsung Galaxy";
        phone3.storage = 250;
        phone3.connection = "5G";
        phone3.faceID = true;
        phone3.fingerPrintScan = true;

        phone3.ring();
        phone3.vibrate();
        phone3.call();
        phone3.message();


    }
}



