package com.examen.comentarios.service;

public class PublicacionNoEncontradaException extends RuntimeException {
  private final String id;

  public PublicacionNoEncontradaException(String message, String id) {
    super(message);
    this.id = id;
  }

  public static PublicacionNoEncontradaException from(String message, String id) {
    return new PublicacionNoEncontradaException(message, id);
  }

  public String getId() {
    return id;
  }
}
