package com.seulgae.fmbootreact.seulgaebuilder.model;

import com.seulgae.fmbootreact.seulgaebuilder.dto.SeulgaeDTO;

public class Seulgae {
    private Long id;
    private String apiName;

    // Model에서 DTO로 변환하는 메서드
    public SeulgaeDTO seulgaeDTO() {
        return SeulgaeDTO.builder()
                .id(id)
                .apiName(apiName)
                .build();
    }

}
