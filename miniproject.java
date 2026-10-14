import java.util.Scanner;

class Mahasiswa {   // ini class mahasiswa

    String nama; // ini ber3 adalah atributnya
    String NIM;
    double nilai;

    void tampilkanData() {  // ini method tampilkandata
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Nilai: " + nilai);
    }

    void cekKelulusan() {  // ini method cekkelulusan
       if (nilai >= 60) {
        System.out.println("Lulus");
        } else {
        System.out.println("Tidak Lulus");
    }
    }
}

public class Main { // ini class main nya untuk jalanin programnya
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // ini scanner untuk inputan data dari mahasiswanya

        for(int i = 0; i < 3; i++){   // ini loop nya untuk input data 3 mahasiswanya
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.print("Masukkan Nama: ");   
        mahasiswa.nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        mahasiswa.NIM = scanner.nextLine();

        System.out.print("Masukkan Nilai: ");
        mahasiswa.nilai = scanner.nextDouble();

        scanner.nextLine(); // ini biar dienter sekali kebawah, biar data selanjutnya bisa diinput dan gak rusak
        System.out.println("\nData Mahasiswa:");
        mahasiswa.tampilkanData();  // ini untuk nampilin data mahasiswanya
        mahasiswa.cekKelulusan();  // ini untuk nampilin lulus atau nggak nya
        System.out.println();     // ini biar ada jarak antara data mahasiswa 1 dan mahasiswa lainnya

    }
        scanner.close(); // tutup close nya scannernya biar gk ada memory leak, jadi memorinya kosong lagi
    }
}