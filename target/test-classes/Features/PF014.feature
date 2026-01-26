#language: es
@PF014
Característica: PF014 - Acceder a procedimiento desde búsqueda de procedimientos predictiva
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  para realizar una búsqueda predictiva

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y acepto los Cookies

  Esquema del escenario: Acceder a procedimiento desde búsqueda de procedimientos predictiva
    Dado PF014 - que se ingresa el nombre del procedimiento en el campo de busqueda "<procedimiento>"
    Cuando PF014 - pulso sobre el procedimento filtrado
    Entonces PF014 - se accede al detalle del procedimiento
    Ejemplos:
      | procedimiento                            |
      | Registro de Licitadores de Andalucía PRU |


