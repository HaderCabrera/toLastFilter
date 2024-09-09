package com.crud.demo_crud.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonaDTO {
    Long id;
    String ubicacion;
    String position;
    String FullName;
    String image;
}
