
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class InsuranceAmount extends PayPalModel
{

    private String currencyCode;
    private String value;
    private final static long serialVersionUID = -5188752435135686755L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InsuranceAmount() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public InsuranceAmount(String currencyCode, String value) {
        super();
        this.currencyCode = currencyCode;
        this.value = value;
    }

}
