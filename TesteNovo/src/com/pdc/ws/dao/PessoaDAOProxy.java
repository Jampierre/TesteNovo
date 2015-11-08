package com.pdc.ws.dao;

public class PessoaDAOProxy implements com.pdc.ws.dao.PessoaDAO {
  private String _endpoint = null;
  private com.pdc.ws.dao.PessoaDAO pessoaDAO = null;
  
  public PessoaDAOProxy() {
    _initPessoaDAOProxy();
  }
  
  public PessoaDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initPessoaDAOProxy();
  }
  
  private void _initPessoaDAOProxy() {
    try {
      pessoaDAO = (new com.pdc.ws.dao.PessoaDAOServiceLocator()).getPessoaDAOPort();
      if (pessoaDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pessoaDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pessoaDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pessoaDAO != null)
      ((javax.xml.rpc.Stub)pessoaDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pdc.ws.dao.PessoaDAO getPessoaDAO() {
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO;
  }
  
  public java.lang.Boolean pessoaJaFezCompra(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.pessoaJaFezCompra(arg0);
  }
  
  public com.pdc.ws.dao.Pessoa getPessoa(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.getPessoa(arg0);
  }
  
  public java.lang.Boolean deletarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.deletarPessoa(arg0);
  }
  
  public java.lang.Boolean cadastrarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.cadastrarPessoa(arg0);
  }
  
  public java.lang.Boolean alterarPessoa(com.pdc.ws.dao.Pessoa arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.alterarPessoa(arg0);
  }
  
  public com.pdc.ws.dao.Pessoa[] listarCliente() throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.listarCliente();
  }
  
  public java.lang.Boolean verificarCPF(java.lang.String arg0) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.verificarCPF(arg0);
  }
  
  public com.pdc.ws.dao.Pessoa autenticarPessoa(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException{
    if (pessoaDAO == null)
      _initPessoaDAOProxy();
    return pessoaDAO.autenticarPessoa(email, senha);
  }
  
  
}