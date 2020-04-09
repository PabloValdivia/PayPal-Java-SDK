
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemAmount extends PayPalModel
{

    private String currencyCode;
    private String value;
    private final static long serialVersionUID = -9220492537009650850L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemAmount() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public ItemAmount(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }


}
