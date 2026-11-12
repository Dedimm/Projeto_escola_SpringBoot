package com.example.projeto_escola.dtos;

import com.example.projeto_escola.validations.NomeCursoValidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
public class CursoRequestDTO {
    private Long id;
    @NotEmpty(message="O nome do curso não pode ser vazio")
    @NomeCursoValidation  
    private String nome;
    @Min(value =1, message="Carga horário deve ser maior que zero")
    @Max(value = 5000, message="Carga horária deve ser menor que 5000")
    private Integer cargaHoraria;
    private Long categoriaId;

    public CursoRequestDTO(Long id, String nome, Integer cargaHoraria, Long categoriaId) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.categoriaId = categoriaId;
    }
}
