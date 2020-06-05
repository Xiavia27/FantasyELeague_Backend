package com.fantasyeleague.main.api.riot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("riotapi")
public class RiotApiBridgeConfig {
	private String key;
	
	public String getKey() { return key; }
	public void setKey(String newKey) { key = newKey; }
}
