package homework1;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle("red", false, 1));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
