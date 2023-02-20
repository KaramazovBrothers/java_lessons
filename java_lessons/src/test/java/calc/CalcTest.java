package calc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void sumTest() {
        Calc calc = new Calc();
        Assert.assertEquals(calc.sum(3, 3), 6, "Проверь операцию сложения");
        Assert.assertEquals(calc.div(3, 3), 1, "Проверь операцию деления");
        Assert.assertEquals(calc.sub(3, 3), 0, "Проверь операцию вычитания");
        Assert.assertEquals(calc.mult(3, 3), 9, "Проверь операцию умножения");
    }
}
