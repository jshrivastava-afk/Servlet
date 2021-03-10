package com.ltts.modal;

public class Auction {
	
	private int auc_id;
	private int Player_id;
	private int team_id;
	private String year1;
	private int sold_price;
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auction(int auc_id, int player_id, int team_id, String year1, int sold_price) {
		super();
		this.auc_id = auc_id;
		Player_id = player_id;
		this.team_id = team_id;
		this.year1 = year1;
		this.sold_price = sold_price;
	}
	public int getAuc_id() {
		return auc_id;
	}
	public void setAuc_id(int auc_id) {
		this.auc_id = auc_id;
	}
	public int getPlayer_id() {
		return Player_id;
	}
	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getYear1() {
		return year1;
	}
	public void setYear(String year1) {
		this.year1 = year1;
	}
	
	public int getSold_price() {
		return sold_price;
	}
	public void setSold_price(int sold_price) {
		this.sold_price = sold_price;
	}
	@Override
	public String toString() {
		return "Auction [auc_id=" + auc_id + ", Player_id=" + Player_id + ", team_id=" + team_id + ", year=" + year1
				+ ", sold_price=" + sold_price + "]";
	}
	
	
	

}
