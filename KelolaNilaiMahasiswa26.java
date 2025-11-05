import java.util.Scanner;

public class KelolaNilaiMahasiswa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlah;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.print("Semua nilai mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai     : " + rataRata);
        System.out.println("Nilai tertinggi     : " + tertinggi);
        System.out.println("Nilai terendah      : " + terendah);

        sc.close();
    }
}
