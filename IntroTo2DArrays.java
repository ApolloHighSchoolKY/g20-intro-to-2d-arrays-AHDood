import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    int [][] twoDee= new int [3][5];

    //Store incremental values in row major order
    // [ 1 , 2 , 3 , 4 , 5 ]
    //[ 6 , 7 , 8 , 10 ]
    // [ 11 , 12 , 13 , 14 , 15 ]
    int val =1;
    for(int row=0; row<twoDee.length;row++)
    {
      for(int col = 0; col<twoDee.length;col++)
      {
        twoDee[row][col]=val;
        val++;
        
      }
      //this spot here represents the completion of one row
      System.out.println(Arrays.toString(twoDee[row]));
    }
    
    //Print out the total sum of each row in the following
    //format using only two loops total 
    //Row 0: 15;
    //Row 1:...
int sum =1;

    for(int row=0; row<twoDee.length;row++)
    {
      for(int col = 0; col<twoDee.length;col++)
      {
        sum = sum + twoDee[row][col];
        
      }
      //this spot here represents the completion of one row
      System.out.println("row"+ row + ":" + sum);
      sum = 0;
    }
    //Print out the sum of each column in the following
    //format:
    //Column 0: ??
    //Column 1: ??
    //...
    //Column 5: ??
    int result =0;

    for(int col=0; col<twoDee[0].length;col++)
    {
      for(int row = 0; row<twoDee.length;row++)
      {
        result = result + twoDee[row][col];
        
      }
      //this spot here represents the completion of one row
      System.out.println("Column"+  col + ":" + result);
      result = 0;
    }
  
  }
}
