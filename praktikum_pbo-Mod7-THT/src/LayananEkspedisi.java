public class LayananEkspedisi {
    /*Atribut dengan protected agar dalam package yang sama, setiap class inheritance dapat mengaksesnya juga (agar dapat diturunkan)  */
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    LayananEkspedisi(String nomorResi, double berat, double panjang, double lebar, double tinggi) { // konstruktor untuk menginisialisasi setiap atribut.
        this.nomorResi = nomorResi;
        this.beratAktualKg = berat;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungBeratEfektif() { // method untuk menghitung berat efektif antara berat aktual dengan berat volumetrik.
        double volumetrik = (panjang * lebar * tinggi) / 6000;

        if (beratAktualKg > volumetrik) {
            return beratAktualKg;
        }
        else {
            return volumetrik;
        }
    }

    public void cetakResi() { // method untuk mencetak detail resi yang mencakup nomor resi dan berat efektifnya.
        System.out.println("Nomor Resi : " + nomorResi);
        System.out.println("Berat Efektif : " + hitungBeratEfektif() + "\n");
    }

    public double hitungOngkir() { // method polymorphic yang akan punya banyak bentuk dari subclass-subclass dibawah parent ini.
        return 0.0;
    }
}
