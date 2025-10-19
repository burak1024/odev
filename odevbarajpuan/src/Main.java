void main() {
    double puan1 = 100;
    double puan2 = 50;
    double ort1 = puan1 *0.6;
    double ort2 = puan2 *0.4;
    double ort = ort1 + ort2;
    if(ort < 75) {
        IO.println("puanın " + ort + " kaldın");
    }
    else
        IO.println("puanın " + ort + " geçtin");
}


