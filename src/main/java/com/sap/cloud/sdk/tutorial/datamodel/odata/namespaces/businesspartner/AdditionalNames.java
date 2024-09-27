
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.AdditionalNamesField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.AdditionalNamesSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Additional Names<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerAliasType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AdditionalNames
    extends VdmEntity<AdditionalNames>
{

    /**
     * Selector for all available fields of AdditionalNames.
     * 
     */
    public final static AdditionalNamesSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartner")
    @JsonProperty("BusinessPartner")
    @Nullable
    @ODataField(odataName = "BusinessPartner")
    private String businessPartner;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartner</b> field to query operations.
     * 
     */
    public final static AdditionalNamesField<String> BUSINESS_PARTNER = new AdditionalNamesField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BPAliasPositionNumber</b></p>
     * 
     * @return
     *     Items with Business Partner Name/Alias
     */
    @Key
    @SerializedName("BPAliasPositionNumber")
    @JsonProperty("BPAliasPositionNumber")
    @Nullable
    @ODataField(odataName = "BPAliasPositionNumber")
    private String itemAlias;
    /**
     * Use with available fluent helpers to apply the <b>BPAliasPositionNumber</b> field to query operations.
     * 
     */
    public final static AdditionalNamesField<String> ITEM_ALIAS = new AdditionalNamesField<String>("BPAliasPositionNumber");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>BusinessPartnerAliasName</b></p>
     * 
     * @return
     *     Business Partner Alias
     */
    @SerializedName("BusinessPartnerAliasName")
    @JsonProperty("BusinessPartnerAliasName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerAliasName")
    private String alias;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerAliasName</b> field to query operations.
     * 
     */
    public final static AdditionalNamesField<String> ALIAS = new AdditionalNamesField<String>("BusinessPartnerAliasName");

    @Nonnull
    @Override
    public Class<AdditionalNames> getType() {
        return AdditionalNames.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @param businessPartner
     *     Business Partner Number
     */
    public void setBusinessPartner(
        @Nullable
        final String businessPartner) {
        rememberChangedField("BusinessPartner", this.businessPartner);
        this.businessPartner = businessPartner;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BPAliasPositionNumber</b></p>
     * 
     * @param itemAlias
     *     Items with Business Partner Name/Alias
     */
    public void setItemAlias(
        @Nullable
        final String itemAlias) {
        rememberChangedField("BPAliasPositionNumber", this.itemAlias);
        this.itemAlias = itemAlias;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>BusinessPartnerAliasName</b></p>
     * 
     * @param alias
     *     Business Partner Alias
     */
    public void setAlias(
        @Nullable
        final String alias) {
        rememberChangedField("BusinessPartnerAliasName", this.alias);
        this.alias = alias;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerAlias";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPAliasPositionNumber", getItemAlias());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPAliasPositionNumber", getItemAlias());
        values.put("BusinessPartnerAliasName", getAlias());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("BPAliasPositionNumber")) {
                final Object value = values.remove("BPAliasPositionNumber");
                if ((value == null)||(!value.equals(getItemAlias()))) {
                    setItemAlias(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerAliasName")) {
                final Object value = values.remove("BusinessPartnerAliasName");
                if ((value == null)||(!value.equals(getAlias()))) {
                    setAlias(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >AdditionalNamesField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AdditionalNamesField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >AdditionalNamesField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AdditionalNamesField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public Destination getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final Destination destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService.DEFAULT_SERVICE_PATH);
    }

}
