package br.com.paulo.repository;

import br.com.paulo.model.Coordenador;
import br.com.paulo.model.Dados;
import br.com.paulo.model.Usuario;

public class DAOCoordenador {

	public boolean salvar(Coordenador obj) {
		if (obj != null) {
			Dados.listaCoordenadores.add(obj);
			return true;
		}
		return false;
	}

	public boolean remover(Coordenador obj) {
		if (obj != null) {
			Dados.listaCoordenadores.remove(obj);
			return true;
		}
		return false;
	}
}
