public class DogMiddleRobot extends Robot{
    public DogMiddleRobot(){
        setName("Cat Dog-terrain robot mk.2");
        getParts().add("Chassis");
        getParts().add("Dog head");
        getParts().add("Dog tail");
        getMaterials().add("Artificial skin");
        getMaterials().add("All-weather protection");
    }

    public void assembly(){
        System.out.println("Add defense");
    }
}
