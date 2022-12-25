package Cetak_Komputer;

/**
 *
 * @author Afad
 */
public class PC extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("Menghidupkan PC");
    }

    @Override
    void matikan_os() {
        System.out.println("Mematikan PC");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mengklik kanan pada mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mengklik kiri pada mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan Enter pada keyboard");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak File Document");
    }   
}