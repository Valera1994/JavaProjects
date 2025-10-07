import java.util.Random;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(){
        Random random = new Random();
        this.stamina = random.nextInt(90, 101);
        if(Player.countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run(){
        if(this.stamina > 1) {
            this.stamina--;
        }else{
            this.stamina--;
            countPlayers--;
        }
    }

    public static void info(){
        if(countPlayers < 6){
            System.out.printf("Команды неполные, еще есть %d свободных мест", 6 - countPlayers);
        }else{
            System.out.println("Мест в командах больше нет");
        }
    }

    public int getStamina() {
        return stamina;
    }
}
