/**
 * ProdutoDAOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public interface ProdutoDAOService extends javax.xml.rpc.Service {
    public java.lang.String getProdutoDAOPortAddress();

    public com.pdc.ws.dao.ProdutoDAO getProdutoDAOPort() throws javax.xml.rpc.ServiceException;

    public com.pdc.ws.dao.ProdutoDAO getProdutoDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
