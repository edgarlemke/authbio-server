package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {

	@Autowired
	private TestRepository testRepository;

	@GetMapping("/")
	public String index() {
		Test test0 = testRepository.findById(1L);
		String test0_str = test0.toString();

		final String responseText = postVerify();

		return "Hello world!<br>" + test0_str + "<br>" + responseText;
	}

	private String postVerify() {
		RestTemplate restTemplate = new RestTemplate();
		//DeepFaceVerify deepFaceVerify = new DeepFaceVerify("img1_path.jpg", "img2_path.jpg");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String requestData = "{\"img1_path\": \"/verify/img1.jpg\", \"img2_path\": \"/verify/img2.jpg\"}";

		//HttpEntity<DeepFaceVerify> request = new HttpEntity<>(deepFaceVerify);
		HttpEntity<String> request = new HttpEntity<>(requestData, headers);

		final String url = "http://127.0.0.1:5000/verify";

		//ResponseEntity<DeepFaceVerifyResponse> result = restTemplate.postForEntity("https://localhost:5000", request, DeepFaceVerifyResponse.class);
		//DeepFaceVerifyResponse response = result.getBody();
		String responseText = restTemplate.exchange(url, HttpMethod.POST, request, String.class).getBody();

		return responseText;
	}
}
