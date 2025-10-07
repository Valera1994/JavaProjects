package Day11;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        //if (warehouse.getBalance() < 1000000){this.salary += 100;}
        //else {this.salary += 100*2;}
        this.salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000){this.salary += 100;}
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary + "}";
    }
}
