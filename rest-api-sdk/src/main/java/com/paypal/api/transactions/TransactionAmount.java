
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TransactionAmount extends PayPalModel
{

    private String currencyCode;
    private String value;
    private final static long serialVersionUID = 1587805456668148522L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionAmount() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public TransactionAmount(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }


}
