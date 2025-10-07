public class Task10 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boing", 2015, 50, 10000);

        plane.info();
        plane.setYear(2020);
        plane.setLength(20);
        System.out.println();
        plane.info();
        plane.fillUp(50);
        plane.fillUp(80);
        System.out.println();
        plane.info();
    }
}
