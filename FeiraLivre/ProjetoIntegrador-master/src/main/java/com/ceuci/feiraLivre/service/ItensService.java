package com.ceuci.feiraLivre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceuci.feiraLivre.model.ItensModel;
import com.ceuci.feiraLivre.model.PedidoModel;
import com.ceuci.feiraLivre.repository.ItensRepository;
import com.ceuci.feiraLivre.repository.PedidoRepository;

@Service
public class ItensService {

	@Autowired
	private ItensRepository itensRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public PedidoModel salvarItens (PedidoModel pedido) {
		PedidoModel pedidoCriado = pedidoRepository.save(pedido);
		
		for (ItensModel itens : pedidoCriado.getItens()) {
			itens.setPedido(new PedidoModel(pedidoCriado.getId()));
			itensRepository.save(itens);
		}
		return pedidoCriado;
	}
	
}
