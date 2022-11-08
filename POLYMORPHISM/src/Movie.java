 class Movie {
    private String name;
    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "No Plot here";

    }

     public String getName() {
         return name;
     }
 }
 class Tirangaa extends Movie{

    public Tirangaa() {
        super("Tirangaa");
    }
    public String plot(){
        return "Ganda Swami tries to destroy India but Brigadier hides the fuse conductor.";
    }

}
class Vikram_Vedha extends Movie{
    public Vikram_Vedha() {
        super("Vikram_Vedha");
    }
    @Override
    public String plot(){
        return "Vikram, a pragmatic policeman, and his partner Simon are on the hunt to capture Vedha. When Vedha voluntarily surrenders, he offers to tell Vikram a story, throwing Vikram's life into disarray.";
    }
}
class Sanam_Teri_Kasam extends Movie{
    public Sanam_Teri_Kasam() {
        super("Sanam Teri Kasam");
    }
    @Override
    public String plot(){
        return "When Saraswati's father throws her out of the house, Inder stands with her against all odds and this brings them close to each other. However, destiny has its own plans to separate them.";

    }
}
class Panchayat extends Movie{
    public Panchayat() {
        super("Panchayat");
    }
}



