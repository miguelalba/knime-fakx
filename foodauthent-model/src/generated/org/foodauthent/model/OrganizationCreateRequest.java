/*
 * TODO	
 */
package org.foodauthent.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.foodauthent.model.OrganizationalPostalAddress;



/**
 * Organization Object
 *
 * @author Martin Horn, University of Konstanz
 */
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public class OrganizationCreateRequest extends OrganizationBase  {


  protected String parentDn;
  protected String organizationName;
  
  public String getTypeID() {
    return "OrganizationCreateRequest";
  }
  

  
  protected OrganizationCreateRequest() {}
  
  private OrganizationCreateRequest(OrganizationCreateRequestBuilder builder) {
    super();
    description = immutable(builder.description);
    faxNumbers = immutable(builder.faxNumbers);
    phoneNumbers = immutable(builder.phoneNumbers);
    businessCategory = immutable(builder.businessCategory);
    postalAddress = immutable(builder.postalAddress);
    billingAddress = immutable(builder.billingAddress);
    if(builder.parentDn == null) {
        throw new IllegalArgumentException("parentDn must not be null.");
    }
    parentDn = immutable(builder.parentDn);
    if(builder.organizationName == null) {
        throw new IllegalArgumentException("organizationName must not be null.");
    }
    organizationName = immutable(builder.organizationName);
    
    
  }
  
   /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        OrganizationCreateRequest ent = (OrganizationCreateRequest)o;
        return super.equals(ent);
    }


  /**
   * parent organization&#39;s LDAP dn
   * @return parentDn , never <code>null</code>
   */
  public String getParentDn() {
        return parentDn;
    }
    
  /**
   * unique OrganizationalUnit name
   * @return organizationName , never <code>null</code>
   */
  public String getOrganizationName() {
        return organizationName;
    }
    
  
 	/**
  	 * @return a newly created builder
  	 */
  	public static OrganizationCreateRequestBuilder builder() {
  		return new OrganizationCreateRequestBuilder();
  	}
  	
  	/**
	 * Copy-builder, i.e. creates a new builder with all properties of the passed
	 * entity pre-set.
	 * 
	 * @param entity
	 *            entity to copy the properties from
	 * @return a new builder with the properties set
	 */
	public static OrganizationCreateRequestBuilder builder(OrganizationCreateRequest entity) {
		OrganizationCreateRequestBuilder builder = builder();
        builder.description = entity.description;
        builder.faxNumbers = entity.faxNumbers;
        builder.phoneNumbers = entity.phoneNumbers;
        builder.businessCategory = entity.businessCategory;
        builder.postalAddress = entity.postalAddress;
        builder.billingAddress = entity.billingAddress;
        builder.parentDn = entity.parentDn;
        builder.organizationName = entity.organizationName;
 		return builder;
  	}
  	
  
    public static class OrganizationCreateRequestBuilder extends OrganizationBaseBuilder {
    
        protected OrganizationCreateRequestBuilder(){
            super();
        }
    
        private String description;
        private java.util.List<String> faxNumbers = new java.util.ArrayList<>();
        private java.util.List<String> phoneNumbers = new java.util.ArrayList<>();
        private String businessCategory;
        private OrganizationalPostalAddress postalAddress;
        private OrganizationalPostalAddress billingAddress;
        private String parentDn;
        private String organizationName;

        /**
         * verbose description
         * @return description 
         */
        public OrganizationCreateRequestBuilder setDescription(String description) {
             this.description = description;
             return this;
        }

        /**
         * fax numbers
         * @return faxNumbers 
         */
        public OrganizationCreateRequestBuilder setFaxNumbers(java.util.List<String> faxNumbers) {
             this.faxNumbers = faxNumbers;
             return this;
        }

        /**
         * phone numbers
         * @return phoneNumbers 
         */
        public OrganizationCreateRequestBuilder setPhoneNumbers(java.util.List<String> phoneNumbers) {
             this.phoneNumbers = phoneNumbers;
             return this;
        }

        /**
         * business category
         * @return businessCategory 
         */
        public OrganizationCreateRequestBuilder setBusinessCategory(String businessCategory) {
             this.businessCategory = businessCategory;
             return this;
        }

        /**
         * Get postalAddress
         * @return postalAddress 
         */
        public OrganizationCreateRequestBuilder setPostalAddress(OrganizationalPostalAddress postalAddress) {
             this.postalAddress = postalAddress;
             return this;
        }

        /**
         * Get billingAddress
         * @return billingAddress 
         */
        public OrganizationCreateRequestBuilder setBillingAddress(OrganizationalPostalAddress billingAddress) {
             this.billingAddress = billingAddress;
             return this;
        }

        /**
         * parent organization&#39;s LDAP dn
         * @return parentDn , never <code>null</code>
         */
        public OrganizationCreateRequestBuilder setParentDn(String parentDn) {
             if(parentDn == null) {
                 throw new IllegalArgumentException("parentDn must not be null.");
             }
             this.parentDn = parentDn;
             return this;
        }

        /**
         * unique OrganizationalUnit name
         * @return organizationName , never <code>null</code>
         */
        public OrganizationCreateRequestBuilder setOrganizationName(String organizationName) {
             if(organizationName == null) {
                 throw new IllegalArgumentException("organizationName must not be null.");
             }
             this.organizationName = organizationName;
             return this;
        }

        
        public OrganizationCreateRequest build() {
            return new OrganizationCreateRequest(this);
        }
    
    }
    
    
    /**
     * Turns an object into an immutable one (if not already).
     * TODO move it somewhere else
     *
     * @param obj the object to treat
     * @return the object itself or a immutable copy
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> T immutable(final T obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Map) {
            return (T)Collections.unmodifiableMap(new HashMap((Map)obj));
        } else if (obj instanceof List) {
            return (T)Collections.unmodifiableList(new ArrayList((List)obj));
        } else {
            return obj;
        }
    }
    

}
