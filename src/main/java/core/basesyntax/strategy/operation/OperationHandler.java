package core.basesyntax.strategy.operation;

import core.basesyntax.model.FruitTransaction;

public interface OperationHandler {
    public void operation(FruitTransaction fruitTransaction);
}
