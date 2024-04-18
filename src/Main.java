public class Main {
    public static void main(String[] args) {
        String [] colours = {"red","yellow","blue"};
        for (int i=0;i<colours.length;i++){
            System.out.println(colours[i]);
        }

        String n = "47";
        int num = Integer.parseInt(n);
        System.out.println(num + 3);
        float flt = (float) num;
        System.out.println(flt);

        int j = 65;
        long l = j;
        float f = l;

        long lg = (long) f;
        int in = (int) f;
        char c = (char) in;
        System.out.println(c);

    }
}