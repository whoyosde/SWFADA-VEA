#language: es
@PF033
Característica: PF033 - Incorporar documento opcional en formato físico con extensión no permitida
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para incorporar documento opcional inválido

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

    Escenario: Incorporar documento opcional en formato físico con extensión no permitida
      Cuando PF033 - se accede al borrador del procedimiento
      Y PF033 - se pulsa sobre el botón Aportar del documento opcional
      Y PF033 - se selecciona la opción Subir desde mi equipo
      Y PF033 - se adjunta el documento inválido
      Y PF033 - se ingresa la descripción
      Y PF033 - se pulsa sobre el botón Aceptar
      Entonces PF033 - se valida mensaje de error

