import java.util.*;
class CensusPopulation
{
    public static void main(String[]args)
   {
     long currPop = 312032486;
     final long seconds = (365*24*60*60)*5;
     long birth = seconds/7;
     long death = seconds/13;
     long immigrant = seconds/45;
     long newPop = currPop + birth - death + immigrant;

     System.out.println("Current population is: " + currPop);
     System.out.println("New population is: " + newPop);
	
   }
}