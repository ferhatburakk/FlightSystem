package com.iu.flightsystem.model.viewobject;

public class CustomerFlightVO {
	private Long FLIGHT_ID;

	private Long CUSTOMER_ID;

	private Long PLANE_ID;

	private String FLIGHT_DATE;

	private Long FLIGHT_PRICE;

	private Long FROM_WHERE;

	private Long TO_WHERE;

	public Long getFLIGHT_ID() {
		return FLIGHT_ID;
	}

	public void setFLIGHT_ID(Long fLIGHT_ID) {
		FLIGHT_ID = fLIGHT_ID;
	}

	public Long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(Long cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public Long getPLANE_ID() {
		return PLANE_ID;
	}

	public void setPLANE_ID(Long pLANE_ID) {
		PLANE_ID = pLANE_ID;
	}

	public String getFLIGHT_DATE() {
		return FLIGHT_DATE;
	}

	public void setFLIGHT_DATE(String fLIGHT_DATE) {
		FLIGHT_DATE = fLIGHT_DATE;
	}

	public Long getFLIGHT_PRICE() {
		return FLIGHT_PRICE;
	}

	public void setFLIGHT_PRICE(Long fLIGHT_PRICE) {
		FLIGHT_PRICE = fLIGHT_PRICE;
	}

	public Long getFROM_WHERE() {
		return FROM_WHERE;
	}

	public void setFROM_WHERE(Long fROM_WHERE) {
		FROM_WHERE = fROM_WHERE;
	}

	public Long getTO_WHERE() {
		return TO_WHERE;
	}

	public void setTO_WHERE(Long tO_WHERE) {
		TO_WHERE = tO_WHERE;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	private String CUSTOMER_NAME;
}
