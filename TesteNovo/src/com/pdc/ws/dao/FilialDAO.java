/**
 * FilialDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public interface FilialDAO extends java.rmi.Remote {
    public com.pdc.ws.dao.Filial[] listarFiliais() throws java.rmi.RemoteException;
    public com.pdc.ws.dao.Filial cadastrarFilial(java.lang.String arg0) throws java.rmi.RemoteException, com.pdc.ws.dao.Exception;
}
