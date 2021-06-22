package src;

import factorypattern.factory.OperationSomaFactory;
import factorypattern.model.IOperation;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationMultiplicacaoTest {
    @Test
    public void deveRetornarDois(){
        IOperation operation = new OperationSomaFactory().getOperation();
        assertEquals(10, operation.firstThenSecond(2, 5));
    }

    @Test
    public void deveRetornarOito(){
        IOperation operation = new OperationSomaFactory().getOperation();
        assertEquals(8, operation.secondThenFirst(2, 4));
    }
}
