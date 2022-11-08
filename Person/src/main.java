public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Kunal");   // firstName is set to empty string
        person.setLastName("Kumar");    // lastName is set to empty string
        person.setAge(22);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setLastName("Smith");// firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
}
