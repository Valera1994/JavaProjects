public class Task14 {
    public static void main(String[] args) {
        String str1 = "0";

        long before = System.currentTimeMillis();
        for(int i = 1; i <= 20000; i++){
            str1 += " " + i;
        }

        long after = System.currentTimeMillis();
        //System.out.println(str1);
        System.out.println(after - before);

        before = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("");
        for(int i = 1; i <= 20000; i++){
            str2.append(" ").append(i);
        }
        after = System.currentTimeMillis();
        //System.out.println(str2);
        System.out.println(after - before);
    }
}
