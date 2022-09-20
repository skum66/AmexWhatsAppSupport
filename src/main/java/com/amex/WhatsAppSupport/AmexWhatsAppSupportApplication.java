package com.amex.WhatsAppSupport;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amex.WhatsAppSupport.entity.AccountType;
import com.amex.WhatsAppSupport.entity.User;

@SpringBootApplication
public class AmexWhatsAppSupportApplication {

	static Map<String, User> amexUser = new HashMap<>();
	
	public static void main(String[] args) {
		SpringApplication.run(AmexWhatsAppSupportApplication.class, args);
	}

    @Bean
    Map<String, User> getUsers()
    {
        return amexUser;
    }
	
	static {
		User user1 = new User();
		user1.setId("8976452390");
		user1.setName("Surabhi Kumari");
		user1.setAge(25);
		user1.setAccountType(
				Arrays.asList(AccountType.American_Express_Platinum_Card, AccountType.American_Express_Gold_Card));
		user1.setCurrentBalance(1000);
		user1.setCountryName("India");
		user1.setMemberSince("2010");

		Map<AccountType, List<String>> transactions = new HashMap<>();
		transactions.put(AccountType.American_Express_Platinum_Card, Arrays.asList("1000", "2000", "1500", "30000"));
		transactions.put(AccountType.American_Express_Gold_Card, Arrays.asList("4000", "6000", "1500", "1000"));
		user1.setTransactions(transactions);

		Map<AccountType, Boolean> cardStatus = new HashMap<>();
		cardStatus.put(AccountType.American_Express_Platinum_Card, true);
		cardStatus.put(AccountType.American_Express_Gold_Card, false);
		user1.setCardStatus(cardStatus);

		Map<AccountType, List<String>> offers = new HashMap<>();
		offers.put(AccountType.American_Express_Platinum_Card,
				Arrays.asList("A 10% discount on a minimum Lladró purchase of ₹75,000/-",
						"Get 15%* off on a minimum spend of ₹10,000"));
		offers.put(AccountType.American_Express_Gold_Card,
				Arrays.asList("Get 15% discount on all artworks", "Get flat 20% off on minimum purchase of ₹1199"));
		user1.setOffers(offers);

		Map<AccountType, Integer> membershipRewards = new HashMap<>();
		membershipRewards.put(AccountType.American_Express_Platinum_Card, 10000);
		membershipRewards.put(AccountType.American_Express_Gold_Card, 20000);
		user1.setMembershipRewards(membershipRewards);

		User user2 = new User();
		user2.setId("9089786756");
		user2.setName("Parvinder Singh");
		user2.setAge(30);
		user2.setAccountType(
				Arrays.asList(AccountType.American_Express_SmartEarn_Credit_Card, AccountType.American_Express_Membership_Rewards_Credit_Card));
		user2.setCurrentBalance(50000);
		user2.setCountryName("India");
		user2.setMemberSince("1008");

		Map<AccountType, List<String>> transactions1 = new HashMap<>();
		transactions1.put(AccountType.American_Express_SmartEarn_Credit_Card, Arrays.asList("1200", "2000", "1300", "10000"));
		transactions1.put(AccountType.American_Express_Membership_Rewards_Credit_Card, Arrays.asList("4000", "7005", "3200", "6100"));
		user2.setTransactions(transactions1);
		
		Map<AccountType, Boolean> cardStatus1 = new HashMap<>();
		cardStatus1.put(AccountType.American_Express_SmartEarn_Credit_Card, true);
		cardStatus1.put(AccountType.American_Express_Membership_Rewards_Credit_Card, false);
		user2.setCardStatus(cardStatus1);
		
		Map<AccountType, List<String>> offers1 = new HashMap<>();
		offers1.put(AccountType.American_Express_SmartEarn_Credit_Card,
				Arrays.asList("Get 20% Instant discount at www.interflora.in. Promocode: AMEX20",
						"Get 10% off when shopping at Pottery Barn"));
		offers1.put(AccountType.American_Express_Membership_Rewards_Credit_Card,
				Arrays.asList("Get up to ₹ 15000 discount on Archer Art Gallery", "Get up to 25%* off on timeless decorations"));
		user2.setOffers(offers1);
		
		Map<AccountType, Integer> membershipRewards1 = new HashMap<>();
		membershipRewards1.put(AccountType.American_Express_SmartEarn_Credit_Card, 30000);
		membershipRewards1.put(AccountType.American_Express_Membership_Rewards_Credit_Card, 15000);
		user2.setMembershipRewards(membershipRewards1);
		
		User user3 = new User();
		user3.setId("9876543210");
		user3.setName("Mohit Juneja");
		user3.setAge(29);
		user3.setAccountType(
				Arrays.asList(AccountType.American_Express_SmartEarn_Credit_Card, AccountType.American_Express_Platinum_Travel_Credit_Card));
		user3.setCurrentBalance(20500);
		user3.setCountryName("India");
		user3.setMemberSince("2015");

		Map<AccountType, List<String>> transactions2 = new HashMap<>();
		transactions2.put(AccountType.American_Express_SmartEarn_Credit_Card, Arrays.asList("11000", "43000", "13000", "4000"));
		transactions2.put(AccountType.American_Express_Platinum_Travel_Credit_Card, Arrays.asList("17000", "72000", "13200", "16100"));
		user3.setTransactions(transactions2);
		
		Map<AccountType, Boolean> cardStatus2 = new HashMap<>();
		cardStatus2.put(AccountType.American_Express_SmartEarn_Credit_Card, true);
		cardStatus2.put(AccountType.American_Express_Platinum_Travel_Credit_Card, false);
		user3.setCardStatus(cardStatus2);
		
		Map<AccountType, List<String>> offers2 = new HashMap<>();
		offers2.put(AccountType.American_Express_SmartEarn_Credit_Card,
				Arrays.asList("Get 20% Instant discount at www.interflora.in. Promocode: AMEX20",
						"Get 10% off when shopping at Pottery Barn"));
		offers2.put(AccountType.American_Express_Platinum_Travel_Credit_Card,
				Arrays.asList("Get up to ₹ 15000 discount on Archer Art Gallery", "Get up to 25%* off on timeless decorations"));
		user3.setOffers(offers2);
		
		Map<AccountType, Integer> membershipRewards2 = new HashMap<>();
		membershipRewards2.put(AccountType.American_Express_SmartEarn_Credit_Card, 30000);
		membershipRewards2.put(AccountType.American_Express_Platinum_Travel_Credit_Card, 15000);
		user3.setMembershipRewards(membershipRewards2);
		
		amexUser.put(user1.getId(), user1);
		amexUser.put(user2.getId(), user2);
		amexUser.put(user3.getId(), user3);
	}

}
