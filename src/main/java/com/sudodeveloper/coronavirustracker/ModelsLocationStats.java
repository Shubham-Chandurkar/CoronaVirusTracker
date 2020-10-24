package com.sudodeveloper.coronavirustracker;

public class ModelsLocationStats {
	
	private String state, country;
	private int latestTotalCount, difffromPrevDay, newCases;
	
	
	
	

	/**
	 * @return the newCases
	 */
	public int getNewCases() {
		return newCases;
	}

	/**
	 * @param newCases the newCases to set
	 */
	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}

	public int getDifffromPrevDay() {
		return difffromPrevDay;
	}
	
	public void setDifffromPrevDay(int difffromPrevDay) {
		this.difffromPrevDay = difffromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCount() {
		return latestTotalCount;
	}
	public void setLatestTotalCount(int latestTotalCount) {
		this.latestTotalCount = latestTotalCount;
	}
	@Override
	public String toString() {
		
		return "Stats{" +
		        "State = '" + state + '\'' +
		        ",Country='" + country + '\'' +
		        ",LatestTotalCases='" + latestTotalCount + '\'' +'}';
	
	}
	

}
