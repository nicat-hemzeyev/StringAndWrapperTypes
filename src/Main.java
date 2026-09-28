import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //task3
        StringBuilder a = new StringBuilder("hello");
        System.out.println(a.reverse());

        //task4
        String b = "listen";
        String c = "silent";
        char[] c1 = b.toCharArray();
        char[] c2 = c.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(Arrays.equals(c1, c2));

//task5
        String s = "I LOVE JAVA";
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//tast6
        String m = "programming";
        char[] arr6 = m.toCharArray();
        int count = 1;
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 1 + i; j < arr6.length; j++) {
                if (arr6[i] == arr6[j]) {
                    count++;
                    System.out.println(arr6[i] + "= " + count);
                }
            }
            count = 1;
        }
        String f ="salam dunya";
        StringBuilder nv = new StringBuilder(f);
    }
}