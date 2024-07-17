import java.time.LocalDate;

class User{
    protected String name;
    private LocalDate dob = LocalDate.now();
    protected int birdYear;
    protected int birdMonth;
    protected int birdDay;

    public User(String name, int Year, int Month, int Day){
        this.name = name;
        this.birdYear = Year;
        this.birdMonth = Month;
        this.birdDay = Day;
    }

    int getDay(){
        return this.dob.getDayOfMonth();
    }

    int getMonth(){
        return this.dob.getMonthValue();
    }

    void doSomething(){
        System.out.println("Hello " + name + " who was born on " + birdYear + "/" + birdMonth + "/" + birdDay);

    }

}