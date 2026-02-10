#language: es
@PF021
Característica: PF021 - Precarga formulario externo autenticado con certificado de persona física
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para precargar formulario

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Presentación electrónica general |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Precarga formulario externo autenticado con certificado de persona física
    Cuando PF021 - se valida el acceso al borrador del procedimiento
    Y PF021 - se pulsa sobre el botón Completar del formulario
    Entonces PF021 - se valida que el formulario se abre correctamente



