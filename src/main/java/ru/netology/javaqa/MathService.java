package ru.netology.javaqa;

public class MathService {

    public int crazy (int limit) {
        int count = 0;
        for (int i = 0; i <=limit; i++) {
            if (i * 13 < 400) {
                count++;
            }
        }
        return count;
    }
}
