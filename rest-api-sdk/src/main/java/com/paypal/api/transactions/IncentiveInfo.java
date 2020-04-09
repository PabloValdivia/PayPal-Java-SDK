
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class IncentiveInfo extends PayPalModel
{

    private final static long serialVersionUID = 7351526152024832614L;
    
    public IncentiveInfo() {
    }

}
