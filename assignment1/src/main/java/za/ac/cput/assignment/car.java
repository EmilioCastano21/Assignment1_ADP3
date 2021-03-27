package za.ac.cput.assignment;

//Test car
/*
MUHAMMAD YAASIN COLE 218340869
27/03/2021
* */
public class car {

    private static String colour;
    private static int numberPlate;
    private static String brand ;


    public car() {
    }


    public static int getNumberPlate() {
        return numberPlate;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        car.colour = colour;
    }

    public static void setNumberPlate(int numberPlate) {
        car.numberPlate = numberPlate;
    }

    public static void setBrand(String brand) {
        car.brand = brand;
    }


    @Override
    public String toString() {
        return "car{" +
                "colour" + "is"+
                "brand" + "is" +
                "}";
    }
}
