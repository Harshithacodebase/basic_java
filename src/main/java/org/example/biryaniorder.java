package org.example;

public class biryaniorder {
    public class biryaniorder {
        public int orderid;
        public String ordername;
        public String ordertype;
        public String orderplace;
        public String ingredients;
        public int ordercount;
        public biryaniorder (int orderid,String ordername,String ordertype,String orderplace,String ingredients){
            this.orderid=orderid;
            this.ordername=ordername;
            this.ordertype=ordertype;
            this.orderplace=orderplace;
            this.ingredients=ingredients;
            ordercount++;
        }
        public String getIngredients(String ingredients){
            if (ingredients == "masala"){
                return "masala is included";
            }else if (ingredients == "spicies"){
                return"spicies is included";
            }else if (ingredients == "basmathi rice"){
                return "basmathi rice is included";
            }else if (ingredients == "chicken"){
                return "chicken is included";
            }else{
                return"this is not included";
            }
        }
        public int getOrdercount(){
            return ordercount;

        }
        public String getOrderplace(){
            return orderplace;
        }
        public String void main (String ar[]){
            biryaniorder bi = new biryaniorder(int orderid:1, String ordername:"chicken", String ordertype:"nonveg", String orderplace:"hyd", String ingredients:"masala");
            System.out.println(bi.ingredients);
            System.out.println(bi.getIngredients("masala"));
            System.out.println(bi.orderid);
            System.out.println(bi.getOrdercount());
            System.out.println(bi.getOrderplace());
        }

    }

        }
