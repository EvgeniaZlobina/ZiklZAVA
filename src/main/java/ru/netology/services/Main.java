package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int income = 100_000;
        int expence = 60_000;
        int threshold = 150000;
        int quantly = service.calculculate(income, expence, threshold);
        System.out.println("месяцев " +quantly);
        }
    }
