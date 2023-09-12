
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getDataFromUser = new Scanner(System.in); // Kullanıcı Girdisi Alma
        
        System.out.print("Please Enter Your Height (Example; 1,85) : ");
        
        double height = getDataFromUser.nextDouble();  // Boy
        
        System.out.print("Please Enter Your Weight : ");
        
        int weight = getDataFromUser.nextInt();  // Kilo
        
        double bodyMassIndex = (weight / (height * height));  // Vücut Kitle İndeksi (BMI) Formülü
        
        System.out.println("Your Body Mass Index is : " + bodyMassIndex);  // Çıktı
        
    }
    
}
