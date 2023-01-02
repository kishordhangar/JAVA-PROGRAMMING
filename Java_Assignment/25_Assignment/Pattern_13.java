package Project;

public class Pattern_13
{
	public static void main(String args[])
	{
	int col ; 
    int row ; 
    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++)
        {  //col
           
            	System.out.print(""+col+" "+col);              
        } 
        System.out.print("\n");
    }
}
}
/*
OUTPUT
 
0 01 12 23 34 4
0 01 12 23 34 4
0 01 12 23 34 4
0 01 12 23 34 4
0 01 12 23 34 4

 */