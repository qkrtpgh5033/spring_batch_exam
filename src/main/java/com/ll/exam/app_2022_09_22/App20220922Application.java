package com.ll.exam.app_2022_09_22;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing // 얘를 사용해야 배치가 됨. ( 작업을 위한 DB 테이블이 생성 )
public class App20220922Application {

	public static void main(String[] args) {
		SpringApplication.run(App20220922Application.class, args);
	}

}
