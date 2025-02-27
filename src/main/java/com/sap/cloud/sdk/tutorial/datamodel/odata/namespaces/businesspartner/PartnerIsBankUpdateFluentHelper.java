
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PartnerIsBank PartnerIsBank} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class PartnerIsBankUpdateFluentHelper
    extends FluentHelperUpdate<PartnerIsBankUpdateFluentHelper, PartnerIsBank>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PartnerIsBank PartnerIsBank} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final PartnerIsBank entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PartnerIsBank PartnerIsBank} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The PartnerIsBank to take the updated values from.
     */
    public PartnerIsBankUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final PartnerIsBank entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected PartnerIsBank getEntity() {
        return entity;
    }

}
