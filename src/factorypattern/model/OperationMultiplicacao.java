package factorypattern.model;

public class OperationMultiplicacao implements IOperation{
    @Override
    public float firstThenSecond(float first, float second) {
        return first*second;
    }

    @Override
    public float secondThenFirst(float first, float second) {
        return second*first;
    }
}
