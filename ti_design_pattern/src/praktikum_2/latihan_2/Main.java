package praktikum_2.latihan_2;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Lingkaran
        Lingkaran lingkaran = new Lingkaran();

        // Mengisi nilai atribut
        lingkaran.jariJari = 7;

        // Memanggil method hitungLuas()
        System.out.println("Jari-jari : " + lingkaran.jariJari);
        System.out.println("Luas      : " + lingkaran.hitungLuas());
    }
}