package com.pdc.visao;

import javax.swing.JFrame;

import com.pdc.ws.dao.Pessoa;

public class BaseView extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private static Pessoa usuarioLogado;

	public static Pessoa getUsuarioLogado() {
		return usuarioLogado;
	}

	public static void setUsuarioLogado(Pessoa usuarioLogado) {
		BaseView.usuarioLogado = usuarioLogado;
	}
}
