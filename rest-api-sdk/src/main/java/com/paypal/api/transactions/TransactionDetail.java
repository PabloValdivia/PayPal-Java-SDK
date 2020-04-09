
package com.paypal.api.transactions;

import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.ShippingInfo;
import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TransactionDetail extends PayPalModel
{

    private TransactionInfo transactionInfo;
    private PayerInfo payerInfo;
    private ShippingInfo shippingInfo;
    private CartInfo cartInfo;
    private StoreInfo storeInfo;
    private AuctionInfo auctionInfo;
    private IncentiveInfo incentiveInfo;
    private final static long serialVersionUID = 7885357498359765365L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionDetail() {
    }



}
