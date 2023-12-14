 public class primitive_datatypes {
    static byte b = 15;
    static short s = 234;
    static int i = 777;
    static long l = 2809;
    static float f = 4745;
    static double d = 9877;
    static char c ='H';
    //casting
     static byte b1 = (byte)s;
     static byte b2 = (byte)i;
     static byte b3 = (byte)l;
     static byte b4 = (byte)f;
     static byte b5 = (byte)d;
     static byte b6 = (byte)c;
     public static void main (String args[]){
         primitive_datatypes p = new primitive_datatypes();
         System.out.println(p.b);
         System.out.println(p.b1);
         System.out.println(p.s);
         System.out.println(p.b2);
         System.out.println(p.i);
         System.out.println(p.b3);
         System.out.println(p.l);
         System.out.println(p.b4);
         System.out.println(p.f);
         System.out.println(p.b5);
     }
}
