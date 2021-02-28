public class Main {

    public static int toplama(int x, int y, int z)
    {
        //System.out.println("Toplamları = " + (a + b + c));
        return (x+y+z); //return ile void olmaz int yazılır
    }

    public static int ikiilecarp(int a) {

        return a*2;

    }
    public static int ikiiletopla(int a)
    {
        return a+2;
    }
    public static int dortilecarp(int a)
    {
        return a*4;
    }



    public static void main(String[] args)
    {
        System.out.println("Çıktı değeri : " + toplama(1,2,3));

        System.out.println("Sonuç : " + dortilecarp(ikiiletopla(ikiilecarp(8))));

    }

}
