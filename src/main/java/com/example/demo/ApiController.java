package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping(path="/api/example",method=RequestMethod.POST)
	public Response example(@RequestBody Request bean) {

		Response response = new Response();

		if (bean.getId() == 1) {

			response.setCode(200);
			response.setMessage("normal end.");

		} else {

			response.setCode(404);
			response.setMessage("bad request.");
			response.setDescription("Please retry,you choice your id.");
		}

		return response;
	}
}
