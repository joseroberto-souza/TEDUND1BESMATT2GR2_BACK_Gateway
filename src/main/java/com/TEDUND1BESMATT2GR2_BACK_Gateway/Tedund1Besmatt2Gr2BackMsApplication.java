package com.TEDUND1BESMATT2GR2_BACK_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Inicia a aplicação do API Gateway.
 * Este serviço atua como porta de entrada única e roteia as requisições para os microsserviços ativos.
 */
@SpringBootApplication // Habilita a configuração automática e a inicialização do Spring Boot.
@EnableDiscoveryClient // Registra o Gateway no servidor Eureka e consulta a lista de microsserviços.
public class Tedund1Besmatt2Gr2BackMsApplication {

	/**
	 * Executa o ponto de entrada principal da aplicação Java.
	 *
	 * @param args Argumentos de linha de comando passados na inicialização.
	 */
	public static void main(String[] args) {
		// Inicia o contexto do Spring e sobe o servidor Gateway na porta configurada.
		SpringApplication.run(Tedund1Besmatt2Gr2BackMsApplication.class, args);
	}

}
