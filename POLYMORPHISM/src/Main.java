public class Main{
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie# " + i +" : "+ movie.getName() + "\n" +
                                "Plot: " +movie.plot() + "\n");
        }


    }
    public static Movie randomMovie(){
        int randomNumber= (int) (Math.random()*4)+1;
        System.out.println("Random Number was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Tirangaa();
            case 2:
                return new Vikram_Vedha();
            case 3:
                return new Sanam_Teri_Kasam();
            case 4:
                return new Panchayat();

        }
        return null;
    }
}
