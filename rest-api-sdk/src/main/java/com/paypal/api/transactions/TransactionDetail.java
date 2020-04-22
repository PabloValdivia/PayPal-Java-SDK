
package com.paypal.api.transactions;

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

	public TransactionDetail(TransactionInfo transactionInfo, PayerInfo payerInfo, ShippingInfo shippingInfo,
			CartInfo cartInfo, StoreInfo storeInfo, AuctionInfo auctionInfo, IncentiveInfo incentiveInfo) {
		super();
		this.transactionInfo = transactionInfo;
		this.payerInfo = payerInfo;
		this.shippingInfo = shippingInfo;
		this.cartInfo = cartInfo;
		this.storeInfo = storeInfo;
		this.auctionInfo = auctionInfo;
		this.incentiveInfo = incentiveInfo;
	}
}
