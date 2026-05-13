public class LayananReguler extends LayananEkspedisi {

    LayananReguler(String nomorResi, double berat, double panjang, double lebar, double tinggi) { // konstruktor untuk inisialisasi setiap atribut parent yang diturunkan dan agar subclass dapat mengaksesnya.
        super(nomorResi, berat, panjang, lebar, tinggi); // pemanggilan konstruktor induk
    }

    @Override
    public double hitungOngkir() { // menulis ulang (override) method dari parent agar memiliki bentuk yang berbeda.
        return hitungBeratEfektif() * 15000; // tarif dasar dari ongkir per Kg (dihitung berdasarkan berat efektif).
    }

    public double hitungOngkir(boolean isMember, int jarakKm) { // method overloading dengan menambahkan parameternya, method dapat dibuat dengan nama yang sama dan bentuk yang juga berbeda.
        double tarifDasar = hitungOngkir();
        double diskon = 0;

        if (isMember == true) {
            diskon = tarifDasar * 0.1;
        }

        double total = (tarifDasar - diskon) + (jarakKm * 500); // penambahan untuk surcharge jarak jauh sebesar Rp 500 per jarakKm. 

        return total;
    }
}
