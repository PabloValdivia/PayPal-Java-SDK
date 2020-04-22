
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PayerName extends PayPalModel
{

    private String givenName;
    private String surname;
    private String alternateFullName;
    private final static long serialVersionUID = 4586496589687696152L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PayerName() {
    }

    /**
     * 
     * @param surname
     * @param givenName
     * @param alternateFullName
     */
    public PayerName(String givenName, String surname, String alternateFullName) {
        super();
        this.givenName = givenName;
        this.surname = surname;
        this.alternateFullName = alternateFullName;
    }
}
