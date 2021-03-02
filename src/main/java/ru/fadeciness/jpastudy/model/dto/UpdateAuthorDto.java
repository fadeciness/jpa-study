package ru.fadeciness.jpastudy.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAuthorDto {

    private Long id;
    private String firstName;
    private String lastName;

}
