
package com.Pizzeria.Pizzeria.model;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Credencial implements Serializable {
    private static final long SerialVersionUID = 1L;
    
    private Usuario usuario;
    private String token;
    
}
