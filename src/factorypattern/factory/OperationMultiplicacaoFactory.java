package factorypattern.factory;

import factorypattern.model.IOperation;
import factorypattern.model.OperationMultiplicacao;

public class OperationMultiplicacaoFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationMultiplicacao();
    }
}
