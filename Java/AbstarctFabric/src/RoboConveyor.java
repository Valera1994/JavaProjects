public abstract class RoboConveyor {
    Robot assemblyRobot(String type){
        Robot robot = createRobot(type);
        robot.details();
        robot.assembly();
        robot.dressing();
        return robot;
    }

    public abstract Robot createRobot(String type);
}
