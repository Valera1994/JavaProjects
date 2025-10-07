import java.util.ArrayList;

public abstract class Robot {
    private String name;
    private ArrayList materials = new ArrayList<>();
    private ArrayList parts = new ArrayList<>();

    public ArrayList getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList materials) {
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getParts() {
        return parts;
    }

    public void setParts(ArrayList parts) {
        this.parts = parts;
    }

    public void details(){
        String line = "Для робота " + name + "на складе берутся детали: ";
        for (int i = 0; i < parts.size(); i++){
            if(i == parts.size()-1){
                line += parts.get(i) + ".";
            }else {
                line += parts.get(i) + ", ";
            }
        }
        System.out.println(line);
    }

    public void assembly(){
        System.out.println("На конвейере ведется сборка" + name);
    }

    public void dressing(){
        String line = "Внешнее покрытие робота " + name + "делается из: ";
        for (int i = 0; i < materials.size(); i++){
            if(i == materials.size()-1){
                line += materials.get(i) + ".";
            }else {
                line += materials.get(i) + ", ";
            }
        }
        System.out.println(line);
    }
}
