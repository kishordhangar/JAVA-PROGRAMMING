package Project;

public class Pattern_07
{
	public static void main(String args[])
	{
	int col ; 
    int row ; 

    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++) {  //col
            if(row==col)
            {
            	System.out.print(" * "); 
            } 
            else
            { 
            	System.out.print(" * ");      
            }       
        } 
        System.out.print("\n");
    }

}


}
/*
OUTPUT
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 

 */