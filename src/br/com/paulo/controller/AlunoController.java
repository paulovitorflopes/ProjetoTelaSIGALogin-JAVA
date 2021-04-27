package br.com.paulo.controller;

import java.awt.event.KeyEvent;

public class AlunoController {
	
	public void validarTelefone(KeyEvent e) throws TratadoraException {
		if (!Character.isDigit(e.getKeyChar()) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE){
			throw new TratadoraException("Apenas números");
		}	
	}

}
