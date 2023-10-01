package com.hotong.GuessPersonalType.controller;

import com.hotong.GuessPersonalType.dto.DataModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GuessPersonalTypeController {

    @GetMapping("/data")
    public DataModel getData() {
        // 여기에서 원하는 데이터를 생성하거나 가져와서 반환합니다.
        DataModel data = new DataModel();
        data.setMessage("Hello from Spring Boot!");
        return data;
    }
}

