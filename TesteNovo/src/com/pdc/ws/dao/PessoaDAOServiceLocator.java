/**
 * PessoaDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public class PessoaDAOServiceLocator extends org.apache.axis.client.Service implements com.pdc.ws.dao.PessoaDAOService {

    public PessoaDAOServiceLocator() {
    }


    public PessoaDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PessoaDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PessoaDAOPort
    private java.lang.String PessoaDAOPort_address = "http://localhost:8080/PDC_WS_SOAP/PessoaDAOService";

    public java.lang.String getPessoaDAOPortAddress() {
        return PessoaDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PessoaDAOPortWSDDServiceName = "PessoaDAOPort";

    public java.lang.String getPessoaDAOPortWSDDServiceName() {
        return PessoaDAOPortWSDDServiceName;
    }

    public void setPessoaDAOPortWSDDServiceName(java.lang.String name) {
        PessoaDAOPortWSDDServiceName = name;
    }

    public com.pdc.ws.dao.PessoaDAO getPessoaDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PessoaDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPessoaDAOPort(endpoint);
    }

    public com.pdc.ws.dao.PessoaDAO getPessoaDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pdc.ws.dao.PessoaDAOPortBindingStub _stub = new com.pdc.ws.dao.PessoaDAOPortBindingStub(portAddress, this);
            _stub.setPortName(getPessoaDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPessoaDAOPortEndpointAddress(java.lang.String address) {
        PessoaDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pdc.ws.dao.PessoaDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pdc.ws.dao.PessoaDAOPortBindingStub _stub = new com.pdc.ws.dao.PessoaDAOPortBindingStub(new java.net.URL(PessoaDAOPort_address), this);
                _stub.setPortName(getPessoaDAOPortWSDDServiceName());
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
        if ("PessoaDAOPort".equals(inputPortName)) {
            return getPessoaDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "PessoaDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao.ws.pdc.com/", "PessoaDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PessoaDAOPort".equals(portName)) {
            setPessoaDAOPortEndpointAddress(address);
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
