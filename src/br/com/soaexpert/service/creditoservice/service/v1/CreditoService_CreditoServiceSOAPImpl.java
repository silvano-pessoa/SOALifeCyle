package br.com.soaexpert.service.creditoservice.service.v1;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import br.com.soaexpert.domain.model.v1.Credito;
import br.com.soaexpert.domain.model.v1.Empresa;

/**
 * This class was generated by the JAX-WS RI. Oracle JAX-WS 2.1.5 Generated
 * source version: 2.1
 * 
 */
@WebService(portName = "CreditoServiceSOAP", serviceName = "CreditoService", targetNamespace = "http://service.soaexpert.com.br/CreditoService/service/v1.0", wsdlLocation = "/wsdls/CreditoService.wsdl", endpointInterface = "br.com.soaexpert.service.creditoservice.service.v1.CreditoService")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class CreditoService_CreditoServiceSOAPImpl implements CreditoService {

	public CreditoService_CreditoServiceSOAPImpl() {
	}

	/**
	 * 
	 * @param empresa
	 * @return returns br.com.soaexpert.domain.model.v1.Credito
	 */
	public Credito verificaCreditoSerasa(Empresa empresa) {
		// replace with your impl here
		return new Credito();
	}

	/**
	 * 
	 * @param empresa
	 * @return returns br.com.soaexpert.domain.model.v1.Credito
	 */
	public Credito verificaCreditoSPC(Empresa empresa) {
		// replace with your impl here
		return null;
	}

	/**
	 * 
	 * @param empresa
	 * @return returns br.com.soaexpert.domain.model.v1.Credito
	 */
	public Credito verificaCasasBahia(Empresa empresa) {
		// replace with your impl here
		return null;
	}

}
