package Project;

public class Pattern_03 
{

	public static void main(String args[])
	{
	int col ; 
    int row ; 

    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++) {  //col
            if(col!=row)
            {
            	System.out.print(" * "); 
            } 
            else
            { 
            	System.out.print("  ");      
            }       
        } 
        System.out.print("\n");
    }

}

}
/*
OUTPUT
   *  *  *  * 
 *    *  *  * 
 *  *    *  * 
 *  *  *    * 
 *  *  *  *   
 

 */
