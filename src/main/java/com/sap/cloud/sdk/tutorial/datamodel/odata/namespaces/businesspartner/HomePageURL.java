
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.HomePageURLField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.HomePageURLSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Home Page URL<p></p><p>Original entity name from the Odata EDM: <b>A_AddressHomePageURLType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class HomePageURL
    extends VdmEntity<HomePageURL>
{

    /**
     * Selector for all available fields of HomePageURL.
     * 
     */
    public final static HomePageURLSelectable ALL_FIELDS = () -> "*";
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
    public final static HomePageURLField<String> ADDRESS_NUMBER = new HomePageURLField<String>("AddressID");
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
    public final static HomePageURLField<String> PERSON_NUMBER = new HomePageURLField<String>("Person");
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
    public final static HomePageURLField<String> SEQUENCE_NUMBER = new HomePageURLField<String>("OrdinalNumber");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @return
     *     Valid-from date - in current Release only 00010101 possible
     */
    @Key
    @SerializedName("ValidityStartDate")
    @JsonProperty("ValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime from;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDate</b> field to query operations.
     * 
     */
    public final static HomePageURLField<LocalDateTime> FROM = new HomePageURLField<LocalDateTime>("ValidityStartDate");
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @return
     *     Flag: this address is the default address
     */
    @Key
    @SerializedName("IsDefaultURLAddress")
    @JsonProperty("IsDefaultURLAddress")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultURLAddress")
    private Boolean standardAddr;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultURLAddress</b> field to query operations.
     * 
     */
    public final static HomePageURLField<Boolean> STANDARD_ADDR = new HomePageURLField<Boolean>("IsDefaultURLAddress");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>SearchURLAddress</b></p>
     * 
     * @return
     *     URI address search field
     */
    @SerializedName("SearchURLAddress")
    @JsonProperty("SearchURLAddress")
    @Nullable
    @ODataField(odataName = "SearchURLAddress")
    private String uRIAddress;
    /**
     * Use with available fluent helpers to apply the <b>SearchURLAddress</b> field to query operations.
     * 
     */
    public final static HomePageURLField<String> URI_ADDRESS = new HomePageURLField<String>("SearchURLAddress");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>AddressCommunicationRemarkText</b></p>
     * 
     * @return
     *     Communication link notes
     */
    @SerializedName("AddressCommunicationRemarkText")
    @JsonProperty("AddressCommunicationRemarkText")
    @Nullable
    @ODataField(odataName = "AddressCommunicationRemarkText")
    private String notes;
    /**
     * Use with available fluent helpers to apply the <b>AddressCommunicationRemarkText</b> field to query operations.
     * 
     */
    public final static HomePageURLField<String> NOTES = new HomePageURLField<String>("AddressCommunicationRemarkText");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @return
     *     URI field length
     */
    @SerializedName("URLFieldLength")
    @JsonProperty("URLFieldLength")
    @Nullable
    @ODataField(odataName = "URLFieldLength")
    private Short uRILength;
    /**
     * Use with available fluent helpers to apply the <b>URLFieldLength</b> field to query operations.
     * 
     */
    public final static HomePageURLField<Short> URI_LENGTH = new HomePageURLField<Short>("URLFieldLength");
    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @return
     *     Universal Resource Identifier (URI)
     */
    @SerializedName("WebsiteURL")
    @JsonProperty("WebsiteURL")
    @Nullable
    @ODataField(odataName = "WebsiteURL")
    private String uRI;
    /**
     * Use with available fluent helpers to apply the <b>WebsiteURL</b> field to query operations.
     * 
     */
    public final static HomePageURLField<String> URI = new HomePageURLField<String>("WebsiteURL");

    @Nonnull
    @Override
    public Class<HomePageURL> getType() {
        return HomePageURL.class;
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
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param from
     *     Valid-from date - in current Release only 00010101 possible
     */
    public void setFrom(
        @Nullable
        final LocalDateTime from) {
        rememberChangedField("ValidityStartDate", this.from);
        this.from = from;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @param standardAddr
     *     Flag: this address is the default address
     */
    public void setStandardAddr(
        @Nullable
        final Boolean standardAddr) {
        rememberChangedField("IsDefaultURLAddress", this.standardAddr);
        this.standardAddr = standardAddr;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>SearchURLAddress</b></p>
     * 
     * @param uRIAddress
     *     URI address search field
     */
    public void setURIAddress(
        @Nullable
        final String uRIAddress) {
        rememberChangedField("SearchURLAddress", this.uRIAddress);
        this.uRIAddress = uRIAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>AddressCommunicationRemarkText</b></p>
     * 
     * @param notes
     *     Communication link notes
     */
    public void setNotes(
        @Nullable
        final String notes) {
        rememberChangedField("AddressCommunicationRemarkText", this.notes);
        this.notes = notes;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @param uRILength
     *     URI field length
     */
    public void setURILength(
        @Nullable
        final Short uRILength) {
        rememberChangedField("URLFieldLength", this.uRILength);
        this.uRILength = uRILength;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @param uRI
     *     Universal Resource Identifier (URI)
     */
    public void setURI(
        @Nullable
        final String uRI) {
        rememberChangedField("WebsiteURL", this.uRI);
        this.uRI = uRI;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressHomePageURL";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("AddressID", getAddressNumber());
        result.put("Person", getPersonNumber());
        result.put("OrdinalNumber", getSequenceNumber());
        result.put("ValidityStartDate", getFrom());
        result.put("IsDefaultURLAddress", getStandardAddr());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("AddressID", getAddressNumber());
        values.put("Person", getPersonNumber());
        values.put("OrdinalNumber", getSequenceNumber());
        values.put("ValidityStartDate", getFrom());
        values.put("IsDefaultURLAddress", getStandardAddr());
        values.put("SearchURLAddress", getURIAddress());
        values.put("AddressCommunicationRemarkText", getNotes());
        values.put("URLFieldLength", getURILength());
        values.put("WebsiteURL", getURI());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
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
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getFrom()))) {
                    setFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("IsDefaultURLAddress")) {
                final Object value = values.remove("IsDefaultURLAddress");
                if ((value == null)||(!value.equals(getStandardAddr()))) {
                    setStandardAddr(((Boolean) value));
                }
            }
            if (values.containsKey("SearchURLAddress")) {
                final Object value = values.remove("SearchURLAddress");
                if ((value == null)||(!value.equals(getURIAddress()))) {
                    setURIAddress(((String) value));
                }
            }
            if (values.containsKey("AddressCommunicationRemarkText")) {
                final Object value = values.remove("AddressCommunicationRemarkText");
                if ((value == null)||(!value.equals(getNotes()))) {
                    setNotes(((String) value));
                }
            }
            if (values.containsKey("URLFieldLength")) {
                final Object value = values.remove("URLFieldLength");
                if ((value == null)||(!value.equals(getURILength()))) {
                    setURILength(((Short) value));
                }
            }
            if (values.containsKey("WebsiteURL")) {
                final Object value = values.remove("WebsiteURL");
                if ((value == null)||(!value.equals(getURI()))) {
                    setURI(((String) value));
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
    public static<T >HomePageURLField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new HomePageURLField<T>(fieldName);
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
    public static<T,DomainT >HomePageURLField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new HomePageURLField<T>(fieldName, typeConverter);
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
