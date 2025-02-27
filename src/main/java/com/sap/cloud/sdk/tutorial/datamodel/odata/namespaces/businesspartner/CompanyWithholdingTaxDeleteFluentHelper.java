
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CompanyWithholdingTax CompanyWithholdingTax} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class CompanyWithholdingTaxDeleteFluentHelper
    extends FluentHelperDelete<CompanyWithholdingTaxDeleteFluentHelper, CompanyWithholdingTax>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CompanyWithholdingTax CompanyWithholdingTax} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final CompanyWithholdingTax entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CompanyWithholdingTax CompanyWithholdingTax} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     The entity collection to direct the update requests to.
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The CompanyWithholdingTax to delete from the endpoint.
     */
    public CompanyWithholdingTaxDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CompanyWithholdingTax entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CompanyWithholdingTax getEntity() {
        return entity;
    }

}
