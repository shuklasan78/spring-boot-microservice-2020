package com.opleiding.dms2.logger;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/logger")
@Slf4j
public class JavaLogger {

    @GetMapping("/one")

    public String getMessage()
    {
        
    	  log.trace("A TRACE Message");
    	  log.debug("A DEBUG Message");
    	  log.info("An INFO Message");
    	  log.warn("A WARN Message");
    	  log.error("An ERROR Message");
   
         
         return "Logger Created";

    }

    @GetMapping("/two")  //http://localhost:8082/restcontroller/mapvalues
    public Map<String, String> getNames() {
        log.debug("Started class: {} method: getNames", this.getClass());
        Map<String, String> o1 = new HashMap<String, String>();
        o1.put("Sandee", "40");
        o1.put("Veena", "35");
        o1.put("Jos", "50");
        o1.put("Bert", "55");
        o1.put("Dennis", "48");
        log.info("[GET] /logger/mapdetails/{} map={}", o1);

        return o1;
    }

    @GetMapping("/three")
    public ResponseEntity<String> getBaseUrl(@RequestHeader HttpHeaders headers) {
        log.debug("Started class: {} method: getBaseUrl", this.getClass());

        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        log.debug("[GET] /logger/getBaseUrl/{} url={}", headers);
        return new ResponseEntity<String>(String.format("Base URL = %s", url), HttpStatus.OK);
    }
}
