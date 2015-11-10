package com.pdc.ws.dao;

public class ProdutoDAOProxy implements com.pdc.ws.dao.ProdutoDAO {
  private String _endpoint = null;
  private com.pdc.ws.dao.ProdutoDAO produtoDAO = null;
  
  public ProdutoDAOProxy() {
    _initProdutoDAOProxy();
  }
  
  public ProdutoDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initProdutoDAOProxy();
  }
  
  private void _initProdutoDAOProxy() {
    try {
      produtoDAO = (new com.pdc.ws.dao.ProdutoDAOServiceLocator()).getProdutoDAOPort();
      if (produtoDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)produtoDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)produtoDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (produtoDAO != null)
      ((javax.xml.rpc.Stub)produtoDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pdc.ws.dao.ProdutoDAO getProdutoDAO() {
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO;
  }
  
  public com.pdc.ws.dao.Produto[] listarProdutos() throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.listarProdutos();
  }
  
  public java.lang.Boolean alterarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.alterarProduto(arg0);
  }
  
  public java.lang.Boolean deletarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.deletarProduto(arg0);
  }
  
  public java.lang.Boolean cadastrarProduto(com.pdc.ws.dao.Produto arg0) throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.cadastrarProduto(arg0);
  }
  
  public com.pdc.ws.dao.Produto getProduto(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.getProduto(arg0);
  }
  
  public java.lang.Boolean verificarCodigoProduto(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (produtoDAO == null)
      _initProdutoDAOProxy();
    return produtoDAO.verificarCodigoProduto(arg0);
  }
  
  
}