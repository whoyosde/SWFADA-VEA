#language: es
@PF057
Característica: PF057 - Eliminar un documento opcional firmado
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para eliminar documento opcional firmado

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Registro de Licitadores de Andalucía PRU |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Eliminar un documento opcional firmado
    Cuando PF057 - se accede al borrador del procedimiento
    Y PF057 - se adjunta documento obligatorio
    Y PF057 - se pulsa sobre el botón Aportar del documento opcional
    Y PF057 - se selecciona la opción Subir desde mi equipo
    Y PF057 - se adjunta el documento
    Y PF057 - se pulsa sobre el botón Aceptar
    Entonces PF057 - se valida que el documento opcional se ha incorporado correctamente
    Cuando PF057 - se pulsa el botón Firmar documentos
    Y PF057 - se selecciona el documento aportado
    Y PF057 - se firma el documento
    Entonces PF057 - se valida que el documento se ha firmado correctamente
    Cuando PF057 - se pulsa el icono eliminar documento opcional
    Y PF057 - se pulsa sobre el botón Borrar
    Entonces PF057 - se valida que el documento opcional se ha eliminado correctamente


