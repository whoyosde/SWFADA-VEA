#language: es
@PF032
Característica: PF032 - Incorporar documento opcional  en formato físico con extensión válida
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para incorporar documento opcional

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Registro de Licitadores de Andalucía PRU |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Incorporar documento opcional  en formato físico con extensión válida
    Cuando PF032 - se accede al borrador del procedimiento
    Y PF032 - se pulsa sobre el botón Aportar del documento opcional
    Y PF032 - se selecciona la opción Subir desde mi equipo
    Y PF032 - se adjunta el documento
    Y PF032 - se pulsa sobre el botón Aceptar
    Entonces PF032 - se valida que el documento opcional se ha incorporado correctamente

