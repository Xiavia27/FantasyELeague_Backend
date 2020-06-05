package com.fantasyeleague.main.api.riot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fantasyeleague.main.player.Player;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.constant.Platform;

@Component
public class RiotApiBridge {

	@Autowired
	RiotApiBridgeConfig riotApi;
	
	private RiotApi apiConnection() {
		ApiConfig config = new ApiConfig().setKey(riotApi.getKey());
		return new RiotApi(config);
	}
	
	public Player getPlayerByName(String name) {
		RiotApi conn = apiConnection();
		Player p = new Player();
		try {
			 p = new Player(conn.getSummonerByName(Platform.NA, name));
		} catch (RiotApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
}
