package com.fantasyeleague.main.player;

import net.rithms.riot.api.endpoints.summoner.dto.Summoner;

public class Player {

	private String summonerName;
	private String summonerId;
	private String id;
	private String iconId;
	
	public Player() {}
	
	public Player(Summoner sum){
		setSummonerName(sum.getName());
		setSummonerId(sum.getAccountId());
		setId(sum.getId());
		setIconId(String.valueOf(sum.getProfileIconId()));
	}

	public String getSummonerName() {
		return summonerName;
	}
	
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}
	
	public String getSummonerId() {
		return summonerId;
	}
	
	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getIconId() {
		return iconId;
	}


	public void setIconId(String iconId) {
		this.iconId = iconId;
	}
	
	
	
}
