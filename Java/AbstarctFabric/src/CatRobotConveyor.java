public class CatRobotConveyor extends RoboConveyor{

    @Override
    public Robot createRobot(String type) {
        if(type.equals("little")){
            return new CatLittleRobot();
        } else if(type.equals("middle")){
            return new CatMiddleRobot();
        } else if(type.equals("big")){
            return new CatBigRobot();
        }else return null;
    }
}
