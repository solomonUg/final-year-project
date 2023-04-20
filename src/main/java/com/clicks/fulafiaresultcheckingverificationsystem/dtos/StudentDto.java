package com.clicks.fulafiaresultcheckingverificationsystem.dtos;

import java.util.List;

public record StudentDto(
        String name,
        String phone,
        String matric,
        String email,
        String department,
        Boolean checked,
        List<CourseDto> courses

) {
}
