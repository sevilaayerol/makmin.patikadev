import java.util.Scanner;
import java.util.Arrays;

public class Main {
	/*
    Dizideki elemanlarýn girilen sayýdan küçük en yakýn sayýyý ve en büyük en yakýn sayýyý bulan programý yazýnýz.
    Örnek :
    Dizi : {15,12,788,1,-1,-778,2,0}
    Girilen Sayý : 5
    Girilen sayýdan küçük en yakýn sayý : 2
    Girilen sayýdan büyük en yakýn sayý : 12
    Github : SonerA1
     */
    public static void main(String[] args) {
        int list [] = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list); // Burasý önemli:
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
