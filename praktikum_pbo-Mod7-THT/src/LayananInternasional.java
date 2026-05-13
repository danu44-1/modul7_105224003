public class LayananInternasional extends LayananEkspedisi {
    protected String negaraTujuan;
    protected double nilaiBarangUSD;

    LayananInternasional(String nomorResi, double berat, double panjang, double lebar, double tinggi, String negara, double nilaiBarang) { // konstruktor untuk inisialisasi setiap atribut parent yang diturunkan dan agar subclass dapat mengaksesnya kemudian dalam parameternya ditambahkan atribut dari class ini.
        super(nomorResi, berat, panjang, lebar, tinggi); // pemanggilan konstruktor induk
        this.negaraTujuan = negara;
        this.nilaiBarangUSD = nilaiBarang;
    }

    @Override
    public double hitungOngkir() { // menulis ulang (override) method dari parent agar memiliki bentuk yang berbeda.
        double tarifDasar = hitungBeratEfektif() * 200000; // mengambil tarif dasar dari ongkir per Kg (dihitung berdasarkan berat efektif).
        double pajak = 0;

        if (nilaiBarangUSD > 50) { // kemudian jika nilai barangnya lebih dari 50 USD, maka akan terkena pajak sebesar 20% dari tarif ongkir dasar.
            pajak = tarifDasar * 0.2;
        }

        return tarifDasar + pajak;
    }

    public void cetakManifest() { // method untuk mencetak detail manifest.
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}
