import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilaiAkhir = new int[jumlah];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i+0) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("\n=== Status Kelulusan Mahasiswa ===");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+0) + " lulus (Nilai: " + nilaiAkhir[i] + ")");
            } else {
                System.out.println("Mahasiswa ke-" + (i+0) + " tidak lulus (Nilai: " + nilaiAkhir[i] + ")");
            }
        }
    }
}
