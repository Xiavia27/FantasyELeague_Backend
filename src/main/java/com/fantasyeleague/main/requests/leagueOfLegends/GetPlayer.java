package com.fantasyeleague.main.requests.leagueOfLegends;

import org.springframework.web.bind.annotation.RestController;

import com.fantasyeleague.main.api.riot.RiotApiBridge;
import com.fantasyeleague.main.player.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GetPlayer {

	@Autowired
	RiotApiBridge riotApi;
	
	@GetMapping("/player")
	public Player getPlayerByName(@RequestParam(value="name") String name) {
		return riotApi.getPlayerByName(name);

	}
	
	
}
