package com.island.decorator;

public class DroolsRunner {

	public static void main(String[] args) {

		DroolsService droolsService = new DroolsServiceNormalImpl();

		droolsService = new DroolsServiceWithThirdPartyCallImpl(droolsService);

		droolsService.runDrools();

		droolsService.afterRun();

	}

}
