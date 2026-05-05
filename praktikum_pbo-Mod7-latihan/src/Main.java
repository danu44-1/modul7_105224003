import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> perangkat = new ArrayList<>();

        perangkat.add(new LampuPintar());
        perangkat.add(new AcPintar());

        for (PerangkatPintar daftar : perangkat) {
            daftar.aktifkan();
        } // Pesan yang dicetak berbeda walau variabel yang memanggilnya sama-sama bertipe PerangkatPintar, karena kedua subclass melakukan method overidding yang menulis ulang isi dari method pada parentnya dengan isi yang berbeda di setiap subclass.

        if (perangkat.get(1) instanceof AcPintar) {
            AcPintar ac = (AcPintar) perangkat.get(1);
            ac.aturSuhu(20);
        }

        PerangkatPintar alat1 = new LampuPintar();
        // alat1.aturKecerahan(75, "Putih"); baris error, karena method dari aturKecerahan tidak ada di dalam tipe data PerangkatPintar atau kelas PerangkatPintar. Cara perbaikannya perlu downcasting.
        
        ((LampuPintar)alat1).aturKecerahan(75, "Putih");
    }
}
