package br.com.trabalhoReinaldo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.trabalhoReinaldo.jpaUtil.Transactional;
import br.com.trabalhoReinaldo.modelo.Cliente;

public class ClienteRN implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ClienteDAO clienteDao;

	@Transactional
	public void guardarCliente(Cliente cliente) {
		this.clienteDao.guardarCliente(cliente);
	}

	public List<Cliente> todosClientes() {
		return this.clienteDao.todosClientes();
	}

}
