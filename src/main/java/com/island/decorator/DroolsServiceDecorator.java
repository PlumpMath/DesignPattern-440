package com.island.decorator;

/**
 * Drools服务的装饰类
 * 
 * @author davidyin
 * @date 2017/04/23
 *
 */
public abstract class DroolsServiceDecorator extends DroolsService {

	private DroolsService droolsService;

	public DroolsServiceDecorator(DroolsService droolsService) {
		this.droolsService = droolsService;
	}

	public void runDrools() {
		this.droolsService.runDrools();
	}

	public void afterRun() {
		this.droolsService.afterRun();
	}

}
