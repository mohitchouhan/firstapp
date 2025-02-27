
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.AddressIndependentFaxNumberField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.AddressIndependentFaxNumberSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Address Independent Fax Number<p></p><p>Original entity name from the Odata EDM: <b>A_BPAddressIndependentFaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressIndependentFaxNumber
    extends VdmEntity<AddressIndependentFaxNumber>
{

    /**
     * Selector for all available fields of AddressIndependentFaxNumber.
     * 
     */
    public final static AddressIndependentFaxNumberSelectable ALL_FIELDS = () -> "*";
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
    public final static AddressIndependentFaxNumberField<String> BUSINESS_PARTNER = new AddressIndependentFaxNumberField<String>("BusinessPartner");
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
    public final static AddressIndependentFaxNumberField<String> ADDRESS_NUMBER = new AddressIndependentFaxNumberField<String>("AddressID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @return
     *     Person Number
     */
    @Key
    @SerializedName("Person")
    @JsonProperty("Person")
    @Nullable
    @ODataField(odataName = "Person")
    private String personNumber;
    /**
     * Use with available fluent helpers to apply the <b>Person</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> PERSON_NUMBER = new AddressIndependentFaxNumberField<String>("Person");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @return
     *     Sequence Number
     */
    @Key
    @SerializedName("OrdinalNumber")
    @JsonProperty("OrdinalNumber")
    @Nullable
    @ODataField(odataName = "OrdinalNumber")
    private String sequenceNumber;
    /**
     * Use with available fluent helpers to apply the <b>OrdinalNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> SEQUENCE_NUMBER = new AddressIndependentFaxNumberField<String>("OrdinalNumber");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @return
     *     Country/Region for Telephone/Fax Number
     */
    @SerializedName("FaxCountry")
    @JsonProperty("FaxCountry")
    @Nullable
    @ODataField(odataName = "FaxCountry")
    private String countryRegion;
    /**
     * Use with available fluent helpers to apply the <b>FaxCountry</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> COUNTRY_REGION = new AddressIndependentFaxNumberField<String>("FaxCountry");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxAreaCodeSubscriberNumber</b></p>
     * 
     * @return
     *     Fax Number: Dialing Code and Number
     */
    @SerializedName("FaxAreaCodeSubscriberNumber")
    @JsonProperty("FaxAreaCodeSubscriberNumber")
    @Nullable
    @ODataField(odataName = "FaxAreaCodeSubscriberNumber")
    private String fax;
    /**
     * Use with available fluent helpers to apply the <b>FaxAreaCodeSubscriberNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> FAX = new AddressIndependentFaxNumberField<String>("FaxAreaCodeSubscriberNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @return
     *     Fax no.: Extension
     */
    @SerializedName("FaxNumberExtension")
    @JsonProperty("FaxNumberExtension")
    @Nullable
    @ODataField(odataName = "FaxNumberExtension")
    private String extension;
    /**
     * Use with available fluent helpers to apply the <b>FaxNumberExtension</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> EXTENSION = new AddressIndependentFaxNumberField<String>("FaxNumberExtension");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @return
     *     Complete Number: Dialing Code+Number+Extension
     */
    @SerializedName("InternationalFaxNumber")
    @JsonProperty("InternationalFaxNumber")
    @Nullable
    @ODataField(odataName = "InternationalFaxNumber")
    private String faxNumber;
    /**
     * Use with available fluent helpers to apply the <b>InternationalFaxNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<String> FAX_NUMBER = new AddressIndependentFaxNumberField<String>("InternationalFaxNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @return
     *     Indicator : Current Default Fax Number
     */
    @SerializedName("IsDefaultFaxNumber")
    @JsonProperty("IsDefaultFaxNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultFaxNumber")
    private Boolean faxIsCurDflt;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultFaxNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<Boolean> FAX_IS_CUR_DFLT = new AddressIndependentFaxNumberField<Boolean>("IsDefaultFaxNumber");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @return
     *     The validityEndDate contained in this entity.
     */
    @SerializedName("ValidityEndDate")
    @JsonProperty("ValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime validityEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityEndDate</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<LocalDateTime> VALIDITY_END_DATE = new AddressIndependentFaxNumberField<LocalDateTime>("ValidityEndDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @return
     *     The validityStartDate contained in this entity.
     */
    @SerializedName("ValidityStartDate")
    @JsonProperty("ValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime validityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDate</b> field to query operations.
     * 
     */
    public final static AddressIndependentFaxNumberField<LocalDateTime> VALIDITY_START_DATE = new AddressIndependentFaxNumberField<LocalDateTime>("ValidityStartDate");

    @Nonnull
    @Override
    public Class<AddressIndependentFaxNumber> getType() {
        return AddressIndependentFaxNumber.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param personNumber
     *     Person Number
     */
    public void setPersonNumber(
        @Nullable
        final String personNumber) {
        rememberChangedField("Person", this.personNumber);
        this.personNumber = personNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @param sequenceNumber
     *     Sequence Number
     */
    public void setSequenceNumber(
        @Nullable
        final String sequenceNumber) {
        rememberChangedField("OrdinalNumber", this.sequenceNumber);
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @param countryRegion
     *     Country/Region for Telephone/Fax Number
     */
    public void setCountryRegion(
        @Nullable
        final String countryRegion) {
        rememberChangedField("FaxCountry", this.countryRegion);
        this.countryRegion = countryRegion;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxAreaCodeSubscriberNumber</b></p>
     * 
     * @param fax
     *     Fax Number: Dialing Code and Number
     */
    public void setFax(
        @Nullable
        final String fax) {
        rememberChangedField("FaxAreaCodeSubscriberNumber", this.fax);
        this.fax = fax;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @param extension
     *     Fax no.: Extension
     */
    public void setExtension(
        @Nullable
        final String extension) {
        rememberChangedField("FaxNumberExtension", this.extension);
        this.extension = extension;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @param faxNumber
     *     Complete Number: Dialing Code+Number+Extension
     */
    public void setFaxNumber(
        @Nullable
        final String faxNumber) {
        rememberChangedField("InternationalFaxNumber", this.faxNumber);
        this.faxNumber = faxNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @param faxIsCurDflt
     *     Indicator : Current Default Fax Number
     */
    public void setFaxIsCurDflt(
        @Nullable
        final Boolean faxIsCurDflt) {
        rememberChangedField("IsDefaultFaxNumber", this.faxIsCurDflt);
        this.faxIsCurDflt = faxIsCurDflt;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     The validityEndDate to set.
     */
    public void setValidityEndDate(
        @Nullable
        final LocalDateTime validityEndDate) {
        rememberChangedField("ValidityEndDate", this.validityEndDate);
        this.validityEndDate = validityEndDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     The validityStartDate to set.
     */
    public void setValidityStartDate(
        @Nullable
        final LocalDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPAddressIndependentFax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("AddressID", getAddressNumber());
        result.put("Person", getPersonNumber());
        result.put("OrdinalNumber", getSequenceNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("AddressID", getAddressNumber());
        values.put("Person", getPersonNumber());
        values.put("OrdinalNumber", getSequenceNumber());
        values.put("FaxCountry", getCountryRegion());
        values.put("FaxAreaCodeSubscriberNumber", getFax());
        values.put("FaxNumberExtension", getExtension());
        values.put("InternationalFaxNumber", getFaxNumber());
        values.put("IsDefaultFaxNumber", getFaxIsCurDflt());
        values.put("ValidityEndDate", getValidityEndDate());
        values.put("ValidityStartDate", getValidityStartDate());
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
            if (values.containsKey("Person")) {
                final Object value = values.remove("Person");
                if ((value == null)||(!value.equals(getPersonNumber()))) {
                    setPersonNumber(((String) value));
                }
            }
            if (values.containsKey("OrdinalNumber")) {
                final Object value = values.remove("OrdinalNumber");
                if ((value == null)||(!value.equals(getSequenceNumber()))) {
                    setSequenceNumber(((String) value));
                }
            }
            if (values.containsKey("FaxCountry")) {
                final Object value = values.remove("FaxCountry");
                if ((value == null)||(!value.equals(getCountryRegion()))) {
                    setCountryRegion(((String) value));
                }
            }
            if (values.containsKey("FaxAreaCodeSubscriberNumber")) {
                final Object value = values.remove("FaxAreaCodeSubscriberNumber");
                if ((value == null)||(!value.equals(getFax()))) {
                    setFax(((String) value));
                }
            }
            if (values.containsKey("FaxNumberExtension")) {
                final Object value = values.remove("FaxNumberExtension");
                if ((value == null)||(!value.equals(getExtension()))) {
                    setExtension(((String) value));
                }
            }
            if (values.containsKey("InternationalFaxNumber")) {
                final Object value = values.remove("InternationalFaxNumber");
                if ((value == null)||(!value.equals(getFaxNumber()))) {
                    setFaxNumber(((String) value));
                }
            }
            if (values.containsKey("IsDefaultFaxNumber")) {
                final Object value = values.remove("IsDefaultFaxNumber");
                if ((value == null)||(!value.equals(getFaxIsCurDflt()))) {
                    setFaxIsCurDflt(((Boolean) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((LocalDateTime) value));
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
    public static<T >AddressIndependentFaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressIndependentFaxNumberField<T>(fieldName);
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
    public static<T,DomainT >AddressIndependentFaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressIndependentFaxNumberField<T>(fieldName, typeConverter);
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
