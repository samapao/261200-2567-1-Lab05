class Admin extends User{
    public Admin(){
        super("Admin", 2004, 9, 30);
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setDob(int year, int month, int day){
        this.birdYear = year;
        this.birdMonth = month;
        this.birdDay = day;
    } 

    String getName(){
        return this.name;
    }

    void doSomething(){
        
        if (super.getMonth() == birdMonth && super.getDay() == birdDay){
            System.out.println("Happy Birthday! " + getName());
        } else {
        System.out.println("Hello admin " + getName());
        }
    }    

    void doSomething(int n){
        for (int i = 0; i < n; i++){
            super.doSomething();
        }
    }

}