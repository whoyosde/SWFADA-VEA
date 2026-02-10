#language: es
@PF027
Característica: PF027 - Incorporar documento obligatorio en formato físico con extensión no permitida
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para incorporar documento inválido

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

    Escenario: Incorporar documento obligatorio en formato físico con extensión no permitida
      Cuando PF027 - se accede al borrador del procedimiento
      Y PF027 - se pulsa sobre el botón Aportar
      Y PF027 - se selecciona la opción Subir desde mi equipo
      Y PF027 - se adjunta el documento inválido
      Y PF027 - se pulsa sobre el botón Aceptar
      Entonces PF027 - se valida mensaje de error

