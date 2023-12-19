public class arrayclass {
    String[] str = {"Harshi","Jaswi","Hasish"};
    static int[] intarray = new int[10];
    public static void main(String ar[]){
        intarray[1]=10;
        intarray[2]=30;
        intarray[3]=40;
        intarray[4]=60;
        intarray[0]=70;
        System.out.println(intarray.length);
        System.out.println(intarray[2]);

        //Foreach loop to iterate and print the array

        for (int i :intarray) {
            System.out.println(i);
        }
    // For loop to iterate and Print the array

        for (int i=0;i<=4;i++){
            System.out.println(intarray[i]);
        }
    //different methods for array


    }
}
