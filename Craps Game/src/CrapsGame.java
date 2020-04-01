import java.util.Random;
public class CrapsGame
{
   public static void main (String[] args)
   {
       //generate random numbers
      Random rand = new Random();
     
     //declaring variables
      int die1;
      int die2;      
      int win=0;
      int number;
      int loss=0;
      int round=0;
      int roll=0;
      int point=0;
      boolean roundended=false;
        
          /*if it's 7 or 11 = win, 2,3, or 12 = loss. Increment variables to keep track of wins and losses using ++. 
       if none of those 5 numbers happen, value (point) is saved and it continues until a 7 is rolled or the point is rolled. 
       If the point is rolled before a 7, then tally a win. If a 7 is rolled before the point, tally a loss. Then
         round is over. */
         
      while (round<100000)
      {
         roundended=false;
         if (round<10)
         {
            System.out.print("Round " + round + " , ");
         }
         while (!roundended)
         {
         roll++;
            if (round<10)
            {
               System.out.print("Roll " + roll + " -- ");
            }
            
            die1=rand.nextInt(6)+1;
            die2=rand.nextInt(6)+1;
            
            if (round<10)
            {
               System.out.print("Die1: " + die1 + " , " + "Die2: " + die2);
            }
             
               //get sum of the two dice rolls
            number = die1 + die2;
            
            if (round<10)
            {
               System.out.print(" -- Total: " + number + "\n");
            }
           
            //first roll   
            if(roll==1)
            {
               if (number == 7 || number== 11)
               {
                  win++;
                  roundended=true;
                  
                  if (round<10)
                  {
                     System.out.println("WIN!");
                  }
               }
               else if (number == 2 || number==3 || number==12)
               {
                  loss++;
                  roundended=true;
                  if (round<10)
                  {
                     System.out.println("LOSS!");
                  }
               }
               else
               {
                  point = number;
                  if (round<10)
                  {
                     System.out.println("Point is " + point);
                  }
               }
            }
            
            //subsequent rolls
               
            else
            {
               if (number==point)
               {
                  win++;
                  roundended=true;
                  if (round<10)
                  {
                     System.out.println("WIN!");
                  }
               }
               else if (number==7)
               {
                  loss++;
                  roundended=true;
                  if (round<10)
                  {
                     System.out.println("LOSS!");
                  }
               
               }
              
            }
         
         }
         
         if (round<10)
         {
            System.out.println(win + " win(s) " + ", " + loss + " loss(es)");
            System.out.println();
         }
        
         
         roll=0;
         round++;
      
      }
      System.out.println("OVERALL:");
      System.out.print(win + " win(s) " + ", " + loss + " loss(es)");
   }
          
}     
         

