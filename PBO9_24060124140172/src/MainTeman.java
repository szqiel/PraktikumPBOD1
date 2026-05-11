

public class MainTeman {
    public static void main(String[] args) {
        Teman circleGue = new Teman();

        circleGue.addNama("Acin");
        circleGue.addNama("Thom Yorke");
        circleGue.addNama("Alya");
        circleGue.addNama("Happy");
        circleGue.addNama("Kri"); 
        
        circleGue.showTeman();

        System.out.println("Banyaknya elemen saat ini: " + circleGue.getNbelm() + "\n");

        System.out.println("Nama di indeks ke-1: " + circleGue.getNama(1) + "\n");

        circleGue.setNama(3, "Syair");
        circleGue.showTeman();

        circleGue.delNama("Kri");
        circleGue.showTeman();

        System.out.println("Apakah 'Happy' ada di daftar? " + circleGue.isMember("Happy"));
        System.out.println("Apakah 'Rian' ada di daftar? " + circleGue.isMember("Rian") + "\n");

        circleGue.gantiNama("Alya", "Alya Cantik");
        circleGue.showTeman();

        System.out.println("Jumlah orang bernama 'Syair' di daftar: " + circleGue.countNama("Syair") + "\n");
    }
}