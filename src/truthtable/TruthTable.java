/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthtable;

/**
 *
 * @author Dell Laptop
 */
import java.util.Scanner;


public class TruthTable {
    private static void printTruthTable(int n) {
        
        int noOfVariable = (int) Math.pow(2,n);

        for (int i=0; i<noOfVariable; i++) {
            for (int j=n-1; j>=0; j--) {
                System.out.print((i/(int) Math.pow(2, j))%2 + " ");
            }
            System.out.println();
        }
    }
    
    
    private static void minterms(int n){
        
    int noOfVariable = (int) Math.pow(2,n);
    //char array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char array[] = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};

        for (int i=0; i<noOfVariable; i++) {
        
           
            for (int k=n-1 ; k>=0 ; k-- ){
            
                int vre= (i/(int) Math.pow(2, k))%2;
                
            if (vre == 0){
               
                    
                    System.out.print(array[k]+"'");
                }
            
                else if(vre == 1){
                
                   System.out.print(array[k]+"");
                           
                }
           
            }
             
System.out.println("\n");
    
            
        }
      
    }
    
    
    private static void maxterms(int n){
    int noOfVariable = (int) Math.pow(2,n);
    //char array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char array[] = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
    
   // String collect[] = new String[n];

        for (int i=0; i<noOfVariable; i++) {
            for (int k=n-1 ; k>=0 ; k-- ){
            int vre= (i/(int) Math.pow(2, k))%2;
            if (vre == 0){
                    System.out.print(array[k]+"+");
                }
            
                else if(vre == 1){
                
                   System.out.print(array[k]+"'+");
                           
                }
           
            }
             
System.out.println("\n");
    
        }
      
    }
    
    public static void main(String[] args) {
        System.out.println("Input no of variables you want to accept");
        Scanner input = new Scanner(System.in);
        int getVariable = input.nextInt();
        int temp = getVariable;
       
        
        System.out.println("CHOOSE 1 FOR MINTERMS\n CHOOSE 2 FOR MAXTERMS");
        int click;
        click = input.nextInt();
        switch(click){
            case 1:
        printTruthTable(getVariable);
        System.out.println("\t\t\t ");
        System.out.println("MINTERMS");
        minterms(temp);//
        break;
        
        case 2:
             printTruthTable(getVariable);
        System.out.println("\t\t\t");
        System.out.println("MAXTERMS");
        maxterms(temp);
        break;
        
        default:System.out.println("INVALID,choose either one or two");
        break;
        }
    }

}
