package models;

import lombok.*;

@Data
@Builder
public class LoginPageRegistrationModel {
    private String login;
    private String password;
}
