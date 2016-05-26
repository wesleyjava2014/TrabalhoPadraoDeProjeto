package br.com.trabalhoReinaldo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.trabalhoReinaldo.modelo.Cliente;

public class ClienteDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public ClienteDAO(EntityManager manager) {
		super();
		this.manager = manager;
	}

	protected void guardarCliente(Cliente cliente) {
		this.manager.merge(cliente);
	}

	protected List<Cliente> todosClientes() {
		TypedQuery<Cliente> query = manager.createQuery("from Cliente",
				Cliente.class);
		return query.getResultList();
	}

}
