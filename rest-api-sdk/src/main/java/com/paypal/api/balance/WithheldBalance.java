
package com.paypal.api.balance;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class WithheldBalance extends PayPalModel {

    private String currencyCode;
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WithheldBalance() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public WithheldBalance(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
