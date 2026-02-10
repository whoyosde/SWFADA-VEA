#language: es
@PF022
Característica: : PF022 - Guardado de formulario externo obligatorio autenticado con certificado de persona física
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para completar formulario

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Presentación electrónica general |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico
    
    Escenario: Guardado de formulario externo obligatorio autenticado con certificado de persona física
      Cuando PF022 - se accede al borrador del procedimiento
      Y PF022 - se pulsa sobre el botón Completar del formulario
      Y PF022 - se cumplimenta el formulario
      Y PF022 - se pulsa el botón Guardar y cerrar
      Entonces PF022 - se valida que el formulario se guarde correctamente

