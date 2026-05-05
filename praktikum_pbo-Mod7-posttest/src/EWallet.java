public class EWallet extends MetodePembayaran {
    @Override
    public void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");
    }

    public void bayar(double nominal, String nomorHP) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHP);
    }
}
