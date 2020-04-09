
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TaxAmount_ extends PayPalModel
{

    private String currencyCode;
    private String value;
    private final static long serialVersionUID = 2976984649523995222L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxAmount_() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public TaxAmount_(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
