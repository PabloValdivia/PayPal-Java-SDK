
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TaxAmount extends PayPalModel
{

    private TaxAmount_ taxAmount;
    private final static long serialVersionUID = 9018986968311980873L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxAmount() {
    }

    /**
     * 
     * @param taxAmount
     */
    public TaxAmount(TaxAmount_ taxAmount) {
        super();
        this.taxAmount = taxAmount;
    }

}
