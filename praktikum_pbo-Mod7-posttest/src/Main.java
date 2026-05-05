import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<MetodePembayaran> metode = new ArrayList<>();

        metode.add(new EWallet());
        metode.add(new KartuKredit());

        for (MetodePembayaran daftar : metode) {

            if (daftar instanceof EWallet) {
                EWallet ewall = (EWallet) daftar;
                ewall.bayar(100000); 
            }
            else if (daftar instanceof KartuKredit) {
                ((KartuKredit)daftar).bayar(100000);
            }
            else {
                daftar.bayar(100000);
            }
        }
    }
}
