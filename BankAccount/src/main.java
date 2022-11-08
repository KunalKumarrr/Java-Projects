public class main {
    public static void main(String[] args) {
        /*public BankAccount(String account_number, double balance, String customer_name,String email,String phone_number)*/
        String newline=System.lineSeparator();
        BankAccount KunalAccount=new BankAccount();
        BankAccount AnjaliAccount=new BankAccount("1023770042",40000,"Anjali Kumari","anjalikumari2k18@gmail.com","6001541088");
        System.out.println(" Account number  " +AnjaliAccount.getAccount_number() +newline
                            + " Account Name " +AnjaliAccount.getCustomer_name()+newline+
                                "Customer Email : " +AnjaliAccount.getEmail()+newline
                                +"Customer phone number : "+AnjaliAccount.getPhone_number());
        KunalAccount.deposit(50000);
        KunalAccount.withdrawal(10000.0);
        KunalAccount.setEmail("kunalkumar2k18@gmail.com");
        KunalAccount.setCustomer_name("Kunal Kumar");
        KunalAccount.setPhone_number("7002415032");
        System.out.println(" Customer name is : "+KunalAccount.getCustomer_name() + "And their phone number is : " + KunalAccount.getPhone_number());
VipCustomer person1=new VipCustomer();
        System.out.println(person1.getName());


    }
}
