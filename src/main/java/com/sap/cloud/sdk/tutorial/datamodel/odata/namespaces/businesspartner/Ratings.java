
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.RatingsField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.RatingsSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Ratings<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerRatingType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Ratings
    extends VdmEntity<Ratings>
{

    /**
     * Selector for all available fields of Ratings.
     * 
     */
    public final static RatingsSelectable ALL_FIELDS = () -> "*";
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
    public final static RatingsField<String> BUSINESS_PARTNER = new RatingsField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingProcedure</b></p>
     * 
     * @return
     *     Rating Procedure
     */
    @Key
    @SerializedName("BusinessPartnerRatingProcedure")
    @JsonProperty("BusinessPartnerRatingProcedure")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingProcedure")
    private String ratingProcedure;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingProcedure</b> field to query operations.
     * 
     */
    public final static RatingsField<String> RATING_PROCEDURE = new RatingsField<String>("BusinessPartnerRatingProcedure");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityEndDate</b></p>
     * 
     * @return
     *     Valid-to Date for Rating
     */
    @Key
    @SerializedName("BPRatingValidityEndDate")
    @JsonProperty("BPRatingValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime ratingValidTo;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingValidityEndDate</b> field to query operations.
     * 
     */
    public final static RatingsField<LocalDateTime> RATING_VALID_TO = new RatingsField<LocalDateTime>("BPRatingValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingGrade</b></p>
     * 
     * @return
     *     Rating
     */
    @SerializedName("BusinessPartnerRatingGrade")
    @JsonProperty("BusinessPartnerRatingGrade")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingGrade")
    private String rating;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingGrade</b> field to query operations.
     * 
     */
    public final static RatingsField<String> RATING = new RatingsField<String>("BusinessPartnerRatingGrade");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingTrend</b></p>
     * 
     * @return
     *     Trend
     */
    @SerializedName("BusinessPartnerRatingTrend")
    @JsonProperty("BusinessPartnerRatingTrend")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingTrend")
    private String trend;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingTrend</b> field to query operations.
     * 
     */
    public final static RatingsField<String> TREND = new RatingsField<String>("BusinessPartnerRatingTrend");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityStartDate</b></p>
     * 
     * @return
     *     Valid-from Date for Rating
     */
    @SerializedName("BPRatingValidityStartDate")
    @JsonProperty("BPRatingValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime ratingValidFrom;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingValidityStartDate</b> field to query operations.
     * 
     */
    public final static RatingsField<LocalDateTime> RATING_VALID_FROM = new RatingsField<LocalDateTime>("BPRatingValidityStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingCreationDate</b></p>
     * 
     * @return
     *     Entered-on Date for Rating
     */
    @SerializedName("BPRatingCreationDate")
    @JsonProperty("BPRatingCreationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingCreationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime ratedOn;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingCreationDate</b> field to query operations.
     * 
     */
    public final static RatingsField<LocalDateTime> RATED_ON = new RatingsField<LocalDateTime>("BPRatingCreationDate");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingComment</b></p>
     * 
     * @return
     *     Text for Ratings
     */
    @SerializedName("BusinessPartnerRatingComment")
    @JsonProperty("BusinessPartnerRatingComment")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingComment")
    private String text;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingComment</b> field to query operations.
     * 
     */
    public final static RatingsField<String> TEXT = new RatingsField<String>("BusinessPartnerRatingComment");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsAllowed</b></p>
     * 
     * @return
     *     Rating Allowed
     */
    @SerializedName("BusinessPartnerRatingIsAllowed")
    @JsonProperty("BusinessPartnerRatingIsAllowed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingIsAllowed")
    private Boolean ratingAllowed;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingIsAllowed</b> field to query operations.
     * 
     */
    public final static RatingsField<Boolean> RATING_ALLOWED = new RatingsField<Boolean>("BusinessPartnerRatingIsAllowed");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BPRatingIsValidOnKeyDate</b></p>
     * 
     * @return
     *     Business Partner Rating is valid on Key Date
     */
    @SerializedName("BPRatingIsValidOnKeyDate")
    @JsonProperty("BPRatingIsValidOnKeyDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BPRatingIsValidOnKeyDate")
    private Boolean ratingValid;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingIsValidOnKeyDate</b> field to query operations.
     * 
     */
    public final static RatingsField<Boolean> RATING_VALID = new RatingsField<Boolean>("BPRatingIsValidOnKeyDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingKeyDate</b></p>
     * 
     * @return
     *     Key Date of Accessing Business Partner Rating Data
     */
    @SerializedName("BusinessPartnerRatingKeyDate")
    @JsonProperty("BusinessPartnerRatingKeyDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingKeyDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime accessDate;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingKeyDate</b> field to query operations.
     * 
     */
    public final static RatingsField<LocalDateTime> ACCESS_DATE = new RatingsField<LocalDateTime>("BusinessPartnerRatingKeyDate");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsExpired</b></p>
     * 
     * @return
     *     Rating Validity is Expired according to Permitted Period
     */
    @SerializedName("BusinessPartnerRatingIsExpired")
    @JsonProperty("BusinessPartnerRatingIsExpired")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingIsExpired")
    private Boolean ratingIsExpired;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingIsExpired</b> field to query operations.
     * 
     */
    public final static RatingsField<Boolean> RATING_IS_EXPIRED = new RatingsField<Boolean>("BusinessPartnerRatingIsExpired");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>BPRatingLongComment</b></p>
     * 
     * @return
     *     Longtext for Rating
     */
    @SerializedName("BPRatingLongComment")
    @JsonProperty("BPRatingLongComment")
    @Nullable
    @ODataField(odataName = "BPRatingLongComment")
    private String longtextRating;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingLongComment</b> field to query operations.
     * 
     */
    public final static RatingsField<String> LONGTEXT_RATING = new RatingsField<String>("BPRatingLongComment");

    @Nonnull
    @Override
    public Class<Ratings> getType() {
        return Ratings.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingProcedure</b></p>
     * 
     * @param ratingProcedure
     *     Rating Procedure
     */
    public void setRatingProcedure(
        @Nullable
        final String ratingProcedure) {
        rememberChangedField("BusinessPartnerRatingProcedure", this.ratingProcedure);
        this.ratingProcedure = ratingProcedure;
    }

    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityEndDate</b></p>
     * 
     * @param ratingValidTo
     *     Valid-to Date for Rating
     */
    public void setRatingValidTo(
        @Nullable
        final LocalDateTime ratingValidTo) {
        rememberChangedField("BPRatingValidityEndDate", this.ratingValidTo);
        this.ratingValidTo = ratingValidTo;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingGrade</b></p>
     * 
     * @param rating
     *     Rating
     */
    public void setRating(
        @Nullable
        final String rating) {
        rememberChangedField("BusinessPartnerRatingGrade", this.rating);
        this.rating = rating;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingTrend</b></p>
     * 
     * @param trend
     *     Trend
     */
    public void setTrend(
        @Nullable
        final String trend) {
        rememberChangedField("BusinessPartnerRatingTrend", this.trend);
        this.trend = trend;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityStartDate</b></p>
     * 
     * @param ratingValidFrom
     *     Valid-from Date for Rating
     */
    public void setRatingValidFrom(
        @Nullable
        final LocalDateTime ratingValidFrom) {
        rememberChangedField("BPRatingValidityStartDate", this.ratingValidFrom);
        this.ratingValidFrom = ratingValidFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingCreationDate</b></p>
     * 
     * @param ratedOn
     *     Entered-on Date for Rating
     */
    public void setRatedOn(
        @Nullable
        final LocalDateTime ratedOn) {
        rememberChangedField("BPRatingCreationDate", this.ratedOn);
        this.ratedOn = ratedOn;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingComment</b></p>
     * 
     * @param text
     *     Text for Ratings
     */
    public void setText(
        @Nullable
        final String text) {
        rememberChangedField("BusinessPartnerRatingComment", this.text);
        this.text = text;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsAllowed</b></p>
     * 
     * @param ratingAllowed
     *     Rating Allowed
     */
    public void setRatingAllowed(
        @Nullable
        final Boolean ratingAllowed) {
        rememberChangedField("BusinessPartnerRatingIsAllowed", this.ratingAllowed);
        this.ratingAllowed = ratingAllowed;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BPRatingIsValidOnKeyDate</b></p>
     * 
     * @param ratingValid
     *     Business Partner Rating is valid on Key Date
     */
    public void setRatingValid(
        @Nullable
        final Boolean ratingValid) {
        rememberChangedField("BPRatingIsValidOnKeyDate", this.ratingValid);
        this.ratingValid = ratingValid;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingKeyDate</b></p>
     * 
     * @param accessDate
     *     Key Date of Accessing Business Partner Rating Data
     */
    public void setAccessDate(
        @Nullable
        final LocalDateTime accessDate) {
        rememberChangedField("BusinessPartnerRatingKeyDate", this.accessDate);
        this.accessDate = accessDate;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsExpired</b></p>
     * 
     * @param ratingIsExpired
     *     Rating Validity is Expired according to Permitted Period
     */
    public void setRatingIsExpired(
        @Nullable
        final Boolean ratingIsExpired) {
        rememberChangedField("BusinessPartnerRatingIsExpired", this.ratingIsExpired);
        this.ratingIsExpired = ratingIsExpired;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>BPRatingLongComment</b></p>
     * 
     * @param longtextRating
     *     Longtext for Rating
     */
    public void setLongtextRating(
        @Nullable
        final String longtextRating) {
        rememberChangedField("BPRatingLongComment", this.longtextRating);
        this.longtextRating = longtextRating;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerRating";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BusinessPartnerRatingProcedure", getRatingProcedure());
        result.put("BPRatingValidityEndDate", getRatingValidTo());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BusinessPartnerRatingProcedure", getRatingProcedure());
        values.put("BPRatingValidityEndDate", getRatingValidTo());
        values.put("BusinessPartnerRatingGrade", getRating());
        values.put("BusinessPartnerRatingTrend", getTrend());
        values.put("BPRatingValidityStartDate", getRatingValidFrom());
        values.put("BPRatingCreationDate", getRatedOn());
        values.put("BusinessPartnerRatingComment", getText());
        values.put("BusinessPartnerRatingIsAllowed", getRatingAllowed());
        values.put("BPRatingIsValidOnKeyDate", getRatingValid());
        values.put("BusinessPartnerRatingKeyDate", getAccessDate());
        values.put("BusinessPartnerRatingIsExpired", getRatingIsExpired());
        values.put("BPRatingLongComment", getLongtextRating());
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
            if (values.containsKey("BusinessPartnerRatingProcedure")) {
                final Object value = values.remove("BusinessPartnerRatingProcedure");
                if ((value == null)||(!value.equals(getRatingProcedure()))) {
                    setRatingProcedure(((String) value));
                }
            }
            if (values.containsKey("BPRatingValidityEndDate")) {
                final Object value = values.remove("BPRatingValidityEndDate");
                if ((value == null)||(!value.equals(getRatingValidTo()))) {
                    setRatingValidTo(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingGrade")) {
                final Object value = values.remove("BusinessPartnerRatingGrade");
                if ((value == null)||(!value.equals(getRating()))) {
                    setRating(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingTrend")) {
                final Object value = values.remove("BusinessPartnerRatingTrend");
                if ((value == null)||(!value.equals(getTrend()))) {
                    setTrend(((String) value));
                }
            }
            if (values.containsKey("BPRatingValidityStartDate")) {
                final Object value = values.remove("BPRatingValidityStartDate");
                if ((value == null)||(!value.equals(getRatingValidFrom()))) {
                    setRatingValidFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPRatingCreationDate")) {
                final Object value = values.remove("BPRatingCreationDate");
                if ((value == null)||(!value.equals(getRatedOn()))) {
                    setRatedOn(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingComment")) {
                final Object value = values.remove("BusinessPartnerRatingComment");
                if ((value == null)||(!value.equals(getText()))) {
                    setText(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingIsAllowed")) {
                final Object value = values.remove("BusinessPartnerRatingIsAllowed");
                if ((value == null)||(!value.equals(getRatingAllowed()))) {
                    setRatingAllowed(((Boolean) value));
                }
            }
            if (values.containsKey("BPRatingIsValidOnKeyDate")) {
                final Object value = values.remove("BPRatingIsValidOnKeyDate");
                if ((value == null)||(!value.equals(getRatingValid()))) {
                    setRatingValid(((Boolean) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingKeyDate")) {
                final Object value = values.remove("BusinessPartnerRatingKeyDate");
                if ((value == null)||(!value.equals(getAccessDate()))) {
                    setAccessDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingIsExpired")) {
                final Object value = values.remove("BusinessPartnerRatingIsExpired");
                if ((value == null)||(!value.equals(getRatingIsExpired()))) {
                    setRatingIsExpired(((Boolean) value));
                }
            }
            if (values.containsKey("BPRatingLongComment")) {
                final Object value = values.remove("BPRatingLongComment");
                if ((value == null)||(!value.equals(getLongtextRating()))) {
                    setLongtextRating(((String) value));
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
    public static<T >RatingsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new RatingsField<T>(fieldName);
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
    public static<T,DomainT >RatingsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new RatingsField<T>(fieldName, typeConverter);
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
