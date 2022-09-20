package com.amex.WhatsAppSupport.entity;

import java.util.List;
import java.util.Map;

public class User {

	private String id;
	private String name;
	private int age;
	private List<AccountType> accountType;
	private float currentBalance;
	private String countryName;
	private String memberSince;
	private Map<AccountType, List<String>> transactions;
	private Map<AccountType, Boolean> cardStatus;
	private Map<AccountType, List<String>> offers;
	private Map<AccountType, Integer> membershipRewards;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<AccountType> getAccountType() {
		return accountType;
	}

	public void setAccountType(List<AccountType> accountType) {
		this.accountType = accountType;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}

	public Map<AccountType, List<String>> getTransactions() {
		return transactions;
	}

	public void setTransactions(Map<AccountType, List<String>> transactions) {
		this.transactions = transactions;
	}

	public Map<AccountType, Boolean> getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(Map<AccountType, Boolean> cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Map<AccountType, List<String>> getOffers() {
		return offers;
	}

	public void setOffers(Map<AccountType, List<String>> offers) {
		this.offers = offers;
	}

	public Map<AccountType, Integer> getMembershipRewards() {
		return membershipRewards;
	}

	public void setMembershipRewards(Map<AccountType, Integer> membershipRewards) {
		this.membershipRewards = membershipRewards;
	}

}
