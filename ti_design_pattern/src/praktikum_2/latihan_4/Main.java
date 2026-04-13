package praktikum_2.latihan_4;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Mengisi nilai atribut menggunakan setter
        mhs.setNama("Budi");
        mhs.setNim("2024001");

        // Menampilkan nilai atribut menggunakan getter
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM  : " + mhs.getNim());
    }
}