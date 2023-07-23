package org.msa.item.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "history-service")
public interface HistoryFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "/v1/history/save")
	String saveHistory(Map<String, Object> paramMap);
}
