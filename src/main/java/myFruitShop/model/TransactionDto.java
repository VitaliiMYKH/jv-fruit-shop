package myFruitShop.model;

public class TransactionDto {
    private OperationType operationType;
    private Fruit fruitType;
    private int amount;

  /*  public TransactionDto(String operationType, String fruitType, int amount) {
        this.operationType = operationType;
        this.fruitType = fruitType;
        this.amount = amount;
    }*/

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Fruit getFruitType() {
        return fruitType;
    }

    public void setFruitType(Fruit fruitType) {
        this.fruitType = fruitType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}