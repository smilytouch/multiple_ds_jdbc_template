package com.demo.controller;

import com.demo.config.DataSourceConfig;
import com.demo.model.rls.RlsData;
import com.demo.repository.rls.RlsDataRepository;
import com.demo.repository.wfi.WfiDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackageClasses = {
		DataSourceConfig.class,
		WfiDataRepository.class,
		RlsDataRepository.class})
public class RlsEventManager implements CommandLineRunner {

	@Autowired
	RlsDataRepository rlsDataRepository;

	@Autowired
	WfiDataRepository wfiDataRepository;

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(RlsEventManager.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		rlsDataRepository.findAll().stream().forEach(System.out::println);
//		wfiDataRepository.findAll().stream().forEach(System.out::println);
//		System.out.println(rlsDataRepository.findById(2));;
//		rlsDataRepository.deleteById(8);
//		rlsDataRepository.save(new RlsData(8,"Sanjay Swain"));
//		rlsDataRepository.update(new RlsData(null,"Ganesh Swain"),8);
//		System.out.println(rlsDataRepository.findById(8));
		System.out.println(env.getProperty("message"));
	}
}
