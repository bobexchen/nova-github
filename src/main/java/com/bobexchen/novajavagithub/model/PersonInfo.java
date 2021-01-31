package com.bobexchen.novajavagithub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonInfo {
    @JsonProperty("nick_name")
    private String nickname;

    private String trueName;

    @JsonProperty("telephone_number")
    private String phoneNumber;

    private Integer age;

    private String password;
}
