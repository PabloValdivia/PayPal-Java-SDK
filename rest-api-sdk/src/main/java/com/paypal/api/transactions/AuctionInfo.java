
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AuctionInfo extends PayPalModel
{

    private final static long serialVersionUID = 1203674061801502274L;
    
    public AuctionInfo() {
    }

}
