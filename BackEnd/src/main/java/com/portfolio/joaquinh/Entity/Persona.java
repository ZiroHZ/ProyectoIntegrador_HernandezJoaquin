
package com.portfolio.joaquinh.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona {
    @Id //el primer campo será un ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //EL segundo campo será autogenerado
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud") 
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud") 
    private String apellido;
    
    
    @Size(min = 1, max = 50, message = "No cumple con la longitud") 
    private String img;
    
    
}
