public class ForSchleife {
    
    public static void main(String[] args) {
        long summe = 1;
        int anzahl= 20;
        long[] werteArray = new long[20];

        for (int i = 0; i < anzahl; i++) {
            werteArray[i] = summe;
            summe = summe * 2;
        }

        for (int i = 0; i < anzahl; i++) {
            System.out.println("werteArray[" + i + "] = " + werteArray[i]);
        }
    }
}
