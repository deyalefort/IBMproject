package com.project.cliente.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.cliente.model.Cliente;

@FeignClient("${feign.client.cliente.name}")
@RequestMapping("${feign.client.cliente.uri}")

public interface IClienteFeign {
	
	@GetMapping("${feign.client.cliente.get}")
	public List<Cliente> getResponseGet();
	
	@PostMapping("${feign.client.cliente.post}")
	public String getResponsePost(@RequestBody Cliente tarjeta);
}
