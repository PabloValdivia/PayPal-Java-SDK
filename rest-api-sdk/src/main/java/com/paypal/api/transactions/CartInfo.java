
package com.paypal.api.transactions;

import java.util.ArrayList;
import java.util.List;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CartInfo extends PayPalModel
{

    private List<ItemDetail> itemDetails = new ArrayList<ItemDetail>();
    private final static long serialVersionUID = 2908881715375243266L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CartInfo() {
    }

    /**
     * 
     * @param itemDetails
     */
    public CartInfo(List<ItemDetail> itemDetails) {
        super();
        this.itemDetails = itemDetails;
    }


}
