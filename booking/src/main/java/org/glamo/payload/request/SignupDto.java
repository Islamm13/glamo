package org.glamo.payload.request;

import lombok.Data;
import org.glamo.domain.UserRole;

@Data
public class SignupDto {
	private String email;
	private String password;
	private String phone;
	private String fullName;
	private UserRole role;
}