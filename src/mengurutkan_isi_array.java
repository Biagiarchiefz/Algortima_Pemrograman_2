import java.lang.reflect.Array;
import java.util.Arrays;

public class mengurutkan_isi_array {
    public static void main(String[] args) {
        int[] array = {10, 1, 3, 6, 2}; // Array awal dengan data yang tidak berurutan

        // Langkah 1: Mengurutkan array menggunakan Arrays.sort()
        Arrays.sort(array);

        // Langkah 2: Menampilkan array yang sudah diurutkan
        System.out.println(Arrays.toString(array));
    }
}
