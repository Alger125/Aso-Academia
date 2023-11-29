
package com.Pizzeria.Pizzeria.model;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Acceso implements Serializable {

    // Clase de modelo que representa la información de acceso (correo y contraseña)

    // Atributo que almacena el correo electrónico del usuario
    private String correo;

    // Atributo que almacena la contraseña del usuario
    private String password;
}
