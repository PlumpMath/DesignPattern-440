package com.island.decorator;

public class DroolsServiceWithThirdPartyCallImpl extends DroolsServiceDecorator {

	private String thirdCallResult = "thirdCallResult";

	public DroolsServiceWithThirdPartyCallImpl(DroolsService droolsService) {
		super(droolsService);
	}

	public void runDrools() {
		System.out.println("Call the third party service.");
		thirdCallResult = "Call the third party service sucess.";
		super.runDrools();
	}

	public void afterRun() {
		super.afterRun();
		System.out.println("Save the third call result into db, the result is:" + thirdCallResult);
	}

}
