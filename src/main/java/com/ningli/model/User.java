package com.ningli.model;


import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tomlee
 * @program: lining
 * @Date: 2019/8/3 16:27
 * @Description:
 */

@Setter
@Getter
@Accessors(chain= true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    private int age;
    private String name;
    private String position;
    private String hobby;
    private Date dateTime;
    private String remark1;
    private String remark2;
    private String remark3;

}
