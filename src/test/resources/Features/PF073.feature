#language: es
@PF073
Característica: PF073 - Eliminar un borrador autenticado con certificado de persona física
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para eliminar un borrador desde el Área personal
  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Cuando se acepta las Cookies

  Escenario: Eliminar un borrador autenticado con certificado de persona física
    Dado PF073 - que pulso sobre la acción Area privada de ventanilla
    Cuando PF073 - se autentica con Certificado electrónico
    Entonces PF073 - se valida el acceso al Area personal
    Cuando PF073 - se pulsa sobre las opciones del borrador
    Y PF073 - se selecciona la opción Eliminar borrador
    Y PF073 - se pulsa el botón Eliminar
    Entonces PF073 - se valida que el borrador se ha eliminado correctamente


    