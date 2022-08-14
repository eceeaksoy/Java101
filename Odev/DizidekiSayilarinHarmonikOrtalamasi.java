package Odev;

public class DizidekiSayilarinHarmonikOrtalamasi {

    static float harmonicAverage(int[] a){
        float sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum += 1.0/a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        float result = list.length/harmonicAverage(list);
        System.out.println("Average of Harmonic: " + result);
    }
}
