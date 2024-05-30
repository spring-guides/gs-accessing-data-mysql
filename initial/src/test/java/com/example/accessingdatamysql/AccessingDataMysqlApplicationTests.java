package com.example.accessingdatamysql;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;

@Testcontainers
@SpringBootTest
class AccessingDataMysqlApplicationTests {

	@Container
	@ServiceConnection
	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>(DockerImageName.parse("mysql:latest"));

	@Test
	void contextLoads() {
	}

}