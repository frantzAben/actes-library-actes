//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.01 at 02:04:49 AM CET 
//


package fr.gouv.interieur.actes_v1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;


/**
 * Donnees associees a un acte
 * 
 * <p>Java class for DonneesActe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DonneesActe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeMatiere1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeMatiere2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeMatiere3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeMatiere4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeMatiere5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Objet">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrecedentIdentifiantActe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}IDActe use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClassificationDateVersion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Document" type="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}FichierSigne"/>
 *         &lt;element name="Annexes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Annexe" type="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}FichierSigne"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeNatureActe use="required""/>
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="NumeroInterne" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="15"/>
 *             &lt;pattern value="([a-zA-Z0-9][a-zA-Z0-9\-_ ]{0,13})?[a-zA-Z0-9]"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonneesActe", propOrder = {
    "codeMatiere1",
    "codeMatiere2",
    "codeMatiere3",
    "codeMatiere4",
    "codeMatiere5",
    "objet",
    "precedentIdentifiantActe",
    "classificationDateVersion",
    "document",
    "annexes"
})
public class DonneesActe {

    @XmlElement(name = "CodeMatiere1", required = true)
    protected DonneesActe.CodeMatiere1 codeMatiere1;
    @XmlElement(name = "CodeMatiere2", required = true)
    protected DonneesActe.CodeMatiere2 codeMatiere2;
    @XmlElement(name = "CodeMatiere3")
    protected DonneesActe.CodeMatiere3 codeMatiere3;
    @XmlElement(name = "CodeMatiere4")
    protected DonneesActe.CodeMatiere4 codeMatiere4;
    @XmlElement(name = "CodeMatiere5")
    protected DonneesActe.CodeMatiere5 codeMatiere5;
    @XmlElement(name = "Objet", required = true)
    protected String objet;
    @XmlElement(name = "PrecedentIdentifiantActe")
    protected DonneesActe.PrecedentIdentifiantActe precedentIdentifiantActe;
    @XmlElement(name = "ClassificationDateVersion", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar classificationDateVersion;
    @XmlElement(name = "Document", required = true)
    protected FichierSigne document;
    @XmlElement(name = "Annexes", required = true)
    protected DonneesActe.Annexes annexes;
    @XmlAttribute(name = "CodeNatureActe", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Integer codeNatureActe;
    @XmlAttribute(name = "Date", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar date;
    @XmlAttribute(name = "NumeroInterne", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    protected String numeroInterne;

    /**
     * Gets the value of the codeMatiere1 property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.CodeMatiere1 }
     *     
     */
    public DonneesActe.CodeMatiere1 getCodeMatiere1() {
        return codeMatiere1;
    }

    /**
     * Sets the value of the codeMatiere1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.CodeMatiere1 }
     *     
     */
    public void setCodeMatiere1(DonneesActe.CodeMatiere1 value) {
        this.codeMatiere1 = value;
    }

    /**
     * Gets the value of the codeMatiere2 property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.CodeMatiere2 }
     *     
     */
    public DonneesActe.CodeMatiere2 getCodeMatiere2() {
        return codeMatiere2;
    }

    /**
     * Sets the value of the codeMatiere2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.CodeMatiere2 }
     *     
     */
    public void setCodeMatiere2(DonneesActe.CodeMatiere2 value) {
        this.codeMatiere2 = value;
    }

    /**
     * Gets the value of the codeMatiere3 property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.CodeMatiere3 }
     *     
     */
    public DonneesActe.CodeMatiere3 getCodeMatiere3() {
        return codeMatiere3;
    }

    /**
     * Sets the value of the codeMatiere3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.CodeMatiere3 }
     *     
     */
    public void setCodeMatiere3(DonneesActe.CodeMatiere3 value) {
        this.codeMatiere3 = value;
    }

    /**
     * Gets the value of the codeMatiere4 property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.CodeMatiere4 }
     *     
     */
    public DonneesActe.CodeMatiere4 getCodeMatiere4() {
        return codeMatiere4;
    }

    /**
     * Sets the value of the codeMatiere4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.CodeMatiere4 }
     *     
     */
    public void setCodeMatiere4(DonneesActe.CodeMatiere4 value) {
        this.codeMatiere4 = value;
    }

    /**
     * Gets the value of the codeMatiere5 property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.CodeMatiere5 }
     *     
     */
    public DonneesActe.CodeMatiere5 getCodeMatiere5() {
        return codeMatiere5;
    }

    /**
     * Sets the value of the codeMatiere5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.CodeMatiere5 }
     *     
     */
    public void setCodeMatiere5(DonneesActe.CodeMatiere5 value) {
        this.codeMatiere5 = value;
    }

    /**
     * Gets the value of the objet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjet() {
        return objet;
    }

    /**
     * Sets the value of the objet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjet(String value) {
        this.objet = value;
    }

    /**
     * Gets the value of the precedentIdentifiantActe property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.PrecedentIdentifiantActe }
     *     
     */
    public DonneesActe.PrecedentIdentifiantActe getPrecedentIdentifiantActe() {
        return precedentIdentifiantActe;
    }

    /**
     * Sets the value of the precedentIdentifiantActe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.PrecedentIdentifiantActe }
     *     
     */
    public void setPrecedentIdentifiantActe(DonneesActe.PrecedentIdentifiantActe value) {
        this.precedentIdentifiantActe = value;
    }

    /**
     * Gets the value of the classificationDateVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClassificationDateVersion() {
        return classificationDateVersion;
    }

    /**
     * Sets the value of the classificationDateVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationDateVersion(Calendar value) {
        this.classificationDateVersion = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link FichierSigne }
     *     
     */
    public FichierSigne getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link FichierSigne }
     *     
     */
    public void setDocument(FichierSigne value) {
        this.document = value;
    }

    /**
     * Gets the value of the annexes property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe.Annexes }
     *     
     */
    public DonneesActe.Annexes getAnnexes() {
        return annexes;
    }

    /**
     * Sets the value of the annexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe.Annexes }
     *     
     */
    public void setAnnexes(DonneesActe.Annexes value) {
        this.annexes = value;
    }

    /**
     * Gets the value of the codeNatureActe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCodeNatureActe() {
        return codeNatureActe;
    }

    /**
     * Sets the value of the codeNatureActe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNatureActe(Integer value) {
        this.codeNatureActe = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the numeroInterne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInterne() {
        return numeroInterne;
    }

    /**
     * Sets the value of the numeroInterne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInterne(String value) {
        this.numeroInterne = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Annexe" type="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}FichierSigne"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annexe"
    })
    public static class Annexes {

        @XmlElement(name = "Annexe")
        protected List<FichierSigne> annexe;
        @XmlAttribute(name = "Nombre", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer nombre;

        /**
         * Gets the value of the annexe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annexe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnexe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FichierSigne }
         * 
         * 
         */
        public List<FichierSigne> getAnnexe() {
            if (annexe == null) {
                annexe = new ArrayList<FichierSigne>();
            }
            return this.annexe;
        }

        /**
         * Gets the value of the nombre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getNombre() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(Integer value) {
            this.nombre = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeMatiere1 {

        @XmlAttribute(name = "CodeMatiere", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer codeMatiere;

        /**
         * Gets the value of the codeMatiere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getCodeMatiere() {
            return codeMatiere;
        }

        /**
         * Sets the value of the codeMatiere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMatiere(Integer value) {
            this.codeMatiere = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeMatiere2 {

        @XmlAttribute(name = "CodeMatiere", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer codeMatiere;

        /**
         * Gets the value of the codeMatiere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getCodeMatiere() {
            return codeMatiere;
        }

        /**
         * Sets the value of the codeMatiere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMatiere(Integer value) {
            this.codeMatiere = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeMatiere3 {

        @XmlAttribute(name = "CodeMatiere", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer codeMatiere;

        /**
         * Gets the value of the codeMatiere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getCodeMatiere() {
            return codeMatiere;
        }

        /**
         * Sets the value of the codeMatiere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMatiere(Integer value) {
            this.codeMatiere = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeMatiere4 {

        @XmlAttribute(name = "CodeMatiere", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer codeMatiere;

        /**
         * Gets the value of the codeMatiere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getCodeMatiere() {
            return codeMatiere;
        }

        /**
         * Sets the value of the codeMatiere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMatiere(Integer value) {
            this.codeMatiere = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}CodeMatiere use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeMatiere5 {

        @XmlAttribute(name = "CodeMatiere", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Integer codeMatiere;

        /**
         * Gets the value of the codeMatiere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getCodeMatiere() {
            return codeMatiere;
        }

        /**
         * Sets the value of the codeMatiere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMatiere(Integer value) {
            this.codeMatiere = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}IDActe use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrecedentIdentifiantActe {

        @XmlAttribute(name = "IDActe", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
        protected String idActe;

        /**
         * Gets the value of the idActe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDActe() {
            return idActe;
        }

        /**
         * Sets the value of the idActe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDActe(String value) {
            this.idActe = value;
        }

    }

}
