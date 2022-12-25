package Cetak_Komputer;

/**
 *
 * @author Afad
 */
public class Notebook extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("Menghidupkan Notebook Lenovo");
    }

    @Override
    void matikan_os() {
        System.out.println("Menghidupkan Notebook Lenovo");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mengklik kanan trackpad Notebook");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mengklik kiri trackpad Notebook");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menakan Enter pada keyboard Notebook");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak File PDF");
    }  
}