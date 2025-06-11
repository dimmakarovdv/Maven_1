import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @Test
    void calculateRegisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRegisteredUnderLimit1() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateUnregisteredUnderLimit1() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}