public class DogBigRobot extends Robot{
    public DogBigRobot(){
        setName("Dog All-terrain battle robot mk.3");
        getParts().add("Chassis");
        getParts().add("Dog head");
        getParts().add("Dog tail");
        getParts().add("Claws");
        getParts().add("Fangs");
        getMaterials().add("Artificial skin");
        getMaterials().add("All-weather protection");
        getMaterials().add("Plasteel armor");
    }

    public void assembly(){
        System.out.println("Add armor and defense");
    }
}
