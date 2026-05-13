import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<LayananEkspedisi> layanan = new ArrayList<>(); // deklarasi ArrayList untuk menampung setiap objek layanan dari class LayananEkspedisi (upcasting).

        /*Pembuatan setiap objek layanan dan memasukkannya ke dalam arrayList. */
        layanan.add(new LayananReguler("REG-11", 2, 50, 50,50)); 
        layanan.add(new LayananExpress("EXP-22", 5, 10,10,10));
        layanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0; // deklarasi total pendapatan perusahaannya dengan isi 0.0

        for (LayananEkspedisi list : layanan) { // perulangan berdasarkan class induk yang menjadi data type dari sebuah list perulangan dan mengaksesnya berdasarkan kumpulan objek dari arrayList layanan
            list.cetakResi(); // langsung akses ke fungsi cetakResi dalam class induknya

            totalPendapatanPerusahaan = list.hitungOngkir();

            if (list instanceof LayananReguler) { // memeriksa terlebih dahulu dalam list, bahwa objek merupakan LayananReguler.
                LayananReguler reg = (LayananReguler) list; // jika iya, lakukan downcasting dengan variabel reg.
                reg.hitungOngkir(true, 25); // kemudian pemanggilan method overloading yang disertai parameter.
            }
            else if (list instanceof LayananExpress) { // memeriksa terlebih dahulu dalam list, bahwa objek merupakan LayananExpress. lalu melakukan downcasting dari objeknya dengan variabel exp dan pemanggilan method
                LayananExpress exp = (LayananExpress) list;
                exp.klaimAsuransi(1500000);
            }
            else if (list instanceof LayananInternasional) { // memeriksa terlebih dahulu dalam list, bahwa objek merupakan LayananInternasional. lalu melakukan downcasting dari objeknya dengan variabel inter dan pemanggilan method
                LayananInternasional inter = (LayananInternasional) list;
                inter.cetakManifest();
            }
        }

        System.out.println("\nTotal Pendapatan Perusahaan : " + totalPendapatanPerusahaan);
    }
}
