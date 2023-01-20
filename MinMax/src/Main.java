import java.util.Scanner;
import java.util.Arrays;

public class Main {
	/*
    Dizideki elemanlar�n girilen say�dan k���k en yak�n say�y� ve en b�y�k en yak�n say�y� bulan program� yaz�n�z.
    �rnek :
    Dizi : {15,12,788,1,-1,-778,2,0}
    Girilen Say� : 5
    Girilen say�dan k���k en yak�n say� : 2
    Girilen say�dan b�y�k en yak�n say� : 12
    Github : SonerA1
     */
    public static void main(String[] args) {
        int list [] = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list); // Buras� �nemli:
        int min = list[0];
        int max = list[list.length - 1];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();

        for (int i = 0; i < list.length; i++){
            if (list[i] < n){
                if (list[i] > min){
                    min = list[i];
                }
            }
        }
        System.out.println("The minimum nearest number : " +min);
        

        for (int j = 0; j < list.length; j++){
            if (list[j] > n){
                if (list[j] < max){
                    max = list[j];
                }
            }
        }
        System.out.println("The maximum nearest number : " + max);


	
	
    }

}
