package com.account.manage.server.main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.account.manage.server.main.model.AccountHistoryEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootRestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootRestApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
	}
	
	private String getRootUrl() {
		return "http://localhost:" + port;
	}
	
	@Test
	public void testgetAllAccounts() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/accounts",
				HttpMethod.GET, entity, String.class);

		Assert.assertNotNull(response.getBody());
	}

	@Test
	public void testgetAccountById() {
		AccountHistoryEntity account = restTemplate.getForObject(getRootUrl() + "/accounts/585309209", AccountHistoryEntity.class);
		System.out.println(account.getAccountNo());
		Assert.assertNotNull(account);
	}

}
