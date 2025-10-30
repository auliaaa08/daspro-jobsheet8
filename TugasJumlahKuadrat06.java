import java.util.Scanner;
public class TugasJumlahKuadrat06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j, i = 1, jumlah = 0;

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            jumlah = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            for (j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                    }
                }
        System.out.println(" = " + jumlah);
        } 
    }
}
