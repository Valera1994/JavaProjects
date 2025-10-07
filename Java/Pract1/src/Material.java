public class Material {
    private String substance;
    private int density;



    public Material(String substance, int density) {
        this.density = density;
        this.substance = substance;
    }

    public int getDensity() {
        return density;
    }

    public String getSubstance() {
        return substance;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }
}
