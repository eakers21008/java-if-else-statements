
package pkgif.pkgelse.statements;



import java.util.Scanner;




/**
 *
 * Name: Ethan Akers
 * Period: 2
 * Project Name: If Else Statements 
 * 
 * 
 */
public class IfElseStatements {

    
    public static Scanner scn = new Scanner(System.in);
    //Scanner scn
    
    public static void main(String[] args) {
       question1(scn.nextInt());
       question2(scn.nextInt());
       question3(scn.nextDouble()); 
       question4(scn.nextDouble());
       question5(scn.nextInt());
       question6(scn.nextInt());
       question7(scn.next());
       question8(scn.next());
       question9(scn.nextInt, scn.nextInt);
    }
    
    
    public static void question1(int gradeLetter){
        if(gradeLetter <=70){
            System.out.println("PASSING");
        
        }
        else{
            System.out.println("FAIL");
        }
    }
    
    public static void question2(int number){
        System.out.println("PLEASE INPUT A NUMBER");
        
        if(number >= 50){
            System.out.println("GO");
        }
        else{
            System.out.println("STOP");
        }
        
    }
    
    public static void question3(double integer){
        System.out.println("INPUT A DECIMAL");
        if(integer % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
    
    public static void question4(double integer){
        System.out.println("INPUT A DECIMAL");
        if(integer % 5 ==0){
            System.out.println("MULTIPLE OF 5");
          
        }
        else{
            System.out.println("NOT MULTIPLE OF 5");
        }
        
    }
    
    public static void question5(int number){
        System.out.println("INPUT A NUMBER");
        if(number < 10){
            System.out.println("ONE DIGIT");
            
        }
        else if(number >=100){
            System.out.println("THREE DIGITS");
        }
        else if(number >= 10 && number < 100){
            System.out.println("TWO DIGITS");
        }
    }
    
    public static void question6(int jerseyNumber){
        if(jerseyNumber == 12 || jerseyNumber == 71 || jerseyNumber == 80){
            System.out.println("THAT NUMBER IS RETIRED");
        }
        else{
            System.out.println(" ");
        }
    }
    
    public static void question7(String stateName){
        System.out.println("INPUT A STATE");
        if(stateName.equals("Oregon") || stateName.equals("Washington") || stateName.equals("Idaho")){
            System.out.println("This State is in the PNW");
        }
        else{
            System.out.println("You should move to the PMW; it's great here!");
        }
    }
    
    public static void question8(String drinkName){
        System.out.println("INPUT A STARBUCKS SIZE");
        if(drinkName.equals("Short")){
            System.out.println("8 oz"); 
            
        }
        else if(drinkName.equals("Tall")){
            System.out.println("12 oz");
        }
        else if(drinkName.equals("Grande")){
            System.out.println("16 oz");
        }
        else if(drinkName.equals("Venti")){
            System.out.println("20 oz");
        }
    }
    
    public static void question9(int rateOfPay, int hoursWorked){
        System.out.println("INPUT HOURS AND RATE OF PAY");
        
        int totalGross = rateOfPay * hoursWorked;
        
        System.out.println("You made: $" + totalGross);
        if(hoursWorked <=40){
            System.out.println("YOU HAVE WORKED OVERTIME");
        }
    }
    
    public static void question10(){
        
    }
    
}
