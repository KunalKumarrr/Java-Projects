public class BankAccount {
    private String account_number;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_number;
    public BankAccount(){
        System.out.println("Empty constructor call");
    }
    public BankAccount(String account_number, double balance, String customer_name,String email,String phone_number){
     this.account_number=account_number;
     this.balance=balance;
     this.customer_name=customer_name;
     this.email=email;
     this.phone_number=phone_number;
    }
    public void deposit(double depositAmount){

    this.balance+=depositAmount;

    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<=0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed ");
        }else{
            this.balance-= withdrawalAmount;
            System.out.println(" Withdrawal of " + withdrawalAmount + "processed . Remaining balance = " +this.balance);

        }

    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
