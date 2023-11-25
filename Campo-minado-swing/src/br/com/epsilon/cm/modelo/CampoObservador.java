package br.com.epsilon.cm.modelo;

import org.w3c.dom.events.MouseEvent;

public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);

	void mousePressed(MouseEvent e);
	
}