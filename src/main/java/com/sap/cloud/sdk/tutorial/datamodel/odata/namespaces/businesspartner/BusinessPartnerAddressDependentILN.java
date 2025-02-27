
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BusinessPartnerAddressDependentILNField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerAddressDependentILNSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Business Partner Address-Dependent ILN<p></p><p>Original entity name from the Odata EDM: <b>A_BPAddrDepdntIntlLocNumberType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerAddressDependentILN
    extends VdmEntity<BusinessPartnerAddressDependentILN>
{

    /**
     * Selector for all available fields of BusinessPartnerAddressDependentILN.
     * 
     */
    public final static BusinessPartnerAddressDependentILNSelectable ALL_FIELDS = () -> "*";
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
    public final static BusinessPartnerAddressDependentILNField<String> BUSINESS_PARTNER = new BusinessPartnerAddressDependentILNField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @return
     *     Address Number
     */
    @Key
    @SerializedName("AddressID")
    @JsonProperty("AddressID")
    @Nullable
    @ODataField(odataName = "AddressID")
    private String addressNumber;
    /**
     * Use with available fluent helpers to apply the <b>AddressID</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentILNField<String> ADDRESS_NUMBER = new BusinessPartnerAddressDependentILNField<String>("AddressID");
    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @return
     *     International location number  (part 1)
     */
    @SerializedName("InternationalLocationNumber1")
    @JsonProperty("InternationalLocationNumber1")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber1")
    private String intLocationNo1;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber1</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentILNField<String> INT_LOCATION_NO1 = new BusinessPartnerAddressDependentILNField<String>("InternationalLocationNumber1");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @return
     *     International location number (Part 2)
     */
    @SerializedName("InternationalLocationNumber2")
    @JsonProperty("InternationalLocationNumber2")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber2")
    private String intLocationNo2;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber2</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentILNField<String> INT_LOCATION_NO2 = new BusinessPartnerAddressDependentILNField<String>("InternationalLocationNumber2");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @return
     *     Check digit for the international location number
     */
    @SerializedName("InternationalLocationNumber3")
    @JsonProperty("InternationalLocationNumber3")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber3")
    private String checkDigit;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber3</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentILNField<String> CHECK_DIGIT = new BusinessPartnerAddressDependentILNField<String>("InternationalLocationNumber3");

    @Nonnull
    @Override
    public Class<BusinessPartnerAddressDependentILN> getType() {
        return BusinessPartnerAddressDependentILN.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressNumber
     *     Address Number
     */
    public void setAddressNumber(
        @Nullable
        final String addressNumber) {
        rememberChangedField("AddressID", this.addressNumber);
        this.addressNumber = addressNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @param intLocationNo1
     *     International location number  (part 1)
     */
    public void setIntLocationNo1(
        @Nullable
        final String intLocationNo1) {
        rememberChangedField("InternationalLocationNumber1", this.intLocationNo1);
        this.intLocationNo1 = intLocationNo1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @param intLocationNo2
     *     International location number (Part 2)
     */
    public void setIntLocationNo2(
        @Nullable
        final String intLocationNo2) {
        rememberChangedField("InternationalLocationNumber2", this.intLocationNo2);
        this.intLocationNo2 = intLocationNo2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @param checkDigit
     *     Check digit for the international location number
     */
    public void setCheckDigit(
        @Nullable
        final String checkDigit) {
        rememberChangedField("InternationalLocationNumber3", this.checkDigit);
        this.checkDigit = checkDigit;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPAddrDepdntIntlLocNumber";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("AddressID", getAddressNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("AddressID", getAddressNumber());
        values.put("InternationalLocationNumber1", getIntLocationNo1());
        values.put("InternationalLocationNumber2", getIntLocationNo2());
        values.put("InternationalLocationNumber3", getCheckDigit());
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
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressNumber()))) {
                    setAddressNumber(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber1")) {
                final Object value = values.remove("InternationalLocationNumber1");
                if ((value == null)||(!value.equals(getIntLocationNo1()))) {
                    setIntLocationNo1(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber2")) {
                final Object value = values.remove("InternationalLocationNumber2");
                if ((value == null)||(!value.equals(getIntLocationNo2()))) {
                    setIntLocationNo2(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber3")) {
                final Object value = values.remove("InternationalLocationNumber3");
                if ((value == null)||(!value.equals(getCheckDigit()))) {
                    setCheckDigit(((String) value));
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
    public static<T >BusinessPartnerAddressDependentILNField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerAddressDependentILNField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerAddressDependentILNField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerAddressDependentILNField<T>(fieldName, typeConverter);
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
