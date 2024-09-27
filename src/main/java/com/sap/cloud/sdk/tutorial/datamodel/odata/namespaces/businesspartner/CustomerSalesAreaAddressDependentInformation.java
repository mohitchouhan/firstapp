
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.0.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import java.util.UUID;
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.CustomerSalesAreaAddressDependentInformationField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.CustomerSalesAreaAddressDependentInformationSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Customer Sales Area Address Dependent Information<p></p><p>Original entity name from the Odata EDM: <b>A_CustSlsAreaAddrDepdntInfoType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerSalesAreaAddressDependentInformation
    extends VdmEntity<CustomerSalesAreaAddressDependentInformation>
{

    /**
     * Selector for all available fields of CustomerSalesAreaAddressDependentInformation.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @return
     *     Customer Number
     */
    @Key
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> CUSTOMER = new CustomerSalesAreaAddressDependentInformationField<String>("Customer");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOrganization</b></p>
     * 
     * @return
     *     Sales Organization
     */
    @Key
    @SerializedName("SalesOrganization")
    @JsonProperty("SalesOrganization")
    @Nullable
    @ODataField(odataName = "SalesOrganization")
    private String salesOrganization;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrganization</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> SALES_ORGANIZATION = new CustomerSalesAreaAddressDependentInformationField<String>("SalesOrganization");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DistributionChannel</b></p>
     * 
     * @return
     *     Distribution Channel
     */
    @Key
    @SerializedName("DistributionChannel")
    @JsonProperty("DistributionChannel")
    @Nullable
    @ODataField(odataName = "DistributionChannel")
    private String distributionChannel;
    /**
     * Use with available fluent helpers to apply the <b>DistributionChannel</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> DISTRIBUTION_CHANNEL = new CustomerSalesAreaAddressDependentInformationField<String>("DistributionChannel");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Division</b></p>
     * 
     * @return
     *     Division
     */
    @Key
    @SerializedName("Division")
    @JsonProperty("Division")
    @Nullable
    @ODataField(odataName = "Division")
    private String division;
    /**
     * Use with available fluent helpers to apply the <b>Division</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> DIVISION = new CustomerSalesAreaAddressDependentInformationField<String>("Division");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @return
     *     Business Partner Address Number (from BUT020)
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
    public final static CustomerSalesAreaAddressDependentInformationField<String> ADDRESS_NUMBER = new CustomerSalesAreaAddressDependentInformationField<String>("AddressID");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>IncotermsClassification</b></p>
     * 
     * @return
     *     Incoterms (Part 1)
     */
    @SerializedName("IncotermsClassification")
    @JsonProperty("IncotermsClassification")
    @Nullable
    @ODataField(odataName = "IncotermsClassification")
    private String incoterms;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsClassification</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> INCOTERMS = new CustomerSalesAreaAddressDependentInformationField<String>("IncotermsClassification");
    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation1</b></p>
     * 
     * @return
     *     Incoterms Location 1
     */
    @SerializedName("IncotermsLocation1")
    @JsonProperty("IncotermsLocation1")
    @Nullable
    @ODataField(odataName = "IncotermsLocation1")
    private String incotermsLocation1;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation1</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> INCOTERMS_LOCATION1 = new CustomerSalesAreaAddressDependentInformationField<String>("IncotermsLocation1");
    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation2</b></p>
     * 
     * @return
     *     Incoterms Location 2
     */
    @SerializedName("IncotermsLocation2")
    @JsonProperty("IncotermsLocation2")
    @Nullable
    @ODataField(odataName = "IncotermsLocation2")
    private String incotermsLocation2;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation2</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> INCOTERMS_LOCATION2 = new CustomerSalesAreaAddressDependentInformationField<String>("IncotermsLocation2");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnLoc1AddlUUID</b></p>
     * 
     * @return
     *     Location UUID
     */
    @SerializedName("IncotermsSupChnLoc1AddlUUID")
    @JsonProperty("IncotermsSupChnLoc1AddlUUID")
    @Nullable
    @ODataField(odataName = "IncotermsSupChnLoc1AddlUUID")
    private UUID locationUUID;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsSupChnLoc1AddlUUID</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<UUID> LOCATION_UUID = new CustomerSalesAreaAddressDependentInformationField<UUID>("IncotermsSupChnLoc1AddlUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnLoc2AddlUUID</b></p>
     * 
     * @return
     *     Location UUID
     */
    @SerializedName("IncotermsSupChnLoc2AddlUUID")
    @JsonProperty("IncotermsSupChnLoc2AddlUUID")
    @Nullable
    @ODataField(odataName = "IncotermsSupChnLoc2AddlUUID")
    private UUID locationUUID_2;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsSupChnLoc2AddlUUID</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<UUID> LOCATION_U_U_I_D_2 = new CustomerSalesAreaAddressDependentInformationField<UUID>("IncotermsSupChnLoc2AddlUUID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnDvtgLocAddlUUID</b></p>
     * 
     * @return
     *     Location UUID
     */
    @SerializedName("IncotermsSupChnDvtgLocAddlUUID")
    @JsonProperty("IncotermsSupChnDvtgLocAddlUUID")
    @Nullable
    @ODataField(odataName = "IncotermsSupChnDvtgLocAddlUUID")
    private UUID locationUUID_3;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsSupChnDvtgLocAddlUUID</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<UUID> LOCATION_U_U_I_D_3 = new CustomerSalesAreaAddressDependentInformationField<UUID>("IncotermsSupChnDvtgLocAddlUUID");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlocked</b></p>
     * 
     * @return
     *     Customer delivery block (sales area)
     */
    @SerializedName("DeliveryIsBlocked")
    @JsonProperty("DeliveryIsBlocked")
    @Nullable
    @ODataField(odataName = "DeliveryIsBlocked")
    private String delBlckSalesAr;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryIsBlocked</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> DEL_BLCK_SALES_AR = new CustomerSalesAreaAddressDependentInformationField<String>("DeliveryIsBlocked");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOffice</b></p>
     * 
     * @return
     *     Sales Office
     */
    @SerializedName("SalesOffice")
    @JsonProperty("SalesOffice")
    @Nullable
    @ODataField(odataName = "SalesOffice")
    private String salesOffice;
    /**
     * Use with available fluent helpers to apply the <b>SalesOffice</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> SALES_OFFICE = new CustomerSalesAreaAddressDependentInformationField<String>("SalesOffice");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>SalesGroup</b></p>
     * 
     * @return
     *     Sales Group
     */
    @SerializedName("SalesGroup")
    @JsonProperty("SalesGroup")
    @Nullable
    @ODataField(odataName = "SalesGroup")
    private String salesGroup;
    /**
     * Use with available fluent helpers to apply the <b>SalesGroup</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> SALES_GROUP = new CustomerSalesAreaAddressDependentInformationField<String>("SalesGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ShippingCondition</b></p>
     * 
     * @return
     *     Shipping Conditions
     */
    @SerializedName("ShippingCondition")
    @JsonProperty("ShippingCondition")
    @Nullable
    @ODataField(odataName = "ShippingCondition")
    private String shippingConditions;
    /**
     * Use with available fluent helpers to apply the <b>ShippingCondition</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> SHIPPING_CONDITIONS = new CustomerSalesAreaAddressDependentInformationField<String>("ShippingCondition");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplyingPlant</b></p>
     * 
     * @return
     *     Delivering Plant (Own or External)
     */
    @SerializedName("SupplyingPlant")
    @JsonProperty("SupplyingPlant")
    @Nullable
    @ODataField(odataName = "SupplyingPlant")
    private String deliveringPlant;
    /**
     * Use with available fluent helpers to apply the <b>SupplyingPlant</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> DELIVERING_PLANT = new CustomerSalesAreaAddressDependentInformationField<String>("SupplyingPlant");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IncotermsVersion</b></p>
     * 
     * @return
     *     Incoterms Version
     */
    @SerializedName("IncotermsVersion")
    @JsonProperty("IncotermsVersion")
    @Nullable
    @ODataField(odataName = "IncotermsVersion")
    private String incotermsVersion;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsVersion</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaAddressDependentInformationField<String> INCOTERMS_VERSION = new CustomerSalesAreaAddressDependentInformationField<String>("IncotermsVersion");

    @Nonnull
    @Override
    public Class<CustomerSalesAreaAddressDependentInformation> getType() {
        return CustomerSalesAreaAddressDependentInformation.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     Customer Number
     */
    public void setCustomer(
        @Nullable
        final String customer) {
        rememberChangedField("Customer", this.customer);
        this.customer = customer;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOrganization</b></p>
     * 
     * @param salesOrganization
     *     Sales Organization
     */
    public void setSalesOrganization(
        @Nullable
        final String salesOrganization) {
        rememberChangedField("SalesOrganization", this.salesOrganization);
        this.salesOrganization = salesOrganization;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DistributionChannel</b></p>
     * 
     * @param distributionChannel
     *     Distribution Channel
     */
    public void setDistributionChannel(
        @Nullable
        final String distributionChannel) {
        rememberChangedField("DistributionChannel", this.distributionChannel);
        this.distributionChannel = distributionChannel;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Division</b></p>
     * 
     * @param division
     *     Division
     */
    public void setDivision(
        @Nullable
        final String division) {
        rememberChangedField("Division", this.division);
        this.division = division;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressNumber
     *     Business Partner Address Number (from BUT020)
     */
    public void setAddressNumber(
        @Nullable
        final String addressNumber) {
        rememberChangedField("AddressID", this.addressNumber);
        this.addressNumber = addressNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>IncotermsClassification</b></p>
     * 
     * @param incoterms
     *     Incoterms (Part 1)
     */
    public void setIncoterms(
        @Nullable
        final String incoterms) {
        rememberChangedField("IncotermsClassification", this.incoterms);
        this.incoterms = incoterms;
    }

    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation1</b></p>
     * 
     * @param incotermsLocation1
     *     Incoterms Location 1
     */
    public void setIncotermsLocation1(
        @Nullable
        final String incotermsLocation1) {
        rememberChangedField("IncotermsLocation1", this.incotermsLocation1);
        this.incotermsLocation1 = incotermsLocation1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation2</b></p>
     * 
     * @param incotermsLocation2
     *     Incoterms Location 2
     */
    public void setIncotermsLocation2(
        @Nullable
        final String incotermsLocation2) {
        rememberChangedField("IncotermsLocation2", this.incotermsLocation2);
        this.incotermsLocation2 = incotermsLocation2;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnLoc1AddlUUID</b></p>
     * 
     * @param locationUUID
     *     Location UUID
     */
    public void setLocationUUID(
        @Nullable
        final UUID locationUUID) {
        rememberChangedField("IncotermsSupChnLoc1AddlUUID", this.locationUUID);
        this.locationUUID = locationUUID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnLoc2AddlUUID</b></p>
     * 
     * @param locationUUID_2
     *     Location UUID
     */
    public void setLocationUUID_2(
        @Nullable
        final UUID locationUUID_2) {
        rememberChangedField("IncotermsSupChnLoc2AddlUUID", this.locationUUID_2);
        this.locationUUID_2 = locationUUID_2;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IncotermsSupChnDvtgLocAddlUUID</b></p>
     * 
     * @param locationUUID_3
     *     Location UUID
     */
    public void setLocationUUID_3(
        @Nullable
        final UUID locationUUID_3) {
        rememberChangedField("IncotermsSupChnDvtgLocAddlUUID", this.locationUUID_3);
        this.locationUUID_3 = locationUUID_3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlocked</b></p>
     * 
     * @param delBlckSalesAr
     *     Customer delivery block (sales area)
     */
    public void setDelBlckSalesAr(
        @Nullable
        final String delBlckSalesAr) {
        rememberChangedField("DeliveryIsBlocked", this.delBlckSalesAr);
        this.delBlckSalesAr = delBlckSalesAr;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOffice</b></p>
     * 
     * @param salesOffice
     *     Sales Office
     */
    public void setSalesOffice(
        @Nullable
        final String salesOffice) {
        rememberChangedField("SalesOffice", this.salesOffice);
        this.salesOffice = salesOffice;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>SalesGroup</b></p>
     * 
     * @param salesGroup
     *     Sales Group
     */
    public void setSalesGroup(
        @Nullable
        final String salesGroup) {
        rememberChangedField("SalesGroup", this.salesGroup);
        this.salesGroup = salesGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ShippingCondition</b></p>
     * 
     * @param shippingConditions
     *     Shipping Conditions
     */
    public void setShippingConditions(
        @Nullable
        final String shippingConditions) {
        rememberChangedField("ShippingCondition", this.shippingConditions);
        this.shippingConditions = shippingConditions;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplyingPlant</b></p>
     * 
     * @param deliveringPlant
     *     Delivering Plant (Own or External)
     */
    public void setDeliveringPlant(
        @Nullable
        final String deliveringPlant) {
        rememberChangedField("SupplyingPlant", this.deliveringPlant);
        this.deliveringPlant = deliveringPlant;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IncotermsVersion</b></p>
     * 
     * @param incotermsVersion
     *     Incoterms Version
     */
    public void setIncotermsVersion(
        @Nullable
        final String incotermsVersion) {
        rememberChangedField("IncotermsVersion", this.incotermsVersion);
        this.incotermsVersion = incotermsVersion;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustSlsAreaAddrDepdntInfo";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("SalesOrganization", getSalesOrganization());
        result.put("DistributionChannel", getDistributionChannel());
        result.put("Division", getDivision());
        result.put("AddressID", getAddressNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("SalesOrganization", getSalesOrganization());
        values.put("DistributionChannel", getDistributionChannel());
        values.put("Division", getDivision());
        values.put("AddressID", getAddressNumber());
        values.put("IncotermsClassification", getIncoterms());
        values.put("IncotermsLocation1", getIncotermsLocation1());
        values.put("IncotermsLocation2", getIncotermsLocation2());
        values.put("IncotermsSupChnLoc1AddlUUID", getLocationUUID());
        values.put("IncotermsSupChnLoc2AddlUUID", getLocationUUID_2());
        values.put("IncotermsSupChnDvtgLocAddlUUID", getLocationUUID_3());
        values.put("DeliveryIsBlocked", getDelBlckSalesAr());
        values.put("SalesOffice", getSalesOffice());
        values.put("SalesGroup", getSalesGroup());
        values.put("ShippingCondition", getShippingConditions());
        values.put("SupplyingPlant", getDeliveringPlant());
        values.put("IncotermsVersion", getIncotermsVersion());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("SalesOrganization")) {
                final Object value = values.remove("SalesOrganization");
                if ((value == null)||(!value.equals(getSalesOrganization()))) {
                    setSalesOrganization(((String) value));
                }
            }
            if (values.containsKey("DistributionChannel")) {
                final Object value = values.remove("DistributionChannel");
                if ((value == null)||(!value.equals(getDistributionChannel()))) {
                    setDistributionChannel(((String) value));
                }
            }
            if (values.containsKey("Division")) {
                final Object value = values.remove("Division");
                if ((value == null)||(!value.equals(getDivision()))) {
                    setDivision(((String) value));
                }
            }
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressNumber()))) {
                    setAddressNumber(((String) value));
                }
            }
            if (values.containsKey("IncotermsClassification")) {
                final Object value = values.remove("IncotermsClassification");
                if ((value == null)||(!value.equals(getIncoterms()))) {
                    setIncoterms(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation1")) {
                final Object value = values.remove("IncotermsLocation1");
                if ((value == null)||(!value.equals(getIncotermsLocation1()))) {
                    setIncotermsLocation1(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation2")) {
                final Object value = values.remove("IncotermsLocation2");
                if ((value == null)||(!value.equals(getIncotermsLocation2()))) {
                    setIncotermsLocation2(((String) value));
                }
            }
            if (values.containsKey("IncotermsSupChnLoc1AddlUUID")) {
                final Object value = values.remove("IncotermsSupChnLoc1AddlUUID");
                if ((value == null)||(!value.equals(getLocationUUID()))) {
                    setLocationUUID(((UUID) value));
                }
            }
            if (values.containsKey("IncotermsSupChnLoc2AddlUUID")) {
                final Object value = values.remove("IncotermsSupChnLoc2AddlUUID");
                if ((value == null)||(!value.equals(getLocationUUID_2()))) {
                    setLocationUUID_2(((UUID) value));
                }
            }
            if (values.containsKey("IncotermsSupChnDvtgLocAddlUUID")) {
                final Object value = values.remove("IncotermsSupChnDvtgLocAddlUUID");
                if ((value == null)||(!value.equals(getLocationUUID_3()))) {
                    setLocationUUID_3(((UUID) value));
                }
            }
            if (values.containsKey("DeliveryIsBlocked")) {
                final Object value = values.remove("DeliveryIsBlocked");
                if ((value == null)||(!value.equals(getDelBlckSalesAr()))) {
                    setDelBlckSalesAr(((String) value));
                }
            }
            if (values.containsKey("SalesOffice")) {
                final Object value = values.remove("SalesOffice");
                if ((value == null)||(!value.equals(getSalesOffice()))) {
                    setSalesOffice(((String) value));
                }
            }
            if (values.containsKey("SalesGroup")) {
                final Object value = values.remove("SalesGroup");
                if ((value == null)||(!value.equals(getSalesGroup()))) {
                    setSalesGroup(((String) value));
                }
            }
            if (values.containsKey("ShippingCondition")) {
                final Object value = values.remove("ShippingCondition");
                if ((value == null)||(!value.equals(getShippingConditions()))) {
                    setShippingConditions(((String) value));
                }
            }
            if (values.containsKey("SupplyingPlant")) {
                final Object value = values.remove("SupplyingPlant");
                if ((value == null)||(!value.equals(getDeliveringPlant()))) {
                    setDeliveringPlant(((String) value));
                }
            }
            if (values.containsKey("IncotermsVersion")) {
                final Object value = values.remove("IncotermsVersion");
                if ((value == null)||(!value.equals(getIncotermsVersion()))) {
                    setIncotermsVersion(((String) value));
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
    public static<T >CustomerSalesAreaAddressDependentInformationField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerSalesAreaAddressDependentInformationField<T>(fieldName);
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
    public static<T,DomainT >CustomerSalesAreaAddressDependentInformationField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerSalesAreaAddressDependentInformationField<T>(fieldName, typeConverter);
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
