import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User menentukan jumlah array
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah05();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        // Output data
        System.out.println("\n===== DATA MATA KULIAH =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}