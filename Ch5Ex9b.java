package ch5ex9b;
import java.util.Scanner;

public class Ch5Ex9b {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int compnum,usernum;
            
            System.out.println("Please enter a number");
                usernum=input.nextInt();
                
                compnum=(int)((20-1)*Math.random()+1);
                
                    System.out.println("Computer's Number "+compnum);
                    System.out.println("User's Number "+usernum);
                    
                    if(compnum==usernum){
                        System.out.println("You won!");
                    }
                    else{
                        System.out.println("Better luck next time!");
                    }
        }
    
}
