public class Main {
    public static void main(String[] args) {
        RoboConveyor littleCat = new CatRobotConveyor();
        Robot robot = littleCat.createRobot("little");
        System.out.println("С конвеера сошел: " + robot.getName());

        RoboConveyor bigDog = new DogRobotConveyor();
        robot = bigDog.createRobot("big");
        System.out.println("С конвеера сошел: " + robot.getName());
    }
}
