package com.pdc.ws.dao;

public class FilialDAOProxy implements com.pdc.ws.dao.FilialDAO {
  private String _endpoint = null;
  private com.pdc.ws.dao.FilialDAO filialDAO = null;
  
  public FilialDAOProxy() {
    _initFilialDAOProxy();
  }
  
  public FilialDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initFilialDAOProxy();
  }
  
  private void _initFilialDAOProxy() {
    try {
      filialDAO = (new com.pdc.ws.dao.FilialDAOServiceLocator()).getFilialDAOPort();
      if (filialDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)filialDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)filialDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (filialDAO != null)
      ((javax.xml.rpc.Stub)filialDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pdc.ws.dao.FilialDAO getFilialDAO() {
    if (filialDAO == null)
      _initFilialDAOProxy();
    return filialDAO;
  }
  
  public com.pdc.ws.dao.Filial[] listarFiliais() throws java.rmi.RemoteException{
    if (filialDAO == null)
      _initFilialDAOProxy();
    return filialDAO.listarFiliais();
  }
  
  public com.pdc.ws.dao.Filial cadastrarFilial(java.lang.String arg0) throws java.rmi.RemoteException, com.pdc.ws.dao.Exception{
    if (filialDAO == null)
      _initFilialDAOProxy();
    return filialDAO.cadastrarFilial(arg0);
  }
  
  
}