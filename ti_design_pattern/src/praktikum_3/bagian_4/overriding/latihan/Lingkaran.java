package praktikum_3.bagian_4.overriding.latihan;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    void hitungLuas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran : " + luas);
    }
}
