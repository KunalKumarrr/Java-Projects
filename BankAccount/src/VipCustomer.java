public class VipCustomer {
    private String Name;
    private double creditLimit;
    public VipCustomer() {
        this(" Kunal ", 50000, "kunalkumar2k18@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.Name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private String email;



    }
