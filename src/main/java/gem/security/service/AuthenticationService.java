package gem.security.service;

import gem.security.controller.AuthenticationRequest;
import gem.security.controller.AuthenticationResponse;

import gem.security.controller.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {

    AuthenticationResponse authenticate(AuthenticationRequest request);

    AuthenticationResponse register(RegisterRequest request);
}
