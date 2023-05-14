package ru.netology.services;
public class CalcService {
    public int calculculate(int income, int expence, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {// можно ли отдыхать
                money = money + income - expence;
            } else {
                count++; //увеличивает счетчик месяцев отдыха
                money = (money - expence) / 3;
            }
        }
        return count;
    }

}
