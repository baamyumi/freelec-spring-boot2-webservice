package com.jojoldu.book.web.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloResponseDtoTest {

    @Test
    @DisplayName("롬복 기능 테스트")
    public void lombokTest(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertEquals(dto.getName(), name);
        assertEquals(dto.getAmount(), amount);
    }
}