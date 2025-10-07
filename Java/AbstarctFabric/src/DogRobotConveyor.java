public class DogRobotConveyor extends RoboConveyor{

    @Override
    public Robot createRobot(String type) {
        if(type.equals("little")){
            return new DogLittleRobot();
        } else if(type.equals("middle")){
            return new DogMiddleRobot();
        } else if(type.equals("big")){
            return new DogBigRobot();
        }else return null;
    }
}
