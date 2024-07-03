import java.util.Scanner;
 public class guessnumber {
   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int min=1;
      int max=100;
      int randomnumber;
      randomnumber = getRandomnumber(min,max);
      int guess;
      System.out.println("welcome to the number guessing game");
      System.out.println("I chosen number between"+ min +" and"+ max +".try to guess it!");
            
        do{
            System.out.print("enter your guess:");
            guess=scanner.nextInt();
                if(guess==randomnumber){
                    System.out.println("congratulations! u have crt guess:"+randomnumber);
                }else if(guess<randomnumber){
                    System.out.println("toolow!tryagain");
                }else{
                    System.out.println("toohigh!tryagain");
                }
            }while(guess!=randomnumber);
  
        }        
     public static int getRandomnumber(int min,int max){
         return(int) ((max - min + 1 ) * Math.random() + min);
     }    
} 
    

