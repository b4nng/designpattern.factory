package src;

import factorypattern.factory.OperationSomaFactory;
import factorypattern.model.IOperation;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationSomaTest {
    @Test
    public void deveRetornarDois(){
        IOperation operation = new OperationSomaFactory().getOperation();
        assertEquals(2.0, operation.firstThenSecond(10, -8));
    }

    @Test
    public void deveRetornarCinco(){
        IOperation operation = new OperationSomaFactory().getOperation();
        assertEquals(5.0, operation.firstThenSecond(10, -5));
    }
}
