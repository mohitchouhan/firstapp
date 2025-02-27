
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerAddressDependentInfomation CustomerAddressDependentInfomation} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class CustomerAddressDependentInfomationCreateFluentHelper
    extends FluentHelperCreate<CustomerAddressDependentInfomationCreateFluentHelper, CustomerAddressDependentInfomation>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerAddressDependentInfomation CustomerAddressDependentInfomation} entity object that will be created in the S/4HANA system.
     * 
     */
    private final CustomerAddressDependentInfomation entity;

    /**
     * Creates a fluent helper object that will create a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerAddressDependentInfomation CustomerAddressDependentInfomation} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The CustomerAddressDependentInfomation to create.
     */
    public CustomerAddressDependentInfomationCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CustomerAddressDependentInfomation entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CustomerAddressDependentInfomation getEntity() {
        return entity;
    }

}
