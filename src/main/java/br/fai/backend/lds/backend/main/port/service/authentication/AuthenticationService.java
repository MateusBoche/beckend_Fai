package br.fai.backend.lds.backend.main.port.service.authentication;

public interface AuthenticationService {
  void authenticate(final String email, final String password);
}
