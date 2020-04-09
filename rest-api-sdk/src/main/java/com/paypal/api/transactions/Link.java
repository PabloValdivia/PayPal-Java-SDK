
package com.paypal.api.transactions;

import com.paypal.base.rest.PayPalModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Link extends PayPalModel
{

    private String href;
    private String rel;
    private String method;
    private final static long serialVersionUID = 695588916463169808L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    /**
     * 
     * @param method
     * @param rel
     * @param href
     */
    public Link(String href, String rel, String method) {
        super();
        this.href = href;
        this.rel = rel;
        this.method = method;
    }

}
