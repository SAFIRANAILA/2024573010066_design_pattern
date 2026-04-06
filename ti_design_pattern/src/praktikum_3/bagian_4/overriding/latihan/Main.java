package praktikum_3.bagian_4.overriding.latihan;

public class Main {
    public static void main(String[] args) {
        BangunDatar b1 = new Persegi(5);
        BangunDatar b2 = new Lingkaran(7);

        b1.hitungLuas();
        b2.hitungLuas();
    }
}