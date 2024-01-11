public class stringtypes {
    static String str1 = "Hasish";
    static String str2 = "Hasish srujan";
    static String str3 = new String("Hasish");
    static String str2 = "Hasish";
    public static void main(String ar[]) {
        if(str1.equals(str2)){
            System.out.println(str1.hashCode());
            System.out.println(str2.hashCode());
            System.out.println(str1+" "+str2);
            System.out.println(str1.toUpperCase());

            if(str1.equals(str3)) {
                System.out.println(true);
            }else{
                System.out.println(false);
            }

            if(str1.equals(str2)) {
                System.out.println(true);
            }else{
                System.out.println(false);
            }

            stringtypes stringtypes = new stringtypes();
            stringtypes stringtypes1 = new stringtypes();

            System.out.println(str1.startsWith("H"));
            System.out.println(str2.startsWith("Hasish", 5));
            System.out.println(str1.toLowerCase());
            System.out.println(str1.charAt(2));
            System.out.println(str1.compareTo(str3));
            System.out.println(str1.compareToIgnoreCase(str3));
            System.out.println(str1.concat(str2));


        }
    }
}
