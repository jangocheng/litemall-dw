package org.tlh.dw.dto;

import lombok.Data;

/**
 * @author 离歌笑
 * @desc
 * @date 2020-12-14
 */
@Data
public class UserRegister extends UserBase {

    private String mobile;
    private String code;

}
