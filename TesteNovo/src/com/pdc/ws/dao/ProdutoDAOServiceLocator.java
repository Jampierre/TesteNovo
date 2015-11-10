/**
 * ProdutoDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public class ProdutoDAOServiceLocator extends org.apache.axis.client.Service implements com.pdc.ws.dao.ProdutoDAOService {

    public ProdutoDAOServiceLocator() {
    }


    public ProdutoDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProdutoDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProdutoDAOPort
    private java.lang.String ProdutoDAOPort_address = "http://localhost:8080/PDC_WS_SOAP/ProdutoDAOService";

    public java.lang.String getProdutoDAOPortAddress() {
        return ProdutoDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProdutoDAOPortWSDDServiceName = "ProdutoDAOPort";

    public java.lang.String getProdutoDAOPortWSDDServiceName() {
        return ProdutoDAOPortWSDDServiceName;
    }

    public void setProdutoDAOPortWSDDServiceName(java.lang.String name) {
        ProdutoDAOPortWSDDServiceName = name;
    }

    public com.pdc.ws.dao.ProdutoDAO getProdutoDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProdutoDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProdutoDAOPort(endpoint);
    }

    public com.pdc.ws.dao.ProdutoDAO getProdutoDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pdc.ws.dao.ProdutoDAOPortBindingStub _stub = new com.pdc.ws.dao.ProdutoDAOPortBindingStub(portAddress, this);
            _stub.setPortName(getProdutoDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProdutoDAOPortEndpointAddress(java.lang.String address) {
        ProdutoDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pdc.ws.dao.ProdutoDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pdc.ws.dao.ProdutoDAOPortBindingStub _stub = new com.pdc.ws.dao.ProdutoDAOPortBindingStub(new java.net.URL(ProdutoDAOPort_address), this);
                _stub.setPortName(getProdutoDAOPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProdutoDAOPort".equals(inputPortName)) {
            return getProdutoDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "ProdutoDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "ProdutoDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProdutoDAOPort".equals(portName)) {
            setProdutoDAOPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
