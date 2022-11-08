public class main {
    public static void main(String[] args) {
        Hamburger hamburger= new Hamburger("Basic","Sousage",3.56,"White");
        double price=hamburger.itemsizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Tomato",0.75);
        hamburger.addHamburgerAddition3("Tomato",1.13);
        System.out.println("Total Burger price is " +hamburger.itemsizeHamburger());
    }
}
