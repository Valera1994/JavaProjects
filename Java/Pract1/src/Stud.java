public class Stud extends Human{
    private String group;
    public Stud(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + this.getName());
    }
}
