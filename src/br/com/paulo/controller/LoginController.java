package br.com.paulo.controller;

import java.awt.event.KeyEvent;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.paulo.model.Dados;
import br.com.paulo.view.LoginView;

public class LoginController {

	private LoginView loginView;
	private Dados d;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
	}

	public LoginController() {
	}

	public void validarCpf(KeyEvent e) throws TratadoraException {
		if (!Character.isDigit(e.getKeyChar())
				&& e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
			throw new TratadoraException("Apenas digitos");
		}
	}
}

