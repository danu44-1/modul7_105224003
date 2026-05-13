public class LayananExpress extends LayananEkspedisi {

    LayananExpress(String nomorResi, double berat, double panjang, double lebar, double tinggi) { // konstruktor untuk inisialisasi setiap atribut parent yang diturunkan dan agar subclass dapat mengaksesnya.
        super(nomorResi, berat, panjang, lebar, tinggi); // pemanggilan konstruktor induk
    }

    @Override
    public double hitungOngkir() { // menulis ulang (override) method dari parent agar memiliki bentuk yang berbeda.
        return hitungBeratEfektif() * 30000; // tarif dasar dari ongkir per Kg (dihitung berdasarkan berat efektif).
    }

    public void klaimAsuransi(double nilaiBarang) { // method untuk klaim asuransi ketika nilai barang lebih dari 1000000 akan mendapatkan klaim asuransi VIP dan jika tidak akan mendapatkan yang standar.
        if (nilaiBarang > 1000000) {
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi " + super.nomorResi + " sedang diproses prioritas" + "\n");
        }
        else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja");
        }
    }
}
