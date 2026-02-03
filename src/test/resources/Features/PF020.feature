#language: es
@PF020
Característica: PF020 - Acceso con certificado de persona física e inicio de solicitud
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para iniciar una solicitud

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies

  Esquema del escenario: Acceso con certificado de persona física e inicio de solicitud
    Dado PF020 - que se ingresa el nombre del procedimiento en el campo de busqueda "<procedimiento>"
    Cuando PF020 - se pulsa sobre el procedimiento filtrado
    Y PF020 - se pulsa sobre el botón Iniciar solicitud
    Y PF020 - se autentica con Certificado electrónico
    Entonces PF020 - se valida el acceso al borrador del procedimiento
    Ejemplos:
      | procedimiento                                |
      | Procedimiento para prueba de firma con clave |


