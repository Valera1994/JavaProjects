public class Automobile {
    private int year;
    private String color;
    private String model;


    public Automobile(){}
    public Automobile(int year, String color, String model){
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){return year;}
    public String getColor(){return color;}
    public String getModel(){return model;}

    public void myIntro(){System.out.println("Это автомобиль");}
    public void myAge(int year){System.out.println(year - this.year);}


}
