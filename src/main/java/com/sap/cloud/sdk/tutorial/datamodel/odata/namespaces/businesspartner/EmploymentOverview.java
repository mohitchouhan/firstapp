
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.EmploymentOverviewField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.EmploymentOverviewSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Employment Overview<p></p><p>Original entity name from the Odata EDM: <b>A_BPEmploymentType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EmploymentOverview
    extends VdmEntity<EmploymentOverview>
{

    /**
     * Selector for all available fields of EmploymentOverview.
     * 
     */
    public final static EmploymentOverviewSelectable ALL_FIELDS = () -> "*";
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
    public final static EmploymentOverviewField<String> BUSINESS_PARTNER = new EmploymentOverviewField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentStartDate</b></p>
     * 
     * @return
     *     Employed from
     */
    @Key
    @SerializedName("BPEmploymentStartDate")
    @JsonProperty("BPEmploymentStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPEmploymentStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime employedFrom;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentStartDate</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<LocalDateTime> EMPLOYED_FROM = new EmploymentOverviewField<LocalDateTime>("BPEmploymentStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentEndDate</b></p>
     * 
     * @return
     *     Employed Until
     */
    @SerializedName("BPEmploymentEndDate")
    @JsonProperty("BPEmploymentEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPEmploymentEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime employedUntil;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentEndDate</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<LocalDateTime> EMPLOYED_UNTIL = new EmploymentOverviewField<LocalDateTime>("BPEmploymentEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BPEmploymentStatus</b></p>
     * 
     * @return
     *     Employment Status
     */
    @SerializedName("BPEmploymentStatus")
    @JsonProperty("BPEmploymentStatus")
    @Nullable
    @ODataField(odataName = "BPEmploymentStatus")
    private String employmentStatus;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentStatus</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<String> EMPLOYMENT_STATUS = new EmploymentOverviewField<String>("BPEmploymentStatus");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusPartEmplrIndstryCode</b></p>
     * 
     * @return
     *     Industry
     */
    @SerializedName("BusPartEmplrIndstryCode")
    @JsonProperty("BusPartEmplrIndstryCode")
    @Nullable
    @ODataField(odataName = "BusPartEmplrIndstryCode")
    private String industry;
    /**
     * Use with available fluent helpers to apply the <b>BusPartEmplrIndstryCode</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<String> INDUSTRY = new EmploymentOverviewField<String>("BusPartEmplrIndstryCode");
    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>BusinessPartnerEmployerName</b></p>
     * 
     * @return
     *     Name of Employer of a Natural Person
     */
    @SerializedName("BusinessPartnerEmployerName")
    @JsonProperty("BusinessPartnerEmployerName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerEmployerName")
    private String employer;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerEmployerName</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<String> EMPLOYER = new EmploymentOverviewField<String>("BusinessPartnerEmployerName");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerOccupationGroup</b></p>
     * 
     * @return
     *     Occupation/group
     */
    @SerializedName("BusinessPartnerOccupationGroup")
    @JsonProperty("BusinessPartnerOccupationGroup")
    @Nullable
    @ODataField(odataName = "BusinessPartnerOccupationGroup")
    private String occupation;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerOccupationGroup</b> field to query operations.
     * 
     */
    public final static EmploymentOverviewField<String> OCCUPATION = new EmploymentOverviewField<String>("BusinessPartnerOccupationGroup");

    @Nonnull
    @Override
    public Class<EmploymentOverview> getType() {
        return EmploymentOverview.class;
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
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentStartDate</b></p>
     * 
     * @param employedFrom
     *     Employed from
     */
    public void setEmployedFrom(
        @Nullable
        final LocalDateTime employedFrom) {
        rememberChangedField("BPEmploymentStartDate", this.employedFrom);
        this.employedFrom = employedFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentEndDate</b></p>
     * 
     * @param employedUntil
     *     Employed Until
     */
    public void setEmployedUntil(
        @Nullable
        final LocalDateTime employedUntil) {
        rememberChangedField("BPEmploymentEndDate", this.employedUntil);
        this.employedUntil = employedUntil;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BPEmploymentStatus</b></p>
     * 
     * @param employmentStatus
     *     Employment Status
     */
    public void setEmploymentStatus(
        @Nullable
        final String employmentStatus) {
        rememberChangedField("BPEmploymentStatus", this.employmentStatus);
        this.employmentStatus = employmentStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusPartEmplrIndstryCode</b></p>
     * 
     * @param industry
     *     Industry
     */
    public void setIndustry(
        @Nullable
        final String industry) {
        rememberChangedField("BusPartEmplrIndstryCode", this.industry);
        this.industry = industry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>BusinessPartnerEmployerName</b></p>
     * 
     * @param employer
     *     Name of Employer of a Natural Person
     */
    public void setEmployer(
        @Nullable
        final String employer) {
        rememberChangedField("BusinessPartnerEmployerName", this.employer);
        this.employer = employer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerOccupationGroup</b></p>
     * 
     * @param occupation
     *     Occupation/group
     */
    public void setOccupation(
        @Nullable
        final String occupation) {
        rememberChangedField("BusinessPartnerOccupationGroup", this.occupation);
        this.occupation = occupation;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPEmployment";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPEmploymentStartDate", getEmployedFrom());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPEmploymentStartDate", getEmployedFrom());
        values.put("BPEmploymentEndDate", getEmployedUntil());
        values.put("BPEmploymentStatus", getEmploymentStatus());
        values.put("BusPartEmplrIndstryCode", getIndustry());
        values.put("BusinessPartnerEmployerName", getEmployer());
        values.put("BusinessPartnerOccupationGroup", getOccupation());
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
            if (values.containsKey("BPEmploymentStartDate")) {
                final Object value = values.remove("BPEmploymentStartDate");
                if ((value == null)||(!value.equals(getEmployedFrom()))) {
                    setEmployedFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPEmploymentEndDate")) {
                final Object value = values.remove("BPEmploymentEndDate");
                if ((value == null)||(!value.equals(getEmployedUntil()))) {
                    setEmployedUntil(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPEmploymentStatus")) {
                final Object value = values.remove("BPEmploymentStatus");
                if ((value == null)||(!value.equals(getEmploymentStatus()))) {
                    setEmploymentStatus(((String) value));
                }
            }
            if (values.containsKey("BusPartEmplrIndstryCode")) {
                final Object value = values.remove("BusPartEmplrIndstryCode");
                if ((value == null)||(!value.equals(getIndustry()))) {
                    setIndustry(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerEmployerName")) {
                final Object value = values.remove("BusinessPartnerEmployerName");
                if ((value == null)||(!value.equals(getEmployer()))) {
                    setEmployer(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerOccupationGroup")) {
                final Object value = values.remove("BusinessPartnerOccupationGroup");
                if ((value == null)||(!value.equals(getOccupation()))) {
                    setOccupation(((String) value));
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
    public static<T >EmploymentOverviewField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new EmploymentOverviewField<T>(fieldName);
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
    public static<T,DomainT >EmploymentOverviewField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new EmploymentOverviewField<T>(fieldName, typeConverter);
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
