
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.PurchasingOrganizationSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PurchasingOrganization PurchasingOrganization} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class PurchasingOrganizationByKeyFluentHelper
    extends FluentHelperByKey<PurchasingOrganizationByKeyFluentHelper, PurchasingOrganization, PurchasingOrganizationSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PurchasingOrganization PurchasingOrganization} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code PurchasingOrganization}
     * @param purchOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code PurchasingOrganization}
     * @param supplier
     *     Supplier's Account Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public PurchasingOrganizationByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String supplier, final String purchOrganization) {
        super(servicePath, entityCollection);
        this.key.put("Supplier", supplier);
        this.key.put("PurchasingOrganization", purchOrganization);
    }

    @Override
    @Nonnull
    protected Class<PurchasingOrganization> getEntityClass() {
        return PurchasingOrganization.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
