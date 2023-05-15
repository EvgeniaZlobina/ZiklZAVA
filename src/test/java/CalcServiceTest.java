import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalcService;

public class CalcServiceTest {
    @Test
    public void NumberOfmonthsofrestTest() {
        CalcService service = new CalcService();
        int income = 100_000;
        int expence = 60_000;
        int threshold = 150000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculculate(income, expence, threshold);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberOfmonthsofrest1Test() {
        CalcService service = new CalcService();
        int income = 10_000;
        int expence = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculculate(income, expence, threshold);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }
}

