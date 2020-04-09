
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class StoreInfo extends PayPalModel
{

    private final static long serialVersionUID = 2978273416546605821L;
    
    public StoreInfo() {
    	
    }

}
