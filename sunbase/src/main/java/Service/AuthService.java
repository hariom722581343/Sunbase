package Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService {
 private final RestTemplate restTemplate;

 public AuthService(RestTemplate restTemplate) {
  this.restTemplate = restTemplate;
 }

 public String authenticateUser() {
  String authUrl = "(link unavailable)";
  HttpHeaders headers = new HttpHeaders();
  headers.setContentType(MediaType.APPLICATION_JSON);
  String requestBody = "{\"login_id\": \"test@sunbasedata.com\", \"password\": \"Test@123\"}";
  HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
  ResponseEntity<String> response = restTemplate.postForEntity(authUrl, entity, String.class);
  if (response.getStatusCode().is2xxSuccessful()) {
   return response.getBody();
  } else {
   throw new RuntimeException("Failed to authenticate with the remote API.");
  }
 }
}
