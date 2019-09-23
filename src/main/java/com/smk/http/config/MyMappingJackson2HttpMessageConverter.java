package com.smk.http.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2018年12月6日 15:31:54
 */
public class MyMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
	public MyMappingJackson2HttpMessageConverter() {
		List<MediaType> mediaTypes = new ArrayList<>();
		mediaTypes.add(MediaType.TEXT_PLAIN);
		mediaTypes.add(MediaType.TEXT_HTML);  //加入text/html类型的支持
		setSupportedMediaTypes(mediaTypes);// tag6
	}
}
