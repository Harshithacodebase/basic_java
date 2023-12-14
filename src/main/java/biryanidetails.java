public class biryanidetails {
    public static void main (String ar[]){
            biryaniorder biryani = new biryaniorder(int orderid: 1,String ordername:"non veg",String orderplace:"elr",String ingredients: "masala");
            System.out.println(biryani.getIngredients("masala") +" "+biryani.getIngredients("mutton"));
            System.out.println(biryani.getOrdercount());
            System.out.println(biryani.getOrderplace());

    }
}
