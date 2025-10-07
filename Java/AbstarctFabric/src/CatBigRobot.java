public class CatBigRobot extends Robot{
    public CatBigRobot(){
        setName("Cat All-terrain battle robot mk.3");
        getParts().add("Chassis");
        getParts().add("Cat head");
        getParts().add("Cat tail");
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
