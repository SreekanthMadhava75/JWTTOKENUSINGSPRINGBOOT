package com.advana.config;


import com.advana.model.User;
import java.util.Map;

public interface JwtGeneratorInterface {

	Map<String, String> generateToken(User user);
}
