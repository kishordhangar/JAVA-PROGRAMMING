package Project;

public class Pattern_11 
{
	public static void main(String args[])
	{
	int col ; 
    int row ; 
    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++)
        {  //col
           
            	System.out.print(+row+" * "+col);              
        } 
        System.out.print("\n");
    }
}
}
/*
OUTPUT
 
0 * 00 * 10 * 20 * 30 * 4
1 * 01 * 11 * 21 * 31 * 4
2 * 02 * 12 * 22 * 32 * 4
3 * 03 * 13 * 23 * 33 * 4
4 * 04 * 14 * 24 * 34 * 4 

 */