public class SingletonDesignPattern {

    private static SingletonDesignPattern singletondesignpattern = null;
    public String name;
    public String department;

    public SingletonDesignPattern(String name, String department){
        this.name = name;
        this.department = department;
    }

    public static  SingletonDesignPattern getInstance(){
        if(singletondesignpattern == null){
            return singletondesignpattern = new SingletonDesignPattern("Harshi","ECE");
        }
        return singletondesignpattern;
    }

    public static void main(String ar[]){

        singletondesignpattern = SingletonDesignPattern.getInstance();
        System.out.println(singletondesignpattern.name);
        System.out.println(singletondesignpattern.department);

        System.out.println(SingletonDesignPattern.getInstance().name);
        System.out.println(SingletonDesignPattern.getInstance().department);
    }
}
