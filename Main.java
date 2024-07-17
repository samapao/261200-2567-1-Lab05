class Main {
    public static void main(String[] args) {
        User Sampao = new User("Sampao", 2004, 9,30);
        Sampao.doSomething();

          Admin sam = new Admin();
          sam.setName("Sampao");
          sam.setDob(2004, 9, 30);
          sam.doSomething();
          sam.doSomething(1);
          
          Admin peter = new Admin();
          peter.setName("Peter");
          peter.setDob(2004, 9, 30);
          peter.doSomething();

    }
}
