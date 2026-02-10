#language: es
@PF026
Característica: PF026 - Incorporar documento obligatorio en formato físico con extensión válida
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para incorporar documento obligatorio

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

    Escenario: Incorporar documento obligatorio en formato físico con extensión válida
      Cuando PF026 - se accede al borrador del procedimiento
      Y PF026 - se pulsa sobre el botón Aportar
      Y PF026 - se selecciona la opción Subir desde mi equipo
      Y PF026 - se adjunta el documento
      Y PF026 - se pulsa sobre el botón Aceptar
      Entonces PF026 - se valida que el documento se ha incorporado correctamente

