package quick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quick.model.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")

public class UsersController {
@Autowired 
UsersManager UM;

@PostMapping("/signup")
public String signUp(@RequestBody Users U) {
	return UM.addUser(U);
}

@GetMapping("/forgotpassword/{email}")
public String forgotPassword( @PathVariable("email")String emailid) {
	return UM.recoverPassword(emailid);
}
@PostMapping("/signin")
public String signIn(@RequestBody Users U) {
  return UM.validateCredentials(U.getEmail(), U.getPassword());
}

}


