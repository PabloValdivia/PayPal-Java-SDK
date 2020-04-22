package com.paypal.api.transactions;

public enum TransactionStatus {
	/** PayPal or merchant rules denied the transaction. **/
	D	 ,
	/** The original recipient partially refunded the transaction.**/
	F	 ,
	/** The transaction is pending. The transaction was created but waits for another payment process to complete, such as an ACH transaction, before the status changes to 'S'.**/
	P	,
	/** The transaction successfully completed without a denial and after any pending statuses.**/
	S	,
	/** A successful transaction was reversed and funds were refunded to the original sender.**/
	V	
	;
	
	 public String value() {
	      return name();
	 }

	public static TransactionStatus fromValue(String v) {
	    return valueOf(v);
	}
}
