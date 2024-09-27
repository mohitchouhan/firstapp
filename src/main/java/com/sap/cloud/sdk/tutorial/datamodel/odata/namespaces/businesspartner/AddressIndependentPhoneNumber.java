
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.AddressIndependentPhoneNumberField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.AddressIndependentPhoneNumberSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Address Independent Phone Number<p></p><p>Original entity name from the Odata EDM: <b>A_BPAddressIndependentPhoneType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressIndependentPhoneNumber
    extends VdmEntity<AddressIndependentPhoneNumber>
{

    /**
     * Selector for all available fields of AddressIndependentPhoneNumber.
     * 
     */
    public final static AddressIndependentPhoneNumberSelectable ALL_FIELDS = () -> "*";
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
    public final static AddressIndependentPhoneNumberField<String> BUSINESS_PARTNER = new AddressIndependentPhoneNumberField<String>("BusinessPartner");
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
    public final static AddressIndependentPhoneNumberField<String> ADDRESS_NUMBER = new AddressIndependentPhoneNumberField<String>("AddressID");
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
    public final static AddressIndependentPhoneNumberField<String> PERSON_NUMBER = new AddressIndependentPhoneNumberField<String>("Person");
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
    public final static AddressIndependentPhoneNumberField<String> SEQUENCE_NUMBER = new AddressIndependentPhoneNumberField<String>("OrdinalNumber");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DestinationLocationCountry</b></p>
     * 
     * @return
     *     Country/Region for Telephone/Fax Number
     */
    @SerializedName("DestinationLocationCountry")
    @JsonProperty("DestinationLocationCountry")
    @Nullable
    @ODataField(odataName = "DestinationLocationCountry")
    private String countryRegion;
    /**
     * Use with available fluent helpers to apply the <b>DestinationLocationCountry</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<String> COUNTRY_REGION = new AddressIndependentPhoneNumberField<String>("DestinationLocationCountry");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalPhoneNumber</b></p>
     * 
     * @return
     *     Complete Number: Dialing Code+Number+Extension
     */
    @SerializedName("InternationalPhoneNumber")
    @JsonProperty("InternationalPhoneNumber")
    @Nullable
    @ODataField(odataName = "InternationalPhoneNumber")
    private String telephoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>InternationalPhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<String> TELEPHONE_NUMBER = new AddressIndependentPhoneNumberField<String>("InternationalPhoneNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultPhoneNumber</b></p>
     * 
     * @return
     *     Data element for domain BOOLE: TRUE (='X') and FALSE (=' ')
     */
    @SerializedName("IsDefaultPhoneNumber")
    @JsonProperty("IsDefaultPhoneNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultPhoneNumber")
    private Boolean tRUEProperty;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultPhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<Boolean> TRUE_PROPERTY = new AddressIndependentPhoneNumberField<Boolean>("IsDefaultPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PhoneNumber</b></p>
     * 
     * @return
     *     Telephone No.: Dialing Code and Number
     */
    @SerializedName("PhoneNumber")
    @JsonProperty("PhoneNumber")
    @Nullable
    @ODataField(odataName = "PhoneNumber")
    private String telephone;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<String> TELEPHONE = new AddressIndependentPhoneNumberField<String>("PhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PhoneNumberExtension</b></p>
     * 
     * @return
     *     Telephone no.: Extension
     */
    @SerializedName("PhoneNumberExtension")
    @JsonProperty("PhoneNumberExtension")
    @Nullable
    @ODataField(odataName = "PhoneNumberExtension")
    private String extension;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumberExtension</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<String> EXTENSION = new AddressIndependentPhoneNumberField<String>("PhoneNumberExtension");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PhoneNumberType</b></p>
     * 
     * @return
     *     Phone Number Type
     */
    @SerializedName("PhoneNumberType")
    @JsonProperty("PhoneNumberType")
    @Nullable
    @ODataField(odataName = "PhoneNumberType")
    private String phoneNumberType;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumberType</b> field to query operations.
     * 
     */
    public final static AddressIndependentPhoneNumberField<String> PHONE_NUMBER_TYPE = new AddressIndependentPhoneNumberField<String>("PhoneNumberType");
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
    public final static AddressIndependentPhoneNumberField<LocalDateTime> VALIDITY_START_DATE = new AddressIndependentPhoneNumberField<LocalDateTime>("ValidityStartDate");
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
    public final static AddressIndependentPhoneNumberField<LocalDateTime> VALIDITY_END_DATE = new AddressIndependentPhoneNumberField<LocalDateTime>("ValidityEndDate");

    @Nonnull
    @Override
    public Class<AddressIndependentPhoneNumber> getType() {
        return AddressIndependentPhoneNumber.class;
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
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DestinationLocationCountry</b></p>
     * 
     * @param countryRegion
     *     Country/Region for Telephone/Fax Number
     */
    public void setCountryRegion(
        @Nullable
        final String countryRegion) {
        rememberChangedField("DestinationLocationCountry", this.countryRegion);
        this.countryRegion = countryRegion;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalPhoneNumber</b></p>
     * 
     * @param telephoneNumber
     *     Complete Number: Dialing Code+Number+Extension
     */
    public void setTelephoneNumber(
        @Nullable
        final String telephoneNumber) {
        rememberChangedField("InternationalPhoneNumber", this.telephoneNumber);
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultPhoneNumber</b></p>
     * 
     * @param tRUEProperty
     *     Data element for domain BOOLE: TRUE (='X') and FALSE (=' ')
     */
    public void setTRUEProperty(
        @Nullable
        final Boolean tRUEProperty) {
        rememberChangedField("IsDefaultPhoneNumber", this.tRUEProperty);
        this.tRUEProperty = tRUEProperty;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PhoneNumber</b></p>
     * 
     * @param telephone
     *     Telephone No.: Dialing Code and Number
     */
    public void setTelephone(
        @Nullable
        final String telephone) {
        rememberChangedField("PhoneNumber", this.telephone);
        this.telephone = telephone;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PhoneNumberExtension</b></p>
     * 
     * @param extension
     *     Telephone no.: Extension
     */
    public void setExtension(
        @Nullable
        final String extension) {
        rememberChangedField("PhoneNumberExtension", this.extension);
        this.extension = extension;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PhoneNumberType</b></p>
     * 
     * @param phoneNumberType
     *     Phone Number Type
     */
    public void setPhoneNumberType(
        @Nullable
        final String phoneNumberType) {
        rememberChangedField("PhoneNumberType", this.phoneNumberType);
        this.phoneNumberType = phoneNumberType;
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

    @Override
    protected String getEntityCollection() {
        return "A_BPAddressIndependentPhone";
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
        values.put("DestinationLocationCountry", getCountryRegion());
        values.put("InternationalPhoneNumber", getTelephoneNumber());
        values.put("IsDefaultPhoneNumber", getTRUEProperty());
        values.put("PhoneNumber", getTelephone());
        values.put("PhoneNumberExtension", getExtension());
        values.put("PhoneNumberType", getPhoneNumberType());
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("ValidityEndDate", getValidityEndDate());
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
            if (values.containsKey("DestinationLocationCountry")) {
                final Object value = values.remove("DestinationLocationCountry");
                if ((value == null)||(!value.equals(getCountryRegion()))) {
                    setCountryRegion(((String) value));
                }
            }
            if (values.containsKey("InternationalPhoneNumber")) {
                final Object value = values.remove("InternationalPhoneNumber");
                if ((value == null)||(!value.equals(getTelephoneNumber()))) {
                    setTelephoneNumber(((String) value));
                }
            }
            if (values.containsKey("IsDefaultPhoneNumber")) {
                final Object value = values.remove("IsDefaultPhoneNumber");
                if ((value == null)||(!value.equals(getTRUEProperty()))) {
                    setTRUEProperty(((Boolean) value));
                }
            }
            if (values.containsKey("PhoneNumber")) {
                final Object value = values.remove("PhoneNumber");
                if ((value == null)||(!value.equals(getTelephone()))) {
                    setTelephone(((String) value));
                }
            }
            if (values.containsKey("PhoneNumberExtension")) {
                final Object value = values.remove("PhoneNumberExtension");
                if ((value == null)||(!value.equals(getExtension()))) {
                    setExtension(((String) value));
                }
            }
            if (values.containsKey("PhoneNumberType")) {
                final Object value = values.remove("PhoneNumberType");
                if ((value == null)||(!value.equals(getPhoneNumberType()))) {
                    setPhoneNumberType(((String) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((LocalDateTime) value));
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
    public static<T >AddressIndependentPhoneNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressIndependentPhoneNumberField<T>(fieldName);
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
    public static<T,DomainT >AddressIndependentPhoneNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressIndependentPhoneNumberField<T>(fieldName, typeConverter);
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
