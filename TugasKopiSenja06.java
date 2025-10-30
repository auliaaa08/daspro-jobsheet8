import java.util.Scanner;
public class TugasKopiSenja06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        int j, i = 0, totalSemuaPelanggan = 0, totalSemuaItem = 0;
        int jumlahCabang = cabang;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + " : ");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item");

            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
        }

        System.out.println("\nTotal seluruh cabang:");
        System.out.println("Pelanggan: " + totalSemuaPelanggan + " orang");
        System.out.println("Item terjual: " + totalSemuaItem + " item");

    }
}