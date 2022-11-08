public class main {
    public static void main(String[] args) {
        int[] myfirstArray= new int[9999];

        double[] myfirstdoublearray=new double[1000];

        System.out.println(myfirstArray[5]);

//        for(int i=0;i<myfirstArray.length;i++){
//            myfirstdoublearray[i]=i*10;
//            System.out.println("Element " +i+ ", value is " +myfirstdoublearray[i]);
//        }
        printArray(myfirstArray);
        System.out.println(myfirstdoublearray[6]);

        }

    public static void printArray(int[] array) {
        for(int i=0;i< array.length;i++){
            array[i]=i*10;
            System.out.println("Element " +i+ ", value is " +array[i]);
        }
    }
    }

