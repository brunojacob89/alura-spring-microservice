package br.com.alura.microservice.loja.controller.service;

import br.com.alura.microservice.loja.client.FornecedorClient;
import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

   /* @Autowired
    private RestTemplate cliente;

    @Autowired
    private DiscoveryClient eurekaClient;*/

    @Autowired
    private FornecedorClient fornecedorClient;

    public void realizaCompra(CompraDTO compra) {

        InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
        System.out.println(info.getEndereco());





        /* RestTemplate cliente = new RestTemplate();*/
     /*   ResponseEntity<InfoFornecedorDTO> exchange =
                cliente.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        eurekaClient.getInstances("fornecedor").stream()
                        .forEach(fornecedor -> {
                            System.out.println("localhost:"+fornecedor.getPort());
                        });

        System.out.println(exchange.getBody().getEndereco());*/
    }
}
