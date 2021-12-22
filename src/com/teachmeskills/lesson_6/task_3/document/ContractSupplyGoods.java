package com.teachmeskills.lesson_6.task_3.document;

import java.util.Date;

public class ContractSupplyGoods extends BaseDocument implements IDocument {    // контракт на поставку товаров

    String itemType;            // тип товаров
    int quantityOfItem;        // количество товаров

    public ContractSupplyGoods(String numDoc, Date dateDoc, String itemType, int quantityOfItem) {
        super(numDoc, dateDoc);
        this.itemType = itemType;
        this.quantityOfItem = quantityOfItem;
    }

    @Override
    public String toString() {
        return "ContractSupplyGoods:" +
                "\n  numDoc = " + numDoc +
                ",\n  dateDoc = " + dateDoc +
                ",\n  itemType = " + itemType +
                ",\n  quantityOfItem = " + quantityOfItem;
    }
}
