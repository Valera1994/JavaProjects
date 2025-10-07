public class CatMiddleRobot extends Robot{
    public CatMiddleRobot(){
        setName("Cat All-terrain robot mk.2");
        getParts().add("Chassis");
        getParts().add("Cat head");
        getParts().add("Cat tail");
        getMaterials().add("Artificial skin");
        getMaterials().add("All-weather protection");
    }

    public void assembly(){
        System.out.println("Add defense");
    }
}
