
package com.paypal.api.balance;

import java.util.List;
import java.util.Map;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Balances extends PayPalResource {

	private List<Balance> balances;
    private String accountId;
    private String asOfTime;
    private String lastRefreshTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Balances() {
    }

    /**
     * 
     * @param accountId
     * @param balance
     * @param asOfTime
     * @param lastRefreshTime
     */
    public Balances(List<Balance> balances, String accountId, String asOfTime, String lastRefreshTime) {
        super();
        this.balances = balances;
        this.accountId = accountId;
        this.asOfTime = asOfTime;
        this.lastRefreshTime = lastRefreshTime;
    }

    public static Balances get(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
    	if (containerMap == null) {
			throw new IllegalArgumentException("containerMap cannot be null");
		}
    	Object[] parameters = new Object[] {containerMap};
    	String pattern = "/v1/reporting/balances?as_of_time={0}";
    	String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
    	String payLoad = "";
    	return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Balances.class);
    }
}
