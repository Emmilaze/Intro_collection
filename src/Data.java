public class Data {

    public static String[] generator(int n) {
        String str[] = new String[n];
        for (int i = 0; i < n; i++)
            str[i] = "str" + i;
        return str;
    }
}
