import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nilai;
        System.out.println("masukkan nilai :");
        nilai = scan.nextInt();
        

        if(nilai>=0 && nilai<=25){
            System.out.println("nilai E");
        }
        else if(nilai>=26 && nilai <= 50){
            System.out.println("nilai D");
        }
        else if(nilai>=51 && nilai <= 75){
            System.out.println("nilai C");
        }
        else if(nilai>=76 && nilai <= 90){
            System.out.println("nilai B");
        }
        else if(nilai>=91 && nilai <= 100){
            System.out.println("nilai A");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}