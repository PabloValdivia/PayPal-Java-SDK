
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class FeeAmount extends PayPalModel
{

    private String currencyCode;
    private String value;
    private final static long serialVersionUID = 7912787101277334611L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FeeAmount() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public FeeAmount(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
