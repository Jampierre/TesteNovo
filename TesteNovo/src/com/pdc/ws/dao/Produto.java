/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public class Produto  extends com.pdc.ws.dao.EntidadeID  implements java.io.Serializable {
    private java.lang.Integer codigo;

    private java.lang.String descricao;

    private com.pdc.ws.dao.Filial filial;

    private java.lang.Double preco;

    private java.lang.Integer quantidade;

    public Produto() {
    }

    public Produto(
           java.lang.Long id,
           java.lang.Integer version,
           java.lang.Integer codigo,
           java.lang.String descricao,
           com.pdc.ws.dao.Filial filial,
           java.lang.Double preco,
           java.lang.Integer quantidade) {
        super(
            id,
            version);
        this.codigo = codigo;
        this.descricao = descricao;
        this.filial = filial;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    /**
     * Gets the codigo value for this Produto.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Produto.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descricao value for this Produto.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Produto.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the filial value for this Produto.
     * 
     * @return filial
     */
    public com.pdc.ws.dao.Filial getFilial() {
        return filial;
    }


    /**
     * Sets the filial value for this Produto.
     * 
     * @param filial
     */
    public void setFilial(com.pdc.ws.dao.Filial filial) {
        this.filial = filial;
    }


    /**
     * Gets the preco value for this Produto.
     * 
     * @return preco
     */
    public java.lang.Double getPreco() {
        return preco;
    }


    /**
     * Sets the preco value for this Produto.
     * 
     * @param preco
     */
    public void setPreco(java.lang.Double preco) {
        this.preco = preco;
    }


    /**
     * Gets the quantidade value for this Produto.
     * 
     * @return quantidade
     */
    public java.lang.Integer getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this Produto.
     * 
     * @param quantidade
     */
    public void setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.filial==null && other.getFilial()==null) || 
             (this.filial!=null &&
              this.filial.equals(other.getFilial()))) &&
            ((this.preco==null && other.getPreco()==null) || 
             (this.preco!=null &&
              this.preco.equals(other.getPreco()))) &&
            ((this.quantidade==null && other.getQuantidade()==null) || 
             (this.quantidade!=null &&
              this.quantidade.equals(other.getQuantidade())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getFilial() != null) {
            _hashCode += getFilial().hashCode();
        }
        if (getPreco() != null) {
            _hashCode += getPreco().hashCode();
        }
        if (getQuantidade() != null) {
            _hashCode += getQuantidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "filial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
