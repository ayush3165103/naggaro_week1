import java.util.Scanner;
import java.util.function.DoubleFunction;

class assignment1{

    static double Calci(int ty, int price){
        double tax=0;
        if(ty==1){   //for Raw item{
            tax=price*0.125;
        }
        else if(ty==2){//for Manufactured item{
            tax = price*0.125;
            tax += (tax*0.02);
        }
        else if(ty==3){ //for imported item{
            tax = price*0.1;
            if(tax<100){
                tax+=5;
            }
            else if(tax<200){
                tax+=10;
            }
            else{
                tax+=(tax*0.05);
            }
        }
        return tax;
    }


    public static void main(String args[]){
        boolean add_more=true;
        Scanner sc=new Scanner(System.in);

        while(add_more==true){
            System.out.println();
            System.out.println("====================================================================================================");
            System.out.println("====================================================================================================");
            System.out.print("Item Name: ");
            String item_name=sc.next();
            System.out.println();

            System.out.println("Item Type:");
            System.out.println("Press 1 for Raw");
            System.out.println("Press 2 for Manufactured");
            System.out.println("Press 3 for Imported");
            int item_type=sc.nextInt();
            System.out.println();

            System.out.print("Price of item: ");
            int price=sc.nextInt();
            System.out.println();

            System.out.print("Quantity of item: ");
            int Quantity=sc.nextInt(); 
            System.out.println();
            
            double tax=Calci(item_type, price);
            double val=(price+tax)*Quantity;

            System.out.println(item_name + " " + price + " " + tax + " " + val);

            System.out.println();
            System.out.println("====================================================================================================");
            System.out.println("====================================================================================================");
            System.out.println();

            System.out.print("Do you enter deatils of any other item (y/n) ");
            String ch=sc.next();
            if(ch.equals("n")){
                add_more=false;
                System.out.println("Thank you using our application.");
            }
        }
        sc.close();;
    }
}