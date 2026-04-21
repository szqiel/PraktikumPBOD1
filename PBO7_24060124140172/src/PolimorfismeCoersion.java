/* Nama File: PolimorfismeCoersion.java
 * Deskripsi: Program ilustrasi Polimorfisme Ad Hoc Coersion
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 21 April 2026*/

public class PolimorfismeCoersion {
    public static void main(String[] args) {
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt; 
        double nilaiDouble = (double) nilaiInt;
        System.out.println(nilaiInt);
        System.out.println(nilaiChar);
        System.out.println(nilaiDouble);

        int nilaiIntLagi = (int) nilaiDouble;
        System.out.println(nilaiIntLagi);

        String X = "1234";
        String Y = "5678";
        String S = X + Y; 
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        System.out.println(S);
        System.out.println(Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println(R);
        System.out.println(D);

        Integer A = Integer.parseInt(S);
        System.out.println(A);

        String T = A.toString();
        System.out.println(T);
    }
}