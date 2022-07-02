import java.io.*;
import java.util.*;
import java.lang.*;
public class BacC {    
    public static void sleep(){
        try{
            Thread.sleep(2000);            
        } catch(InterruptedException ex)
      {
          ex.printStackTrace();
     }
    }
     public static void sleep1(){
        try{
            Thread.sleep(1000);            
        } catch(InterruptedException ex)
      {
          ex.printStackTrace();
     }
    }
     public static void calculator(){         
        float A,n=1,I;
        float temp;
        Scanner inp = new Scanner(System.in);
        Scanner inr = new Scanner(System.in);
        Scanner it = new Scanner(System.in);
        System.out.print("\t Enter the Amount(P)(₹) : ");
         float p = inp.nextFloat();       
        System.out.print("\t Enter the Rate of Interest(I)(%) : ");
         float r = inr.nextFloat();          
        System.out.print("\t Enter the Time in peroid in Years : ");
         float t = it.nextFloat();
           temp= (1+(r/100)/n);
           A=(float) (p*Math.pow(temp,(n*t)));
        System.out.println("\t Total Amount Deposit : " +p+ "₹");
            I=A-p;
        System.out.println("\t Total Interset Earn : "+I+ "₹");
        System.out.println("\t Total Amount : "+A+ "₹" );
     }
      public static final String RED = "\033[0;31m";
      public static final String RESET = "\033[0m";
      public static final String GREEN = "\033[0;32m";
      public static final String BLUE = "\033[0;34m"; 
      public static final String YELLOW = "\033[0;33m";
    public static void main(String[] args) {
         int number,x ;
           String text ="\n  \t\t\t    _/\\_  Welcome to Bank Account Comparison  _/\\_ ";
           String text1 ="\n   \t \t \t                 !!.. Thank you for viewing this project ..!! ";
           String text2 = "\n   \t \t \t \t \t \t \t ||__The END__|| ";                                                      
           for(int i =0;i<text.length();i++){
           System.out.print( text.charAt(i));
            try{
             Thread.sleep(50);
            }catch(InterruptedException e){
             e.printStackTrace();
           }
          }         
         sleep();
         System.out.print("\n\n  -> Here your are LOG In with Guest mode");
         sleep();
         System.out.print("\n  -> In this program we will give you best advice for selection of Bank Account, like which types of account we can  open? and  which  bank is best to open an account in that Bank ");
         sleep();
         sleep();
         System.out.print(YELLOW + "\n  \n                      **| Knowledge Fact! |** " + RESET);
         sleep();
         System.out.print("\n  * ' In India we have many types of  Account. '  ");
         sleep();
         System.out.print("\n   -> Account like :  ");
	 sleep();
	 System.out.print("\n   1) Saving Account ");
	 sleep1();
	 System.out.print("\n   2) Current Account ");
	 sleep1();
	 System.out.print("\n   3) Salary Account ");
	 sleep1();
	 System.out.print("\n   4) Fixed Deposit Account");
	 sleep1();
	 System.out.print("\n   5) Demat Account");
	 sleep1();
	 System.out.print("\n   and many more Account are also their.");
	 sleep();
	 System.out.print("\n\n  * But for now we will providing two types of Account detail :");
	 sleep();
         System.out.print(GREEN + "\n    1) Saving Account " + RESET);
         sleep1();
         System.out.print(BLUE + "\n    2) Current Account" + RESET);
         sleep1();
         System.out.print(" \n  and also compare with different bank ");
	 sleep();
	 System.out.print("\n  -> now we will go for comparison of Account with different bank ");
      do
     {
         Scanner n = new Scanner(System.in);
         System.out.print("\n\n  -> enter the number '1','2' and '3' to see  that types of Account comparison and calculator : ");
         number = n.nextInt();   
         switch(number){
             case 1 :
                        System.out.print(GREEN + "\n\t\t\t\t            Saving Account " + RESET);
                        sleep1();
                        System.out.print("\n  \t\t       Here we take two example of Bank for Saving account comparison : 'ABC' and 'XYZ'");
                        sleep1();
                        System.out.print(RED + " \n\n                                                          ABC " + RESET);
                        System.out.print(BLUE + "                                    XYZ"+RESET);
                        sleep1();
                        System.out.print("\n  1.Minimium Balance Requirement :                       10,000                   ||             5,000, Zero");
			sleep1();
			System.out.print("\n  2. Rate of interest            :                        3.00%       \t       ||                  2.80%");
			sleep1();
			System.out.print("\n  3. cash withdrawal limit       :                  15,000 TO 1.5 Lakh            ||           10,000 TO 1 Lakh");
			sleep1();
			System.out.print("\n  4. Cash transaction limit      :                  10,000 TO 3 Lakh              ||           10,000 TO 2 Lakh");
			sleep1();
			System.out.print("\n  5. Fd rate of interest on	\n   	1 year                    :        \t\t    6.00 %      \t       ||                 6.10 %");
			sleep1();
			System.out.print("\n  6. Card Issuer CompaNY         :                Master card / visa              ||           Rupay / Mastercard / visa");
			sleep1();
			System.out.print("\n  7. card                        :   Debit card :           credit card :         ||     Debit card :             Credit card : ");
			sleep1();
			System.out.print("\n                                     .Basic Classic card   .REward credit card    ||     .Basic Classic card      .REward credit card");
			System.out.print("\n                                     .Sliver card          .Student credit card   ||     .Sliver card             .Student credit card");
			System.out.print("\n                                     .Platinum card        .Travel credit card    ||     .Platinum card           .Travel credit card");
			System.out.print("\n                                                           .Business credit card  ||                              .Business credit card ");
			sleep();
			System.out.print("\n  8. Internet Banking            :                     YES                        ||                YES");
			sleep1();
			System.out.print("\n  9. Mobile Banking              :                     YES                        ||                YES");
			sleep1();
			System.out.print("\n 10. NO. of Branch in State      :                     276                        ||                134");
			sleep1();
			System.out.print("\n 11. No. of ATM                  :                     432                        ||                264");
			sleep1();
			System.out.print("\n\n   *Frequently Asked Questions (FAQS) -- Saving Account");
			sleep1();
			System.out.print("\n    Q1. What is saving Account?");
			sleep1();
			System.out.print("\n    Ans. Savings account is a basic account type that lets you deposit money safely with a bank. It ensures safety and \n         access to your money ");
			System.out.print("whenever you need.You can withdraw your funds, either digitally or in person, at any point in time.");
			sleep();
			System.out.print("\n    Q2. Why do you need a Savings Account?");
			sleep1();
			System.out.print("\n    Ans. You need a Savings Bank Account to make and receive payments, pay your credit bills, make investments, etc. You can use your account to \n         pay for utilities such as electricity, and even mobile phone recharges.And, quite simply, you need a Savings Account to save your money,\n         from theft, misplacement, and damage(calamities can strike anytime), because one can only store or carry a limited amount of cash without a constant feeling of apprehension.");
			sleep();
			System.out.print("\n    Q3. What document required for open a saving account?");
			sleep1();
			System.out.print("\n    Ans.  Proof of Age :- PAN card , Voter card or valid government issued ID \n	  Proof of address : -House bill, Elecrticity bill, Driving License\n");
			break;
             case 2 :
                        System.out.print(BLUE +"\n\t\t\t\t            Current Account " + RESET);
                        sleep1();
                        System.out.print("\n  \t\t       Here we take two example of Bank for current account comparison : 'ABC' and 'XYZ'");
                        sleep1();
                        System.out.print(RED + " \n\n                                                          ABC " + RESET);
                        System.out.print(BLUE + "                                         XYZ"+RESET);
                        sleep1();
                        System.out.print("\n  1. Monthly Average Balance     :                       10,000                   ||                  5,000");
		        sleep1();
		        System.out.print("\n  2. Monthly Cash Deposit limit  :                       20 Lakh                  ||                  5 Lakh");
		        sleep1();
		        System.out.print("\n  3. Cash Withdrawal limit       :                      Unlimited                 ||                 Unlimited");
		        sleep1();
		        System.out.print("\n  4. Providing Service           :    ");
		        sleep1();
		        System.out.print("\n     . Internet Banking          :                        YES                     ||                    YES");
		        sleep1();
		        System.out.print("\n     . Mobile Banking            :                        YES                     ||                    YES");
		        sleep1();
		        System.out.print("\n     . Cheque                    :                        YES                     ||                    YES");
		        sleep1();
		        System.out.print("\n     . ATMs                      :                        YES                     ||                    Yes");
		        sleep1();
		        System.out.print("\n\n   *Frequently Asked Questions (FAQS) -- Current Account");
		        sleep1();
	  	        System.out.print("\n    Q1. What is Current Account?");
		        sleep1();
		        System.out.print("\n    Ans. Current bank accounts are very popular among companies, firms, public enterprises, businessmen who generally have higher number of regular transactions with the bank.\n         The current account includes deposits, withdrawals, and contra transactions. Such accounts are also called the Demand Deposit Account.\n         A Current account can be opened in most of the commercial banks. A current account being a zero-account ");
		        sleep();
		        System.out.print("\n    Q2. Why do you need a Current Account?");
		        sleep1();
	  	        System.out.print("\n    Ans. Unlike savings accounts that cater to individuals who want to save money, current accounts are mainly used to service the needs of the businesses.\n         Also, current accounts provide higher number of transactions limits on monthly cash deposit / withdrawal (within city or outside city) compared to savings account.");
	         	sleep();
		        System.out.print("\n    Q3. What document required for open a Current  account?");
		        sleep1();
		        System.out.print("\n    Ans.  Proof of Age :- PAN card , Voter card or valid government issued ID \n	  Proof of address : -House bill, Elecrticity bill, Driving License\n");
		break;
             case 3 :
                     do{
                          Scanner n1 = new Scanner(System.in);
                          System.out.print("\n\n  -> Enter the number '1' for Calculator and '2' for exit : ");
                          number = n1.nextInt();
                              switch(number){
                                 case 1:
                                        calculator();
                                         break;
                               default :
                                System.out.println("\n  Enter No. 1 or Enter No. 2 for exit: ");
                              }
                        }while( number !=2);
                     break;
             default :
                 System.out.print("\n Enter No. 1,2 and 3 or Enter No. 4 for exit ");                 
         }
     }while( number !=4);
     for(int i =0;i<text1.length();i++){    
         System.out.print( text1.charAt(i));
        try{
    Thread.sleep(50);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
  }
     sleep();
     for(int i =0;i<text2.length();i++){    
         System.out.print( text2.charAt(i));
        try{
    Thread.sleep(50);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
  }   
    }
}
        
