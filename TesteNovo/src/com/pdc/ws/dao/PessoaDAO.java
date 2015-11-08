/**
 * PessoaDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pdc.ws.dao;

public interface PessoaDAO extends java.rmi.Remote {
    public java.lang.Boolean pessoaJaFezCompra(java.lang.Long arg0) throws java.rmi.RemoteException;
    public com.pdc.ws.dao.Pessoa getPessoa(java.lang.Long arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean deletarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean cadastrarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException;
    public java.lang.Boolean alterarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException;
    public com.pdc.ws.dao.Pessoa[] listarCliente() throws java.rmi.RemoteException;
    public java.lang.Boolean verificarCPF(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.pdc.ws.dao.Pessoa autenticarPessoa(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException;
}
