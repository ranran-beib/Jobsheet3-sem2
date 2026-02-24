public class DataDosen05 {

    // a. tampil semua dosen
    void dataSemuaDosen(Dosen05[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " +
                (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("----------------------------------");
        }
    }

    // b. jumlah dosen per jenis kelamin
    void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. rata-rata usia per jenis kelamin
    void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalPria += arrayOfDosen[i].usia;
                jmlPria++;
            } else {
                totalWanita += arrayOfDosen[i].usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Wanita : " + (totalWanita / jmlWanita));
    }

    // d. dosen paling tua
    void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        int idxTertua = 0;

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[idxTertua].usia) {
                idxTertua = i;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Nama : " + arrayOfDosen[idxTertua].nama);
        System.out.println("Usia : " + arrayOfDosen[idxTertua].usia);
    }

    // e. dosen paling muda
    void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        int idxTermuda = 0;

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[idxTermuda].usia) {
                idxTermuda = i;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Nama : " + arrayOfDosen[idxTermuda].nama);
        System.out.println("Usia : " + arrayOfDosen[idxTermuda].usia);
    }
}