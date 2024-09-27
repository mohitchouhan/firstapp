
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.PurchasingOrganizationTextField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.PurchasingOrganizationTextSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Purchasing Organization Text<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierPurchasingOrgTextType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class PurchasingOrganizationText
    extends VdmEntity<PurchasingOrganizationText>
{

    /**
     * Selector for all available fields of PurchasingOrganizationText.
     * 
     */
    public final static PurchasingOrganizationTextSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @return
     *     Account Number of Supplier
     */
    @Key
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static PurchasingOrganizationTextField<String> SUPPLIER = new PurchasingOrganizationTextField<String>("Supplier");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @return
     *     Purchasing Organization
     */
    @Key
    @SerializedName("PurchasingOrganization")
    @JsonProperty("PurchasingOrganization")
    @Nullable
    @ODataField(odataName = "PurchasingOrganization")
    private String purchOrganization;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingOrganization</b> field to query operations.
     * 
     */
    public final static PurchasingOrganizationTextField<String> PURCH_ORGANIZATION = new PurchasingOrganizationTextField<String>("PurchasingOrganization");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @return
     *     Language key
     */
    @Key
    @SerializedName("Language")
    @JsonProperty("Language")
    @Nullable
    @ODataField(odataName = "Language")
    private String language;
    /**
     * Use with available fluent helpers to apply the <b>Language</b> field to query operations.
     * 
     */
    public final static PurchasingOrganizationTextField<String> LANGUAGE = new PurchasingOrganizationTextField<String>("Language");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>LongTextID</b></p>
     * 
     * @return
     *     Text ID
     */
    @Key
    @SerializedName("LongTextID")
    @JsonProperty("LongTextID")
    @Nullable
    @ODataField(odataName = "LongTextID")
    private String textID;
    /**
     * Use with available fluent helpers to apply the <b>LongTextID</b> field to query operations.
     * 
     */
    public final static PurchasingOrganizationTextField<String> TEXT_ID = new PurchasingOrganizationTextField<String>("LongTextID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>LongText</b></p>
     * 
     * @return
     *     String
     */
    @SerializedName("LongText")
    @JsonProperty("LongText")
    @Nullable
    @ODataField(odataName = "LongText")
    private String string;
    /**
     * Use with available fluent helpers to apply the <b>LongText</b> field to query operations.
     * 
     */
    public final static PurchasingOrganizationTextField<String> STRING = new PurchasingOrganizationTextField<String>("LongText");

    @Nonnull
    @Override
    public Class<PurchasingOrganizationText> getType() {
        return PurchasingOrganizationText.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     Account Number of Supplier
     */
    public void setSupplier(
        @Nullable
        final String supplier) {
        rememberChangedField("Supplier", this.supplier);
        this.supplier = supplier;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @param purchOrganization
     *     Purchasing Organization
     */
    public void setPurchOrganization(
        @Nullable
        final String purchOrganization) {
        rememberChangedField("PurchasingOrganization", this.purchOrganization);
        this.purchOrganization = purchOrganization;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     Language key
     */
    public void setLanguage(
        @Nullable
        final String language) {
        rememberChangedField("Language", this.language);
        this.language = language;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>LongTextID</b></p>
     * 
     * @param textID
     *     Text ID
     */
    public void setTextID(
        @Nullable
        final String textID) {
        rememberChangedField("LongTextID", this.textID);
        this.textID = textID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>LongText</b></p>
     * 
     * @param string
     *     String
     */
    public void setString(
        @Nullable
        final String string) {
        rememberChangedField("LongText", this.string);
        this.string = string;
    }

    @Override
    protected String getEntityCollection() {
        return "A_SupplierPurchasingOrgText";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("PurchasingOrganization", getPurchOrganization());
        result.put("Language", getLanguage());
        result.put("LongTextID", getTextID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("PurchasingOrganization", getPurchOrganization());
        values.put("Language", getLanguage());
        values.put("LongTextID", getTextID());
        values.put("LongText", getString());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("PurchasingOrganization")) {
                final Object value = values.remove("PurchasingOrganization");
                if ((value == null)||(!value.equals(getPurchOrganization()))) {
                    setPurchOrganization(((String) value));
                }
            }
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("LongTextID")) {
                final Object value = values.remove("LongTextID");
                if ((value == null)||(!value.equals(getTextID()))) {
                    setTextID(((String) value));
                }
            }
            if (values.containsKey("LongText")) {
                final Object value = values.remove("LongText");
                if ((value == null)||(!value.equals(getString()))) {
                    setString(((String) value));
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
    public static<T >PurchasingOrganizationTextField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new PurchasingOrganizationTextField<T>(fieldName);
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
    public static<T,DomainT >PurchasingOrganizationTextField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new PurchasingOrganizationTextField<T>(fieldName, typeConverter);
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
