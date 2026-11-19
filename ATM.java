// My roll number: 202510627

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        final int PASS=1234;
        Scanner input=new Scanner(System.in);
        int trans_hestory[]=new int[10];
        String menu="1. Check balance\n2. Depost mony\n3. Withdrwing mony\n4. View transtions\n5. Exit\n";
        int optinis;
        int password;
        int max_att=3;
        int balance=5000;
        int i=0;
        int hes_i=0;
        int depset;
        
        while (true) {
            System.out.print("Enter your password: ");
            password=input.nextInt();
            if (password==PASS) {
                break;
            }
            
            max_att-=1;
            System.out.println("Wrong password try agin, You have ["+max_att+"] attmed left");
            if (max_att==0) {
                System.out.println("You reche the maxmim attmed");
                System.exit(1);
            }
        }

        System.out.println("Welcom you!");

        while (true) {
            System.out.println(menu);
            System.out.print("Enter one of the options: ");
            optinis=input.nextInt();

            if (optinis==1) {
                System.out.println("Your balance is: "+balance+"\n");
            }

            else if (optinis==2) {
                System.out.print("Enter your amount: ");
                depset=input.nextInt();
                balance+=depset;
                trans_hestory[hes_i]=balance;
                hes_i+=1;
                System.out.println("Your balance is: "+balance+"\n");
            }

            else if (optinis==3) {
                System.out.print("Enter your amount: ");
                depset=input.nextInt();
                if (depset>balance) {

                    System.out.println("Can not do this action, Your balance is: "+balance+" try agen leter\n");
                }else{
                    
                    balance-=depset;
                    trans_hestory[hes_i]=balance;
                    hes_i+=1;
                    System.out.println("Your balance is: "+balance+"\n");
                }  
            }

            else if (optinis==4) {
                for(i=0;i<hes_i;i++){
                    System.out.println("Your hestory is: "+trans_hestory[i]);
                }
                System.out.println();
            }

            else if (optinis==5) {
                System.out.println("Bye!");
                break;
            }
        }
        input.close();
    }
}
