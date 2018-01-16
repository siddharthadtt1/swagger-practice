package practice.swagger.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import practice.swagger.demo.model.User;

@RestController
@RequestMapping(value = "/rest/user")
@Api(value="User Controller End point", description="Contains info related to User Controller")
public class UserController {
	
	@ApiOperation(value="Returns list of Users")
	@ApiResponses(value={
			@ApiResponse(code=100, message="100 is the success "), 
			@ApiResponse(code=200, message="Successful User list")
	})
	@GetMapping
	public List<User> getUserList() {
		return Arrays.asList(new User("John", 1000L), new User("Peter", 2000L));
	}

	@ApiOperation(value="Returns user based on input name")
	@PostMapping(value = "/{name}")
	public User getUser(@PathVariable("name") String name) {
		return new User(name, 2000L);
	}

}
