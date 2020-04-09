
package com.paypal.api.transactions;

import java.util.ArrayList;
import java.util.List;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemDetail extends PayPalModel
{

    private String itemCode;
    private String itemName;
    private String itemDescription;
    private String itemQuantity;
    private ItemUnitPrice itemUnitPrice;
    private ItemAmount itemAmount;
    private List<TaxAmount> taxAmounts = new ArrayList<TaxAmount>();
    private TotalItemAmount totalItemAmount;
    private String invoiceNumber;
    private final static long serialVersionUID = -827691883614917714L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemDetail() {
    }

    /**
     * 
     * @param itemUnitPrice
     * @param itemName
     * @param itemQuantity
     * @param itemAmount
     * @param itemCode
     * @param invoiceNumber
     * @param taxAmounts
     * @param itemDescription
     * @param totalItemAmount
     */
    public ItemDetail(String itemCode, String itemName, String itemDescription, String itemQuantity, ItemUnitPrice itemUnitPrice, ItemAmount itemAmount, List<TaxAmount> taxAmounts, TotalItemAmount totalItemAmount, String invoiceNumber) {
        super();
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemUnitPrice = itemUnitPrice;
        this.itemAmount = itemAmount;
        this.taxAmounts = taxAmounts;
        this.totalItemAmount = totalItemAmount;
        this.invoiceNumber = invoiceNumber;
    }

}
