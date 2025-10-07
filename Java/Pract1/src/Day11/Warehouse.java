package Day11;

public class Warehouse {
    private int countOrder;
    private double balance;

    @Override
    public String toString() {
        return "Баланс: " + balance +
                ", Количество заказов: " + countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }
}
