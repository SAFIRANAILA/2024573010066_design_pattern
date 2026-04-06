package praktikum_3.bagian_5.latihan;

public class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        super(nama);
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}