package edu.citadel.api.request;

import lombok.Data;

@Data
public class AccountRequestBody {
  private String username;
  private String password;
  private String email;

  // Explicit getters for compatibility
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  // Explicit setters for compatibility
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
