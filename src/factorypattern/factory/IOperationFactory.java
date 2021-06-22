package factorypattern.factory;

import factorypattern.model.IOperation;

public interface IOperationFactory {
    IOperation getOperation();
}
