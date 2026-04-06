package praktikum_3.bagian_3.latihan;

public class Laptop {
    // Composition - Laptop memiliki Processor dan RAM
    private final Processor processor;
    private final RAM ram;

    public Laptop() {
        this.processor = new Processor();
        this.ram = new RAM();
    }

    void nyalakan() {
        System.out.println("Laptop menyala...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan.");
    }
}
