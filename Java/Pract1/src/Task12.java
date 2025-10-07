public class Task12 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boing", 2015, 30,20);
        Plane plane2 = new Plane("Aerobus", 2025, 30,30);

        Plane.isMore(plane1, plane2);
        System.out.println(plane1.toString());
    }
}
