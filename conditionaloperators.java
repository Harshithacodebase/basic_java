public class conditionaloperators {
    public static void main(String ar[]){
        //terinary operators
        String university ="ramachandra";
        String sc = (university.equalsIgnoreCase("ramachandra"))?"condition is true":
                "condition is false";
        System.out.println(sc);
        //arthematic operators
        int a =5;
        int b= 2;
        int c= 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //concatination
        String name ="Harshi";
        String name1 ="is";
        int height =154;
        String measure ="inch";
        boolean b1 = true ;
        double weight = 50.2;
        String s= "kg";
        System.out.println(name + " "+name1+ " " + height+" "+measure+" "+b1+" "+weight+ " "+s);

        // logical operators
        int x= 4;
        int y = 16;
        //logical AND
        if (x>4 && y==16){
            System.out.print("true");
            System.out.print("false");

        }
        if (x< 7 && y==16){
            System.out.print("true");

        }else {
            System.out.print("false");
        }
        //logical OR
        if (x>4 || y==16){
            System.out.print("true");
        }else {
            System.out.print("false");

        }
        //bitwise AND
        if (x>4 & y==16){
            System.out.print("true");

        }else{
            System.out.print("false");

        }
        if (x<7 && y==16){
            System.out.print("true");
        }else {
            System.out.print("false");

        }
        //bitwise OR
        if (x>4| y==16){
            System.out.print("true");

        }else {
            System.out.print("false");

        }
        int z = x & y;                        //4 -0100
        System.out.print(z);                  //16-10000
        int z1 = x|y ;                        //
        System.out.print(z1);
    }
}

