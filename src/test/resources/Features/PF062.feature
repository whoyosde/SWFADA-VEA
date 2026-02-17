#language: es
@PF062
Característica: : PF062 - Presentar tras completar el borrador correctamente
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para presentar solicitud

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Presentar tras completar el borrador correctamente
    Cuando PF062 - se accede al borrador del procedimiento
    Y PF062 - se pulsa sobre el botón Completar del formulario
    Y PF062 - se cumplimenta el formulario
    Y PF062 - se pulsa el botón Guardar y cerrar
    Entonces PF062 - se valida que el formulario se guarde correctamente
    Cuando PF062 - se pulsa sobre el botón Aportar
    Y PF062 - se selecciona la opción Subir desde mi equipo
    Y PF062 - se adjunta el documento
    Y PF062 - se pulsa sobre el botón Aceptar
    Entonces PF062 - se valida que el documento se ha incorporado correctamente
    Cuando PF062 - se pulsa el botón Firmar documentos
    Y PF062 - se selecciona los documentos
    Y PF062 - se firman los documentos
    Entonces PF062 - se valida que los documentos se han firmado correctamente
    Y PF062 - se pulsa el botón Presentar solicitud
    Y PF062 - se valida que la solicitud se presento correctamente

