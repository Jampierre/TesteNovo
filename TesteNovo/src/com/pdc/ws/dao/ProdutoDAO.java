/**
 * ProdutoDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public interface ProdutoDAO extends java.rmi.Remote {
    public com.pdc.ws.dao.Produto[] listarProdutos() throws java.rmi.RemoteException;
    public java.lang.Boolean alterarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean deletarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean cadastrarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException;
    public com.pdc.ws.dao.Produto getProduto(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean verificarCodigoProduto(java.lang.Integer arg0) throws java.rmi.RemoteException;
}
