package Project;

public class Pattern_04 
{

	public static void main(String args[])
	{
	int col ; 
    int row ; 

    for(row = 0 ; row < 5 ; row ++) {  //rows
    
        for(col = 0 ; col < 5 ; col ++) {  //col
            if(row<=col)
            {
            	System.out.print("* "); 
            } 
            else
            { 
            	System.out.print("k ");      
            }       
        } 
        System.out.print("\n");
    }

}

}
/*
OUTPUT

* * * * * 
k * * * * 
k k * * * 
k k k * * 
k k k k *  

 */
