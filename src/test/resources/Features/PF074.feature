#language: es
@PF074
Característica: PF074 - Duplicar un borrador
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para duplicar un borrador desde el Área personal
  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Cuando se acepta las Cookies

  Escenario: Duplicar un borrador
    Dado PF074 - que pulso sobre la acción Area privada de ventanilla
    Cuando PF074 - se autentica con Certificado electrónico
    Entonces PF074 - se valida el acceso al Area personal
    Cuando PF074 - se pulsa sobre las opciones del borrador
    Y PF074 - se selecciona la opción Duplicar borrador
    Entonces PF074 - se valida que el borrador se ha duplicado correctamente


    