package com.unicorn.srgasoline.scheduled;

import com.unicorn.srgasoline.service.RecordsService;
import com.unicorn.srgasoline.service.TieluSfyService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:43
 */
@EnableScheduling
@Component
@Log
public class SyncScheduledTask {

	@Autowired
	private RecordsService recordsService;


	@Autowired
	private TieluSfyService tieluSfyService;

	/**
	 *五分钟执行一次数据上报
	 */
	//@Scheduled(cron="0/30 * * * * ?")
	@Scheduled(cron="0 0/5 * * * ?")
	public void SyncScheduledTaskByHistory() {
		recordsService.syncRecords();
		tieluSfyService.syncTieluSfyList();
	}

}
