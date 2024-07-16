package br.com.alura.cineplus.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
