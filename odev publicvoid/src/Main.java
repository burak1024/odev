public class Main {
    public static int kalan(int miktar, int fiyat) {
        miktar -= fiyat;
        IO.println("adam " + fiyat + " kadar harcadı. Yeni bütçe: " +miktar);
    return miktar;
    }

    public static void main(String[] args){
        int kalani = 1000;
        kalani = kalan(kalani, 100);
    }}


