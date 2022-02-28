package ru.netology.sqr;

public class SQRService {
    public int calculateSquares(int border1, int border2) {
        int squaresCount = 0;
        for (int i = 10; i < 100; i++) {
            int iSquare = i * i;
            if ((iSquare >= border1) && (iSquare <= border2)) {
                squaresCount++;
            }
        }
        return squaresCount;
    }
}
