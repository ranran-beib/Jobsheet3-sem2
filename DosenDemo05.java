import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen05[] arrayOfDosen = new Dosen05[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jkInput = sc.nextLine();
            boolean jk = jkInput.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen05(kode, nama, jk, usia);
            System.out.println("----------------------------------");
        }

        DataDosen05 data = new DataDosen05();

        System.out.println("\n=== Semua Data Dosen ===");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== Rata-rata Usia Per Jenis Kelamin ===");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== Dosen Paling Tua ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n=== Dosen Paling Muda ===");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}