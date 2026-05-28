import java.util.Scanner;

public class foodorder {
    public static void main(String[]args){
        int order;
        Scanner obj=new Scanner(System.in);
        System.out.println("---menu card--");
        System.out.println("1.Burger-100 rs");
        System.out.println("2.pizza-200 rs");
        System.out.println("3.Sandwize-130 rs");
        System.out.println("4.chicken bariyani-150 rs");
        System.out.println("5. Exit");
        System.out.println("select your order.");
        order=obj.nextInt();
        switch(order){
            case 1:
                int qty;
                System.out.println("quantity of burger");
                qty=obj.nextInt();
                System.out.println("total price="+qty*100);
                break;
            case 2:
                System.out.println("quantity of pizza");
                qty=obj.nextInt();
                System.out.println("total price"+qty*200);
                break;
            case 3:
                System.out.println("quantity of sandwize");
                qty=obj.nextInt();
                System.out.println("total price="+qty*130);
                break;
            case 4:
                System.out.println("quantity of chicken bariyani");
                qty=obj.nextInt();
                System.out.println("total price="+qty*150);    
                break;
            default:
                System.out.println("invalid order");       
        }

    }
}
