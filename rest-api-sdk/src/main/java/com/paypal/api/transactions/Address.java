
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Address extends PayPalModel
{

    private String line1;
    private String line2;
    private String city;
    private String countryCode;
    private String postalCode;
    private final static long serialVersionUID = -6765417297191799945L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param city
     * @param countryCode
     * @param postalCode
     * @param line2
     * @param line1
     */
    public Address(String line1, String line2, String city, String countryCode, String postalCode) {
        super();
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

}
