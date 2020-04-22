
package com.paypal.api.balance;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Balance extends PayPalModel{

    private String currency;
    private boolean primary;
    private TotalBalance totalBalance;
    private AvailableBalance availableBalance;
    private WithheldBalance withheldBalance;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Balance() {
    }

    /**
     * 
     * @param totalBalance
     * @param withheldBalance
     * @param currency
     * @param primary
     * @param availableBalance
     */
    public Balance(String currency, boolean primary, TotalBalance totalBalance, AvailableBalance availableBalance, WithheldBalance withheldBalance) {
        super();
        this.currency = currency;
        this.primary = primary;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.withheldBalance = withheldBalance;
    }

}
