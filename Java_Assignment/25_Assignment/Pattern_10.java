package Project;

public class Pattern_10 

{

	public static void main(String args[])
	{
	int col ; 
    int row ; 
    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++)
        {  //col
           
            	System.out.print(+col+" * "+row);              
        } 
        System.out.print("\n");
    }
}
}
/*
OUTPUT
0 * 01 * 02 * 03 * 04 * 0
0 * 11 * 12 * 13 * 14 * 1
0 * 21 * 22 * 23 * 24 * 2
0 * 31 * 32 * 33 * 34 * 3
0 * 41 * 42 * 43 * 44 * 4 

 */