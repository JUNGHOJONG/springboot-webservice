package com.davinci.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //GIVEN
        String name = "test";
        int amount = 500;

        //WHEN
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        //THEN
        Assertions.assertThat(helloResponseDto.getName()).isEqualTo(name);
        Assertions.assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}