#language: es
@PF063
Característica: : PF063 - Validar la generación del número de expediente tras su presentación
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para validar la presentación

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Validar la generación del número de expediente tras su presentación
    Cuando PF063 - se accede al borrador del procedimiento
    Y PF063 - se pulsa sobre el botón Completar del formulario
    Y PF063 - se cumplimenta el formulario
    Y PF063 - se pulsa el botón Guardar y cerrar
    Entonces PF063 - se valida que el formulario se guarde correctamente
    Cuando PF063 - se pulsa sobre el botón Aportar
    Y PF063 - se selecciona la opción Subir desde mi equipo
    Y PF063 - se adjunta el documento
    Y PF063 - se pulsa sobre el botón Aceptar
    Entonces PF063 - se valida que el documento se ha incorporado correctamente
    Cuando PF063 - se pulsa el botón Firmar documentos
    Y PF063 - se selecciona los documentos
    Y PF063 - se firman los documentos
    Entonces PF063 - se valida que los documentos se han firmado correctamente
    Y PF063 - se pulsa el botón Presentar solicitud
    Y PF063 - se valida que la solicitud se presento correctamente
    Cuando PF063 - se pulsa sobre Área privada de ventanilla
    Y PF063 - se pulsa sobre la pestaña Presentaciones
    Entonces PF063 - se valida que se muestre el expediente presentado
    Cuando PF063 - se pulsa sobre la Presentación
    Y PF063 - se pulsa sobre el botón Descargar de la presentación
    Entonces PF063 - se valida que el numero de expediente sea el correcto en el archivo PDF
