public class ForSchleife {
    
    long summe = 1;
    int anzahl= 20;
    long[] werteArray = new long[20];

    for (int i = 0; i < anzahl; i++) {
        werteArray[i-1] = summe;
        summe = summe * 1;
        
    }

}

