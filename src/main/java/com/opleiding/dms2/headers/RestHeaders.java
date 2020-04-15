package com.opleiding.dms2.headers;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/header")
public class RestHeaders {


    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestHeader("accept-language") String language) {
        // code that uses the language variable
        return new ResponseEntity<String>("Greeting, I received the header value = " + language, HttpStatus.OK);
    }

    @GetMapping("/listHeaders")
    public ResponseEntity<Map<String, String>> listAllHeaders(
            @RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println("Header Value are :" + (String.format("Header '%s' = %s", key, value)));
        });

        return new ResponseEntity<Map<String, String>>(headers, HttpStatus.OK);
    }

    @GetMapping("/multiValue")
    public ResponseEntity<String> multiValue(
            @RequestHeader MultiValueMap<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println("Header Value are :" + (String.format(
                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|")))));
        });

        return new ResponseEntity<String>(
                String.format("Listed %d headers", headers.size()), HttpStatus.OK);
    }

    @GetMapping("/getBaseUrl")
    public ResponseEntity<String> getBaseUrl(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        return new ResponseEntity<String>(String.format("Base URL = %s", url), HttpStatus.OK);
    }
}
