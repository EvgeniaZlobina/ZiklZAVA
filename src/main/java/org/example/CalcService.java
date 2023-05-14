public class CalcService {
    public int calculate { int income, int expence) {
            // i - счетчик месяцев отдыха
            int threshold = 0; // количество денег на счету
            for (int i = 0; i < 12; i++) {
                if (threshold <= 20000) {// можно ли отдыхать
                    i++; //увеличивает счетчик месяцев отдыха
                    threshold = threshold + income - expence;
                } else {
                    threshold = (threshold - expence) / 3;}
            }
        }
        return threshold;
        }
    }

}
