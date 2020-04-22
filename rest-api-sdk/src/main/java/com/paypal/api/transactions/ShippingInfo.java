
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ShippingInfo extends PayPalModel
{

    private String name;
    private Address address;
    private final static long serialVersionUID = -1739051783014663512L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingInfo() {
    }

    /**
     * 
     * @param address
     * @param name
     */
    public ShippingInfo(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }

}
