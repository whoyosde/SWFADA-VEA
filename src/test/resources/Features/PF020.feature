#language: es
@PF020
Característica: PF020 - Acceso con certificado de persona física e inicio de solicitud
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  para iniciar una solicitud

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y acepto los Cookies

  Esquema del escenario: Acceso con certificado de persona física e inicio de solicitud
    Dado PF020 - que se ingresa el nombre del procedimiento en el campo de busqueda "<procedimiento>"
    Cuando PF020 - pulso sobre el procedimento filtrado
    Y PF020 - pulso sobre el botón Iniciar solicitud
    Y PF020 - me autentico con Certificado electrónico
    Entonces PF020 - se accede al borrador del procedimiento
    Ejemplos:
      | procedimiento                                |
      | Procedimiento para prueba de firma con clave |


