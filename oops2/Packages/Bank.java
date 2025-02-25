package packages;

class Account {

    public String name;
    protected String email;
    private String password;

    //getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {

    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.name = "Anmol";
        acc1.email = "anmol@gmail.com";
        acc1.setPassword("1234");
        System.out.println(acc1.getPassword());

    }
}
