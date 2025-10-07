public class Teach extends Human{
    private String grad;
    public Teach(String name, String grad){
        super(name);
        this.grad = grad;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.getName());
    }
}
