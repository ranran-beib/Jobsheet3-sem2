import java.util.Scanner;

public class MataKuliah05 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah05() {
    }

    public MataKuliah05(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode         : ");
        kode = sc.nextLine();
        System.out.print("Nama         : ");
        nama = sc.nextLine();
        System.out.print("SKS          : ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam   : ");
        jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah Jam   : " + jumlahJam);
        System.out.println("=====================================");
    }
}