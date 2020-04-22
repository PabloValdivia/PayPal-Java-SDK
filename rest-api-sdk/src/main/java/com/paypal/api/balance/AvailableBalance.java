
package com.paypal.api.balance;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AvailableBalance  extends PayPalModel{

    private String currencyCode;
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvailableBalance() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public AvailableBalance(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
