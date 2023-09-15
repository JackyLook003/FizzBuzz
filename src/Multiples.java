public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int ans = 0;
        while (i < 1000) {
            if (i % 3 ==0) {
                ans += 1;
            }
            else if (i % 5 ==0) {
                ans += 1;
            }
            i++;

        }
        System.out.println(ans);
    }
}
