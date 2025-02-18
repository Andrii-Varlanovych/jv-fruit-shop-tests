package core.basesyntax.strategy.operation;

import static org.junit.Assert.assertEquals;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import org.junit.Before;
import org.junit.Test;

public class SupplyOperationHandlerTest {
    private OperationHandler operationHandler;

    @Before
    public void setUp() {
        Storage.fruitsStorage.put("banana", 20);
        operationHandler = new SupplyOperationHandler();
    }

    @Test
    public void addToStorageReturnOperationHandler_Ok() {
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.SUPPLY, "banana", 20);
        operationHandler.operation(fruitTransaction);
        int expected = 40;
        int actual = Storage.fruitsStorage.get("banana");
        assertEquals(expected, actual);
    }
}
