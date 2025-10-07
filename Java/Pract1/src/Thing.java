public class Thing {
    private String name;
    private Material material;
    private double value;



    public Thing(String name, Material material, double value) {
        this.material = material;
        this.name = name;
        this.value = value;
    }

    public double getMass(){
        return material.getDensity() * value;
    }

    public void show(){
        System.out.printf("%s;%s;%d;%.2f;%.2f", name, material.getSubstance(), material.getDensity(), value, getMass());
    }
}
