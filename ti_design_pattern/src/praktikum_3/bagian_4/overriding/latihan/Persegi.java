package praktikum_3.bagian_4.overriding.latihan;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }
}
