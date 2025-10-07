public class Task9 {
    public static void main(String[] args) {
        Automobile car1 = new Automobile();
        Automobile car2 = new Automobile(2010, "Black", "Audi");


        car1.setYear(1999);
        car1.setColor("Red");
        car1.setModel("Porshe");

        System.out.println(car1.getYear() + " " + car1.getColor() + " " + car1.getModel());
        System.out.println(car2.getYear() + " " + car2.getColor() + " " + car2.getModel());
        car1.myAge(2025);
        car2.myIntro();
    }
}
