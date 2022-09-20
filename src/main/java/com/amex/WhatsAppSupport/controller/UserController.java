package com.amex.WhatsAppSupport.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.WhatsAppSupport.entity.AccountType;
import com.amex.WhatsAppSupport.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private Map<String, User> userMap;

	@GetMapping("/balance")
	public float getBalance(@RequestHeader("id") String id) {
		return userMap.get(id).getCurrentBalance();
	}

	@GetMapping("/transaction")
	public List<String> getTransactions(@RequestHeader String id, @RequestHeader AccountType accountType) {
		Map<AccountType, List<String>> map = userMap.get(id).getTransactions();
		return map.get(accountType);
	}
	
	@GetMapping("/offers")
	public List<String> getOffers(@RequestHeader String id, @RequestHeader AccountType accountType) {
		Map<AccountType, List<String>> map = userMap.get(id).getOffers();
		return map.get(accountType);
	}
	
	@GetMapping("/cardStatus")
	public String getCardStatus(@RequestHeader String id, @RequestHeader AccountType accountType) {
		if( userMap.get(id).getCardStatus().get(accountType) == true) {
			return "ACTIVE";
		}else {
			return "AccountType is not present!!";
		}
	}
	
	@GetMapping("/membershipRewards")
	public Integer getRewards(@RequestHeader String id, @RequestHeader AccountType accountType) {
		return userMap.get(id).getMembershipRewards().get(accountType);
	}


}
