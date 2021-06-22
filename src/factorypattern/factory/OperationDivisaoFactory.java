package factorypattern.factory;

import factorypattern.model.IOperation;
import factorypattern.model.OperationDivisao;

public class OperationDivisaoFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationDivisao();
    }
}
