
package com.paypal.api.transactions;

import java.util.ArrayList;
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
public class TransactionDetails extends PayPalResource
{

    private List<TransactionDetail> transactionDetails = new ArrayList<TransactionDetail>();
    private String accountNumber;
    private String lastRefreshedDatetime;
    private long page;
    private long totalItems;
    private long totalPages;
    private List<Link> links = new ArrayList<Link>();
    private final static long serialVersionUID = -8365723154668411763L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionDetails() {
    }

    public static TransactionDetails get(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
    	if (containerMap == null) {
			throw new IllegalArgumentException("containerMap cannot be null");
		}
    	Object[] parameters = new Object[] {containerMap};
    	String pattern = "/v1/reporting/transactions?start_date={0}&end_date={1}";
    	String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
    	String payLoad = "";
    	return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, TransactionDetails.class);
    }
    
}
