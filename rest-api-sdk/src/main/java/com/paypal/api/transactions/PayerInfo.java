
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PayerInfo extends PayPalModel
{

    private String accountId;
    private String emailAddress;
    private String addressStatus;
    private String payerStatus;
    private PayerName payerName;
    private String countryCode;
    private final static long serialVersionUID = -9081335454424505256L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PayerInfo() {
    }

    /**
     * 
     * @param accountId
     * @param emailAddress
     * @param countryCode
     * @param payerName
     * @param addressStatus
     * @param payerStatus
     */
    public PayerInfo(String accountId, String emailAddress, String addressStatus, String payerStatus, PayerName payerName, String countryCode) {
        super();
        this.accountId = accountId;
        this.emailAddress = emailAddress;
        this.addressStatus = addressStatus;
        this.payerStatus = payerStatus;
        this.payerName = payerName;
        this.countryCode = countryCode;
    }
}
