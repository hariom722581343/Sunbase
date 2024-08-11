package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

 @Autowired
 private AuthService authService;

 @PostMapping("/login")
 public String login() {
  // Call the authenticateUser method to perform the authentication
  String token = authService.authenticateUser();
  // Return the token or do further processing
  return token;
 }
}
