
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BusinessPartnerPaymentCardField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerPaymentCardSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Business Partner Payment Card<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerPaymentCardType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerPaymentCard
    extends VdmEntity<BusinessPartnerPaymentCard>
{

    /**
     * Selector for all available fields of BusinessPartnerPaymentCard.
     * 
     */
    public final static BusinessPartnerPaymentCardSelectable ALL_FIELDS = () -> "*";
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
    public final static BusinessPartnerPaymentCardField<String> BUSINESS_PARTNER = new BusinessPartnerPaymentCardField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>PaymentCardID</b></p>
     * 
     * @return
     *     Payment Card ID
     */
    @Key
    @SerializedName("PaymentCardID")
    @JsonProperty("PaymentCardID")
    @Nullable
    @ODataField(odataName = "PaymentCardID")
    private String paymentCardID;
    /**
     * Use with available fluent helpers to apply the <b>PaymentCardID</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> PAYMENT_CARD_ID = new BusinessPartnerPaymentCardField<String>("PaymentCardID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PaymentCardType</b></p>
     * 
     * @return
     *     Payment Card Type
     */
    @Key
    @SerializedName("PaymentCardType")
    @JsonProperty("PaymentCardType")
    @Nullable
    @ODataField(odataName = "PaymentCardType")
    private String paymentCardType;
    /**
     * Use with available fluent helpers to apply the <b>PaymentCardType</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> PAYMENT_CARD_TYPE = new BusinessPartnerPaymentCardField<String>("PaymentCardType");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>CardNumber</b></p>
     * 
     * @return
     *     Payment Cards: Card Number
     */
    @Key
    @SerializedName("CardNumber")
    @JsonProperty("CardNumber")
    @Nullable
    @ODataField(odataName = "CardNumber")
    private String cardNumber;
    /**
     * Use with available fluent helpers to apply the <b>CardNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> CARD_NUMBER = new BusinessPartnerPaymentCardField<String>("CardNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsStandardCard</b></p>
     * 
     * @return
     *     BP: Standard Payment Card
     */
    @SerializedName("IsStandardCard")
    @JsonProperty("IsStandardCard")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsStandardCard")
    private Boolean standardCard;
    /**
     * Use with available fluent helpers to apply the <b>IsStandardCard</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<Boolean> STANDARD_CARD = new BusinessPartnerPaymentCardField<Boolean>("IsStandardCard");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardDescription</b></p>
     * 
     * @return
     *     Description of Credit Card Details
     */
    @SerializedName("CardDescription")
    @JsonProperty("CardDescription")
    @Nullable
    @ODataField(odataName = "CardDescription")
    private String description;
    /**
     * Use with available fluent helpers to apply the <b>CardDescription</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> DESCRIPTION = new BusinessPartnerPaymentCardField<String>("CardDescription");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityDate</b></p>
     * 
     * @return
     *     Payment cards: Valid from
     */
    @SerializedName("ValidityDate")
    @JsonProperty("ValidityDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime cardValidFrom;
    /**
     * Use with available fluent helpers to apply the <b>ValidityDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<LocalDateTime> CARD_VALID_FROM = new BusinessPartnerPaymentCardField<LocalDateTime>("ValidityDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @return
     *     Payment Cards: Valid To
     */
    @SerializedName("ValidityEndDate")
    @JsonProperty("ValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime cardValidTo;
    /**
     * Use with available fluent helpers to apply the <b>ValidityEndDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<LocalDateTime> CARD_VALID_TO = new BusinessPartnerPaymentCardField<LocalDateTime>("ValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardHolder</b></p>
     * 
     * @return
     *     Payment Cards: Name of Cardholder
     */
    @SerializedName("CardHolder")
    @JsonProperty("CardHolder")
    @Nullable
    @ODataField(odataName = "CardHolder")
    private String cardHolder;
    /**
     * Use with available fluent helpers to apply the <b>CardHolder</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> CARD_HOLDER = new BusinessPartnerPaymentCardField<String>("CardHolder");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardIssuingBank</b></p>
     * 
     * @return
     *     Payment cards: Issuing bank
     */
    @SerializedName("CardIssuingBank")
    @JsonProperty("CardIssuingBank")
    @Nullable
    @ODataField(odataName = "CardIssuingBank")
    private String issuingBank;
    /**
     * Use with available fluent helpers to apply the <b>CardIssuingBank</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> ISSUING_BANK = new BusinessPartnerPaymentCardField<String>("CardIssuingBank");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CardIssueDate</b></p>
     * 
     * @return
     *     Payment Cards: Date of Issue
     */
    @SerializedName("CardIssueDate")
    @JsonProperty("CardIssueDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CardIssueDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime issuedOn;
    /**
     * Use with available fluent helpers to apply the <b>CardIssueDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<LocalDateTime> ISSUED_ON = new BusinessPartnerPaymentCardField<LocalDateTime>("CardIssueDate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PaymentCardLock</b></p>
     * 
     * @return
     *     Payment Cards: Reason for Payment Card Lock
     */
    @SerializedName("PaymentCardLock")
    @JsonProperty("PaymentCardLock")
    @Nullable
    @ODataField(odataName = "PaymentCardLock")
    private String paymentCardLock;
    /**
     * Use with available fluent helpers to apply the <b>PaymentCardLock</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> PAYMENT_CARD_LOCK = new BusinessPartnerPaymentCardField<String>("PaymentCardLock");
    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>MaskedCardNumber</b></p>
     * 
     * @return
     *     Masked Payment Card Number ( Digital Payment )
     */
    @SerializedName("MaskedCardNumber")
    @JsonProperty("MaskedCardNumber")
    @Nullable
    @ODataField(odataName = "MaskedCardNumber")
    private String cardNumber_2;
    /**
     * Use with available fluent helpers to apply the <b>MaskedCardNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerPaymentCardField<String> CARD_NUMBER_2 = new BusinessPartnerPaymentCardField<String>("MaskedCardNumber");

    @Nonnull
    @Override
    public Class<BusinessPartnerPaymentCard> getType() {
        return BusinessPartnerPaymentCard.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>PaymentCardID</b></p>
     * 
     * @param paymentCardID
     *     Payment Card ID
     */
    public void setPaymentCardID(
        @Nullable
        final String paymentCardID) {
        rememberChangedField("PaymentCardID", this.paymentCardID);
        this.paymentCardID = paymentCardID;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PaymentCardType</b></p>
     * 
     * @param paymentCardType
     *     Payment Card Type
     */
    public void setPaymentCardType(
        @Nullable
        final String paymentCardType) {
        rememberChangedField("PaymentCardType", this.paymentCardType);
        this.paymentCardType = paymentCardType;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>CardNumber</b></p>
     * 
     * @param cardNumber
     *     Payment Cards: Card Number
     */
    public void setCardNumber(
        @Nullable
        final String cardNumber) {
        rememberChangedField("CardNumber", this.cardNumber);
        this.cardNumber = cardNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsStandardCard</b></p>
     * 
     * @param standardCard
     *     BP: Standard Payment Card
     */
    public void setStandardCard(
        @Nullable
        final Boolean standardCard) {
        rememberChangedField("IsStandardCard", this.standardCard);
        this.standardCard = standardCard;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardDescription</b></p>
     * 
     * @param description
     *     Description of Credit Card Details
     */
    public void setDescription(
        @Nullable
        final String description) {
        rememberChangedField("CardDescription", this.description);
        this.description = description;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityDate</b></p>
     * 
     * @param cardValidFrom
     *     Payment cards: Valid from
     */
    public void setCardValidFrom(
        @Nullable
        final LocalDateTime cardValidFrom) {
        rememberChangedField("ValidityDate", this.cardValidFrom);
        this.cardValidFrom = cardValidFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param cardValidTo
     *     Payment Cards: Valid To
     */
    public void setCardValidTo(
        @Nullable
        final LocalDateTime cardValidTo) {
        rememberChangedField("ValidityEndDate", this.cardValidTo);
        this.cardValidTo = cardValidTo;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardHolder</b></p>
     * 
     * @param cardHolder
     *     Payment Cards: Name of Cardholder
     */
    public void setCardHolder(
        @Nullable
        final String cardHolder) {
        rememberChangedField("CardHolder", this.cardHolder);
        this.cardHolder = cardHolder;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CardIssuingBank</b></p>
     * 
     * @param issuingBank
     *     Payment cards: Issuing bank
     */
    public void setIssuingBank(
        @Nullable
        final String issuingBank) {
        rememberChangedField("CardIssuingBank", this.issuingBank);
        this.issuingBank = issuingBank;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CardIssueDate</b></p>
     * 
     * @param issuedOn
     *     Payment Cards: Date of Issue
     */
    public void setIssuedOn(
        @Nullable
        final LocalDateTime issuedOn) {
        rememberChangedField("CardIssueDate", this.issuedOn);
        this.issuedOn = issuedOn;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PaymentCardLock</b></p>
     * 
     * @param paymentCardLock
     *     Payment Cards: Reason for Payment Card Lock
     */
    public void setPaymentCardLock(
        @Nullable
        final String paymentCardLock) {
        rememberChangedField("PaymentCardLock", this.paymentCardLock);
        this.paymentCardLock = paymentCardLock;
    }

    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>MaskedCardNumber</b></p>
     * 
     * @param cardNumber_2
     *     Masked Payment Card Number ( Digital Payment )
     */
    public void setCardNumber_2(
        @Nullable
        final String cardNumber_2) {
        rememberChangedField("MaskedCardNumber", this.cardNumber_2);
        this.cardNumber_2 = cardNumber_2;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerPaymentCard";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("PaymentCardID", getPaymentCardID());
        result.put("PaymentCardType", getPaymentCardType());
        result.put("CardNumber", getCardNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("PaymentCardID", getPaymentCardID());
        values.put("PaymentCardType", getPaymentCardType());
        values.put("CardNumber", getCardNumber());
        values.put("IsStandardCard", getStandardCard());
        values.put("CardDescription", getDescription());
        values.put("ValidityDate", getCardValidFrom());
        values.put("ValidityEndDate", getCardValidTo());
        values.put("CardHolder", getCardHolder());
        values.put("CardIssuingBank", getIssuingBank());
        values.put("CardIssueDate", getIssuedOn());
        values.put("PaymentCardLock", getPaymentCardLock());
        values.put("MaskedCardNumber", getCardNumber_2());
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
            if (values.containsKey("PaymentCardID")) {
                final Object value = values.remove("PaymentCardID");
                if ((value == null)||(!value.equals(getPaymentCardID()))) {
                    setPaymentCardID(((String) value));
                }
            }
            if (values.containsKey("PaymentCardType")) {
                final Object value = values.remove("PaymentCardType");
                if ((value == null)||(!value.equals(getPaymentCardType()))) {
                    setPaymentCardType(((String) value));
                }
            }
            if (values.containsKey("CardNumber")) {
                final Object value = values.remove("CardNumber");
                if ((value == null)||(!value.equals(getCardNumber()))) {
                    setCardNumber(((String) value));
                }
            }
            if (values.containsKey("IsStandardCard")) {
                final Object value = values.remove("IsStandardCard");
                if ((value == null)||(!value.equals(getStandardCard()))) {
                    setStandardCard(((Boolean) value));
                }
            }
            if (values.containsKey("CardDescription")) {
                final Object value = values.remove("CardDescription");
                if ((value == null)||(!value.equals(getDescription()))) {
                    setDescription(((String) value));
                }
            }
            if (values.containsKey("ValidityDate")) {
                final Object value = values.remove("ValidityDate");
                if ((value == null)||(!value.equals(getCardValidFrom()))) {
                    setCardValidFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getCardValidTo()))) {
                    setCardValidTo(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CardHolder")) {
                final Object value = values.remove("CardHolder");
                if ((value == null)||(!value.equals(getCardHolder()))) {
                    setCardHolder(((String) value));
                }
            }
            if (values.containsKey("CardIssuingBank")) {
                final Object value = values.remove("CardIssuingBank");
                if ((value == null)||(!value.equals(getIssuingBank()))) {
                    setIssuingBank(((String) value));
                }
            }
            if (values.containsKey("CardIssueDate")) {
                final Object value = values.remove("CardIssueDate");
                if ((value == null)||(!value.equals(getIssuedOn()))) {
                    setIssuedOn(((LocalDateTime) value));
                }
            }
            if (values.containsKey("PaymentCardLock")) {
                final Object value = values.remove("PaymentCardLock");
                if ((value == null)||(!value.equals(getPaymentCardLock()))) {
                    setPaymentCardLock(((String) value));
                }
            }
            if (values.containsKey("MaskedCardNumber")) {
                final Object value = values.remove("MaskedCardNumber");
                if ((value == null)||(!value.equals(getCardNumber_2()))) {
                    setCardNumber_2(((String) value));
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
    public static<T >BusinessPartnerPaymentCardField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerPaymentCardField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerPaymentCardField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerPaymentCardField<T>(fieldName, typeConverter);
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
