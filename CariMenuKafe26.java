import java.util.Scanner;

public class CariMenuKafe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", 
            "Ayam Goreng", 
            "Martabak", 
            "Kentang Goreng", 
            "Jus Alpukat", 
            "Cappucino", 
            "Bluberry ice blend"
        };

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        int indeks = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { // equalsIgnoreCase -> agar tidak case sensitive
                ditemukan = true;
                indeks = i;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("✅ \"" + menu[indeks] + "\" tersedia di menu (indeks ke-" + indeks + ").");
        } else {
            System.out.println("❌ Maaf, \"" + cari + "\" tidak tersedia di menu.");
        }

        sc.close();
    }
}
