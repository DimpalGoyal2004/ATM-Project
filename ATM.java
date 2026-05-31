import java.util.*;
class ATM{
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        //Create pin
        System.out.print("Create PIN :");
        int correctPin = sc.nextInt();
        
        System.out.println("PIN created successfully.");
        
        System.out.println("Enter initial Balance:");
        double bal = sc.nextDouble();
        
        //Login
        System.out.println("Enter pin: ");
        int pin = sc.nextInt();
        if(pin==correctPin){
            
            System.out.println("Login successfully");
            
        int choice;
       
        do{
            
        System.out.println("\n===ATM MENU===");
        System.out.println("1. check Balance");
         System.out.println("2.Deposit Money");
          System.out.println("3.Withdraw Money");
           System.out.println("4.Exit");
             System.out.println("Enter your choice:");
            
             choice  = sc.nextInt();
            
             switch(choice){

                 case 1:
                     System.out.println("Current Balance:"+bal);
                     break;
                    
                     case 2:
                         System.out.println("Enter amount to Deposit:");
                         double deposit = sc.nextDouble();
                         bal = bal+deposit;
                         System.out.println("Deposited Successfully");
                          System.out.println("Update balance"+bal);
                          break;
                        
                          case 3:
                          System.out.println("Enter amount to withdraw:");
                          double withdraw = sc.nextDouble();
                          
                          if(withdraw<=bal){
                              bal = bal-withdraw;
                          
                          System.out.println("Please collect your cash.");
                          System.out.println("Remaining Balance:"+bal);
             }else{
                 System.out.println("Insufficient Balance!");
             }
             break;
             case 4:
                 System.out.println("Thank you for using ATM!");
                 
                 break;
               
                 default:
                     System.out.println("Invalid choice!");
                  }
                } while(choice!=4);
            }
         else{
                System.out.println("Incorrect PIN!");
            }
        sc.close();
    }
}
