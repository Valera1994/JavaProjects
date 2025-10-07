public class Plane {
    private String constructor;
    private int year;
    private int length;
    private int weight;
    private int volume;

    public Plane(String constructor, int year, int length, int weight) {
        this.constructor = constructor;
        this.length = length;
        this.volume = 0;
        this.weight = weight;
        this.year = year;
    }
    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, объем топлива в баке: %d",
                constructor, year, length, weight, volume);
    }

    public void fillUp(int volume){this.volume = volume;}

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public static void isMore(Plane plane1, Plane plane2){
        if(plane1.getLength() > plane2.getLength()){
            System.out.printf("Самолет производства %s длиннее самолета производства %s", plane1.constructor, plane2.constructor);
        }else if(plane1.getLength() < plane2.getLength()){
            System.out.printf("Самолет производства %s длиннее самолета производства %s", plane2.constructor, plane1.constructor);
        }else{
            System.out.println("Длины самолетов равны");
        }
    }

    @Override
    public String toString() {
        return "Plane{" +
                "constructor='" + constructor + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }
}
