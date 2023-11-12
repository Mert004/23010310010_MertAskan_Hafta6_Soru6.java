import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı girin : ");
        int sayi1 = scanner.nextInt();
        
        System.out.print("İkinci sayıyı girin : ");
        int sayi2 = scanner.nextInt();
        
        int carpim = 0;
        int i = 0;
        while (i < sayi2) {
            carpim += sayi1;
            i++;
        }
        
        System.out.println("Çarpım sonucu : " + carpim);
    }

	}


