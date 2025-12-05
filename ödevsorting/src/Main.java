import java.util.Arrays;
import java.util.Random;
void main() {
    Random rand = new Random();
    int[]array=new int[50];
    for( int j=0; j< array.length; j++){
        array[j] = rand.nextInt(0,100);
        Arrays.sort(array);
    }
System.out.println(java.util.Arrays.toString(array));
}

