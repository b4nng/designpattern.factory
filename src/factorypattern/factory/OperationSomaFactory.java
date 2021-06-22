package factorypattern.factory;

import factorypattern.model.IOperation;
import factorypattern.model.OperationSoma;

public class OperationSomaFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationSoma();
    }
}
