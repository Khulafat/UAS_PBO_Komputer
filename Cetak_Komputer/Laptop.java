package Cetak_Komputer;

/**
 *
 * @author Afad
 */
public class Laptop extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("Menghidupkan Laptop Asus ROG");
    }

    @Override
    void matikan_os() {
        System.out.println("Mematikan Laptop Asus ROG");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mengklik kanan trackpad Laptop");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mengklik kiri trackpad Laptop");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan Enter pada keyboard Laptop");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak File Laporan");
    }
}