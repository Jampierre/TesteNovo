package com.pdc.visao;

import javax.swing.JTable;

public class Util {
	public static void hiddeColumn(JTable table, int idxColumn){
		table.getColumnModel().getColumn(idxColumn).setMaxWidth(0);
		table.getColumnModel().getColumn(idxColumn).setMinWidth(0);
		table.getColumnModel().getColumn(idxColumn).setPreferredWidth(0);
	}
}
