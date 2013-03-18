//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 08:39:59 AM EDT 
//


package org.ncpdp.schema.script;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://www.ncpdp.org/schema/SCRIPT}CensusRequestType"/>
 *         &lt;element name="Prescriber" type="{http://www.ncpdp.org/schema/SCRIPT}PrescriberRxFillType" minOccurs="0"/>
 *         &lt;element name="Facility" type="{http://www.ncpdp.org/schema/SCRIPT}MandatoryFaciltyType"/>
 *         &lt;element name="Patient" type="{http://www.ncpdp.org/schema/SCRIPT}PatientType"/>
 *         &lt;element name="BenefitsCoordination" type="{http://www.ncpdp.org/schema/SCRIPT}CensusBenefitsCoordinationType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Allergy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}DiagnosisGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "prescriber",
    "facility",
    "patient",
    "benefitsCoordination",
    "allergy",
    "diagnosisGeneral"
})
@XmlRootElement(name = "Census")
public class Census {

    @XmlElement(name = "Request", required = true)
    protected CensusRequestType request;
    @XmlElement(name = "Prescriber")
    protected PrescriberRxFillType prescriber;
    @XmlElement(name = "Facility", required = true)
    protected MandatoryFaciltyType facility;
    @XmlElement(name = "Patient", required = true)
    protected PatientType patient;
    @XmlElement(name = "BenefitsCoordination")
    protected List<CensusBenefitsCoordinationType> benefitsCoordination;
    @XmlElement(name = "Allergy")
    protected List<AllergyType> allergy;
    @XmlElement(name = "DiagnosisGeneral")
    protected List<DiagnosisTypeGeneral> diagnosisGeneral;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CensusRequestType }
     *     
     */
    public CensusRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CensusRequestType }
     *     
     */
    public void setRequest(CensusRequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriberRxFillType }
     *     
     */
    public PrescriberRxFillType getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriberRxFillType }
     *     
     */
    public void setPrescriber(PrescriberRxFillType value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryFaciltyType }
     *     
     */
    public MandatoryFaciltyType getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryFaciltyType }
     *     
     */
    public void setFacility(MandatoryFaciltyType value) {
        this.facility = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link PatientType }
     *     
     */
    public PatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientType }
     *     
     */
    public void setPatient(PatientType value) {
        this.patient = value;
    }

    /**
     * Gets the value of the benefitsCoordination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitsCoordination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitsCoordination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusBenefitsCoordinationType }
     * 
     * 
     */
    public List<CensusBenefitsCoordinationType> getBenefitsCoordination() {
        if (benefitsCoordination == null) {
            benefitsCoordination = new ArrayList<CensusBenefitsCoordinationType>();
        }
        return this.benefitsCoordination;
    }

    /**
     * Gets the value of the allergy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergyType }
     * 
     * 
     */
    public List<AllergyType> getAllergy() {
        if (allergy == null) {
            allergy = new ArrayList<AllergyType>();
        }
        return this.allergy;
    }

    /**
     * Gets the value of the diagnosisGeneral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosisGeneral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosisGeneral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosisTypeGeneral }
     * 
     * 
     */
    public List<DiagnosisTypeGeneral> getDiagnosisGeneral() {
        if (diagnosisGeneral == null) {
            diagnosisGeneral = new ArrayList<DiagnosisTypeGeneral>();
        }
        return this.diagnosisGeneral;
    }

}
