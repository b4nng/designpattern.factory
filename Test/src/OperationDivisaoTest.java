package src;

import factorypattern.factory.OperationDivisaoFactory;
import factorypattern.model.IOperation;
import factorypattern.model.OperationDivisao;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationDivisaoTest {

    @Test
    public void deveRetornarDois(){
        IOperation operation = new OperationDivisaoFactory().getOperation();
        assertEquals(2.0, operation.firstThenSecond(10, 5));
    }

    @Test
    public void deveRetornarDez(){
        IOperation operation = new OperationDivisaoFactory().getOperation();
        assertEquals(10.0, operation.secondThenFirst(5, 50));
    }
}
