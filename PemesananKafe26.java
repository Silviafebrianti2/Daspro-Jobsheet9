import java.util.Scanner;

public class PemesananKafe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];
        double totalBiaya = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        for (int i = 0; i < jumlah; i++) {
            totalBiaya += hargaPesanan[i];
        }

        // Tampilkan hasil
        System.out.println("\n=== DAFTAR PESANAN KAFE ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("-----------------------------");
        System.out.println("Total Biaya Pesanan: Rp " + totalBiaya);
        System.out.println("-----------------------------");

        sc.close();
    }
}
