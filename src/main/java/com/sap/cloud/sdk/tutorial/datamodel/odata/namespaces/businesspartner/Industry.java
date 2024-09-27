
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.IndustryField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.IndustrySelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Industry<p></p><p>Original entity name from the Odata EDM: <b>A_BuPaIndustryType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Industry
    extends VdmEntity<Industry>
{

    /**
     * Selector for all available fields of Industry.
     * 
     */
    public final static IndustrySelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustrySector</b></p>
     * 
     * @return
     *     Industry
     */
    @Key
    @SerializedName("IndustrySector")
    @JsonProperty("IndustrySector")
    @Nullable
    @ODataField(odataName = "IndustrySector")
    private String industry;
    /**
     * Use with available fluent helpers to apply the <b>IndustrySector</b> field to query operations.
     * 
     */
    public final static IndustryField<String> INDUSTRY = new IndustryField<String>("IndustrySector");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IndustrySystemType</b></p>
     * 
     * @return
     *     Industry System
     */
    @Key
    @SerializedName("IndustrySystemType")
    @JsonProperty("IndustrySystemType")
    @Nullable
    @ODataField(odataName = "IndustrySystemType")
    private String industrySystem;
    /**
     * Use with available fluent helpers to apply the <b>IndustrySystemType</b> field to query operations.
     * 
     */
    public final static IndustryField<String> INDUSTRY_SYSTEM = new IndustryField<String>("IndustrySystemType");
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
    public final static IndustryField<String> BUSINESS_PARTNER = new IndustryField<String>("BusinessPartner");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsStandardIndustry</b></p>
     * 
     * @return
     *     Industry is Standard for BP in Industry System
     */
    @SerializedName("IsStandardIndustry")
    @JsonProperty("IsStandardIndustry")
    @Nullable
    @ODataField(odataName = "IsStandardIndustry")
    private String standardIndustry;
    /**
     * Use with available fluent helpers to apply the <b>IsStandardIndustry</b> field to query operations.
     * 
     */
    public final static IndustryField<String> STANDARD_INDUSTRY = new IndustryField<String>("IsStandardIndustry");
    /**
     * Constraints: Not nullable, Maximum length: 100 <p>Original property name from the Odata EDM: <b>IndustryKeyDescription</b></p>
     * 
     * @return
     *     Description
     */
    @SerializedName("IndustryKeyDescription")
    @JsonProperty("IndustryKeyDescription")
    @Nullable
    @ODataField(odataName = "IndustryKeyDescription")
    private String description;
    /**
     * Use with available fluent helpers to apply the <b>IndustryKeyDescription</b> field to query operations.
     * 
     */
    public final static IndustryField<String> DESCRIPTION = new IndustryField<String>("IndustryKeyDescription");

    @Nonnull
    @Override
    public Class<Industry> getType() {
        return Industry.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustrySector</b></p>
     * 
     * @param industry
     *     Industry
     */
    public void setIndustry(
        @Nullable
        final String industry) {
        rememberChangedField("IndustrySector", this.industry);
        this.industry = industry;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IndustrySystemType</b></p>
     * 
     * @param industrySystem
     *     Industry System
     */
    public void setIndustrySystem(
        @Nullable
        final String industrySystem) {
        rememberChangedField("IndustrySystemType", this.industrySystem);
        this.industrySystem = industrySystem;
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
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsStandardIndustry</b></p>
     * 
     * @param standardIndustry
     *     Industry is Standard for BP in Industry System
     */
    public void setStandardIndustry(
        @Nullable
        final String standardIndustry) {
        rememberChangedField("IsStandardIndustry", this.standardIndustry);
        this.standardIndustry = standardIndustry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 100 <p>Original property name from the Odata EDM: <b>IndustryKeyDescription</b></p>
     * 
     * @param description
     *     Description
     */
    public void setDescription(
        @Nullable
        final String description) {
        rememberChangedField("IndustryKeyDescription", this.description);
        this.description = description;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BuPaIndustry";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("IndustrySector", getIndustry());
        result.put("IndustrySystemType", getIndustrySystem());
        result.put("BusinessPartner", getBusinessPartner());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("IndustrySector", getIndustry());
        values.put("IndustrySystemType", getIndustrySystem());
        values.put("BusinessPartner", getBusinessPartner());
        values.put("IsStandardIndustry", getStandardIndustry());
        values.put("IndustryKeyDescription", getDescription());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("IndustrySector")) {
                final Object value = values.remove("IndustrySector");
                if ((value == null)||(!value.equals(getIndustry()))) {
                    setIndustry(((String) value));
                }
            }
            if (values.containsKey("IndustrySystemType")) {
                final Object value = values.remove("IndustrySystemType");
                if ((value == null)||(!value.equals(getIndustrySystem()))) {
                    setIndustrySystem(((String) value));
                }
            }
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("IsStandardIndustry")) {
                final Object value = values.remove("IsStandardIndustry");
                if ((value == null)||(!value.equals(getStandardIndustry()))) {
                    setStandardIndustry(((String) value));
                }
            }
            if (values.containsKey("IndustryKeyDescription")) {
                final Object value = values.remove("IndustryKeyDescription");
                if ((value == null)||(!value.equals(getDescription()))) {
                    setDescription(((String) value));
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
    public static<T >IndustryField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new IndustryField<T>(fieldName);
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
    public static<T,DomainT >IndustryField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new IndustryField<T>(fieldName, typeConverter);
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
