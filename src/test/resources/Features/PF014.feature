#language: es
@PF014
Característica: PF014 - Acceder a procedimiento desde búsqueda de procedimientos predictiva
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para realizar una búsqueda predictiva

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies

  Esquema del escenario: Acceder a procedimiento desde búsqueda de procedimientos predictiva
    Dado PF014 - que se ingresa el nombre del procedimiento en el campo de busqueda "<procedimiento>"
    Cuando PF014 - se pulsa sobre el procedimiento filtrado
    Entonces PF014 - se accede al detalle del procedimiento
    Ejemplos:
      | procedimiento                            |
      | Registro de Licitadores de Andalucía PRU |


