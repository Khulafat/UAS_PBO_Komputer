package Cetak_Komputer;

/**
 *
 * @author Afad
 */
public class KomputerCetak {
    final void cetak(Komputer[] obj){
        for (Komputer komp : obj) {
            komp.hidupkan_os();
            komp.matikan_os();
            komp.klik_kanan();
            komp.klik_kiri();
            komp.tekan_enter();
            komp.cetak_data();
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        Komputer[] obj = 
        {   new PC(),
            new Laptop(),
            new Notebook()
        };
        
        KomputerCetak mencetakData  = new KomputerCetak();
        mencetakData.cetak(obj);
    }  
}