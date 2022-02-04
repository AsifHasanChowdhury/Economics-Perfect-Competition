import java.util.Scanner;

public class Eco_Perfect_Competition {

    static int [] quantity={1,2,3,4,5,6,7,8,9,10};
    static int [] Fixed_Cost={100,100,100,100,100,100,100,100,100,100};
    static int [] Variable_Cost={30,50,60,72,85,110,140,180,230,290};
    static int [] total_Cost=new int[10];
    static float [] Average_Fixed_Cost=new float [10];
    static float [] Average_Variable_Cost=new float[10];
    static float [] Average_Total_Cost=new float[10];
    static float [] Marginal_cost=new float[10];
    static float [] Mr_Mc=new float[10];
    static int Mr;


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marginal Revenue");

        Mr=sc.nextInt();
        create_Cost();
        Marginal_Cost();
        print();


    }


    public static void create_Cost(){


        for(int i=0; i<total_Cost.length;i++){

            total_Cost[i]=Fixed_Cost[i]+Variable_Cost[i];
            Average_Fixed_Cost[i]=Fixed_Cost[i]/quantity[i];
            Average_Variable_Cost[i]=Variable_Cost[i]/quantity[i];

        }

        for(int i=0; i<total_Cost.length; i++){

            Average_Total_Cost[i]=Average_Fixed_Cost[i]+Average_Variable_Cost[i];

        }

    }




    public static void Marginal_Cost(){

   Marginal_cost[0]=130;
   for(int i=1; i<Marginal_cost.length;i++){
    Marginal_cost[i]=(total_Cost[i]-total_Cost[i-1])/(quantity[i]-quantity[i-1]);

   }
   for(int i=0 ; i<Mr_Mc.length; i++){

       Mr_Mc[i]=Marginal_cost[i]-Mr;

   }
    }

    public static void print(){

        System.out.println("===============================================================================================");
        System.out.println(" Q      FC     VC      TC       Avg_FC       Avg_VC    Avg_TC     MC         MC-MR");
        System.out.println("===============================================================================================");

        for(int i=0; i<10; i++){

            System.out.println(" "+quantity[i]+"      "+Fixed_Cost[i]+"     "+ Variable_Cost[i]+"     "+total_Cost[i]+"       "+Average_Fixed_Cost[i]+"      "+Average_Variable_Cost[i]+"         "+ Average_Total_Cost[i]+"     "+Marginal_cost[i]+"         "+Mr_Mc[i]);





        }



    }
}
