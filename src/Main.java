import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int an = input.nextInt();
        if ((an%4==0 && an%100==0) || an%400==0){
            System.out.println("Bisect");
        }else{
            System.out.println("Nu e bisect");
        }

        //exista functie in clasa Year ppt a verifica daca anul este
        System.out.println(Year.isLeap(an));
    }
}
