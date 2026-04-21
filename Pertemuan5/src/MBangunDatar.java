public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(10);
        Persegi P2 = new Persegi(10);
        Lingkaran L1 = new Lingkaran(7);

        System.out.println("Apakah luas P1 dan P2 sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah keliling P1 dan L1 sama? " + P1.isEqualKeliling(L1));

        System.out.println("\nSisi Persegi P1 awal: " + P1.getSisi());
        P1.zoomIn();
        System.out.println("Sisi Persegi P1 setelah zoomIn (10%): " + P1.getSisi());

        System.out.println("Jari-jari L1 awal: " + L1.getJari());
        L1.zoomOut();
        System.out.println("Jari-jari L1 setelah zoomOut (10%): " + L1.getJari());
    }
}