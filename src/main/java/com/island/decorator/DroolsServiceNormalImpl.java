package com.island.decorator;

public class DroolsServiceNormalImpl extends DroolsService {

	private Integer status = 0;

	public DroolsServiceNormalImpl() {

	}

	public void runDrools() {
		status = 1;
		System.out.println("Current status in runDrools is:" + status);
	}

	public void afterRun() {
		System.out.println("Current status in afterRun is:" + status);
	}

}
