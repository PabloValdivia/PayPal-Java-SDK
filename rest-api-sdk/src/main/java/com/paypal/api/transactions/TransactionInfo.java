
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TransactionInfo extends PayPalResource
{

    private String paypalAccountId;
    private String transactionId;
    private String transactionEventCode;
    private String transactionInitiationDate;
    private String transactionUpdatedDate;
    private TransactionAmount transactionAmount;
    private FeeAmount feeAmount;
    private InsuranceAmount insuranceAmount;
    private ShippingAmount shippingAmount;
    private ShippingDiscountAmount shippingDiscountAmount;
    private String transactionStatus;
    private String transactionSubject;
    private String transactionNote;
    private String invoiceId;
    private String customField;
    private String protectionEligibility;
    private final static long serialVersionUID = -6274470237950618600L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionInfo() {
    }

    /**
     * 
     * @param insuranceAmount
     * @param transactionStatus
     * @param paypalAccountId
     * @param shippingDiscountAmount
     * @param transactionUpdatedDate
     * @param transactionEventCode
     * @param transactionId
     * @param customField
     * @param protectionEligibility
     * @param feeAmount
     * @param transactionNote
     * @param transactionAmount
     * @param transactionSubject
     * @param shippingAmount
     * @param invoiceId
     * @param transactionInitiationDate
     */
    public TransactionInfo(String paypalAccountId, String transactionId, String transactionEventCode, String transactionInitiationDate, String transactionUpdatedDate, TransactionAmount transactionAmount, FeeAmount feeAmount, InsuranceAmount insuranceAmount, ShippingAmount shippingAmount, ShippingDiscountAmount shippingDiscountAmount, String transactionStatus, String transactionSubject, String transactionNote, String invoiceId, String customField, String protectionEligibility) {
        super();
        this.paypalAccountId = paypalAccountId;
        this.transactionId = transactionId;
        this.transactionEventCode = transactionEventCode;
        this.transactionInitiationDate = transactionInitiationDate;
        this.transactionUpdatedDate = transactionUpdatedDate;
        this.transactionAmount = transactionAmount;
        this.feeAmount = feeAmount;
        this.insuranceAmount = insuranceAmount;
        this.shippingAmount = shippingAmount;
        this.shippingDiscountAmount = shippingDiscountAmount;
        this.transactionStatus = transactionStatus;
        this.transactionSubject = transactionSubject;
        this.transactionNote = transactionNote;
        this.invoiceId = invoiceId;
        this.customField = customField;
        this.protectionEligibility = protectionEligibility;
    }

}
