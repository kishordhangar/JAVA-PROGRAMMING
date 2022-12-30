
//25. Demonstrate example of array in java .
import java.lang.*;

public class Array
{

  public static void main(String []args)
     {


  System.out.println("\n");
    System.out.println("*****************************************");
  System.out.println("short array is given below");
    System.out.println("*****************************************");
  System.out.println("\n");  

    short[] custmerArray=new short[13];
  
    //123 165 162 186 186 181 971 156 122
    custmerArray[0]=123;
    custmerArray[1]=165;
    custmerArray[2]=162;
    custmerArray[3]=186;
    custmerArray[4]=186;
    custmerArray[5]=181;
    custmerArray[6]=971;
    custmerArray[7]=156;
    custmerArray[8]=122;
    custmerArray[9]=124;
    custmerArray[10]=125;
    custmerArray[11]=126;
    custmerArray[12]=127; 
     
    System.out.println("*****************************************");
    System.out.println(custmerArray[0]);
    System.out.println(custmerArray[1]);
    System.out.println(custmerArray[2]);
    System.out.println(custmerArray[3]);
    System.out.println(custmerArray[4]);
    System.out.println(custmerArray[5]);
    System.out.println(custmerArray[6]);
    System.out.println(custmerArray[7]);
    System.out.println(custmerArray[8]);
    System.out.println(custmerArray[9]);
    System.out.println(custmerArray[10]);
    System.out.println(custmerArray[11]);
    System.out.println(custmerArray[12]);
    System.out.println("*****************************************");
  


    System.out.println("\n");
    System.out.println("*****************************************");
    System.out.println("multi dimentional array is given below");
    System.out.println("*****************************************");
    System.out.println("\n");
    //multi- Dimensinol Array

    //2-Dimensional Array

    int[][]a =new int[4][3];
    a[0][2]=49;
    System.out.println(a[0][2]);

    int[][] a1=new int[4][3];
    a1[1][1]=99;
    System.out.println(a1[1][1]);

    int[][] a2 = new int[4][3];
    a2[2][1]=52;
    System.out.println(a2[2][1]);
  
    int[][]a3 = new int [4][3];
    a3[3][1]=77;
    System.out.println(a3[3][1]);  
  
    System.out.println("Lenght of a  = " + a.length);  
    System.out.println("Lenght of a1 = " + a1.length);  
    System.out.println("Lenght of a2 = " + a2.length);  
    System.out.println("Lenght of a3 = " + a3.length);  


    System.out.println("\n");
    System.out.println("*****************************************");
    System.out.println("single dimentional array is given below");
    System.out.println("*****************************************");
    System.out.println("\n");


        //single dimentional array
    int[]studentArray1=new int[10];

    //41 42 43 45 46 47
    studentArray1[0]=41;
    studentArray1[1]=42;
    studentArray1[2]=43;
    studentArray1[3]=44;  
    studentArray1[4]=45;
    studentArray1[5]=46;
    studentArray1[6]=47;
    studentArray1[7]=48;
    studentArray1[8]=49;
    studentArray1[9]=50;
        System.out.println("*****************************************");
        System.out.println(studentArray1[0]);
        System.out.println(studentArray1[1]);
        System.out.println(studentArray1[2]);
        System.out.println(studentArray1[3]);
        System.out.println(studentArray1[4]);
        System.out.println(studentArray1[5]);
        System.out.println(studentArray1[6]);
        System.out.println(studentArray1[7]);  
        System.out.println(studentArray1[8]);
        System.out.println(studentArray1[9]);
        System.out.println("*****************************************");
    
    System.out.println("\n");
    System.out.println("*****************************************");
    System.out.println("byte array is given below");
    System.out.println("*****************************************");
    System.out.println("\n");


 byte[]studentArray2=new byte[8];

  //11 22 33 44 55 66 77 88

  studentArray2[0]=11;
  studentArray2[1]=22;
  studentArray2[2]=33;
  studentArray2[3]=44;
  studentArray2[4]=55;
  studentArray2[5]=66;
  studentArray2[6]=77;
  studentArray2[7]=88;
      System.out.println("*****************************************");
      System.out.println(studentArray2[0]);
      System.out.println(studentArray2[1]);
      System.out.println(studentArray2[2]);
      System.out.println(studentArray2[3]);
      System.out.println(studentArray2[4]);
      System.out.println(studentArray2[5]);
      System.out.println(studentArray2[6]);
      System.out.println(studentArray2[7]);
      System.out.println("*****************************************");

    System.out.println("\n");
    System.out.println("*****************************************");
    System.out.println("long array is given below");
    System.out.println("*****************************************");
    System.out.println("\n");

  long[]studentArray3= new long[7];

  //100 200 300 400 500 600 700
  studentArray3[0]=100;
  studentArray3[1]=200;
  studentArray3[2]=300;
  studentArray3[3]=400;
  studentArray3[4]=500;
  studentArray3[5]=600;
  studentArray3[6]=700;
      System.out.println("*****************************************");
      System.out.println(studentArray3[0]);
      System.out.println(studentArray3[1]); 
      System.out.println(studentArray3[2]);
      System.out.println(studentArray3[3]);
      System.out.println(studentArray3[4]);
      System.out.println(studentArray3[5]);
      System.out.println(studentArray3[6]);
      System.out.println("*****************************************");

    System.out.println("\n");
    System.out.println("*****************************************");
    System.out.println("character array is given below");
    System.out.println("*****************************************");
    System.out.println("\n");

  char[]studentArray4= new char[5];

  //a b c d e f clear

  studentArray4[0]='a';
  studentArray4[1]='b';
  studentArray4[2]='c';
  studentArray4[3]='d';
  studentArray4[4]='e';
      System.out.println("*****************************************");
      System.out.println(studentArray4[0]);
      System.out.println(studentArray4[1]);
      System.out.println(studentArray4[2]);
      System.out.println(studentArray4[3]);
      System.out.println(studentArray4[4]);
      System.out.println("*****************************************");
      System.out.println("outpuT is = "+ studentArray4[0]+studentArray4[1]+studentArray4[2]+studentArray4[3]+studentArray4[4]);
      System.out.println("*****************************************");

    }
}

/*
OUTPUT

PS C:\Users\DELL\Desktop\Repeat_Study_Java> javac .\Array.java
PS C:\Users\DELL\Desktop\Repeat_Study_Java> java Array.java        


*****************************************
short array is given below
*****************************************


*****************************************
123
165
162
186
186
181
971
156
122
124
125
126
127
*****************************************


*****************************************
multi dimentional array is given below
*****************************************


49
99
52
77
4


*****************************************
single dimentional array is given below
*****************************************


*****************************************
41
42
43
44
45
46
47
48
49
50
*****************************************


*****************************************
byte array is given below
*****************************************


*****************************************
11
22
33
44
55
66
77
88
*****************************************


*****************************************
long array is given below
*****************************************


*****************************************
100
200
300
400
500
600
700
*****************************************


*****************************************
character array is given below
*****************************************


*****************************************
a
b
c
d
e
*****************************************
outpuT is = abcde
*****************************************
PS C:\Users\DELL\Desktop\Java_Assignment> 

*/

