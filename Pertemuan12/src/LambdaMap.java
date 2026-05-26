import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("24060124140172", "Syair Adharian");
        mahasiswaMap.put("24060124140201", "Abdel");
        mahasiswaMap.put("24060124140202", "Manda");
        mahasiswaMap.put("24060124140203", "Alya");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}