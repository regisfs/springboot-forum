package br.com.sodescomplicado.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.sodescomplicado.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dadaCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dadaCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDadaCriacao() {
		return dadaCriacao;
	}

	public static Page<TopicoDto> converter(Page<Topico> topicos) {
		// TODO Auto-generated method stub
		return topicos.map(TopicoDto::new);
	}
	
	

}
