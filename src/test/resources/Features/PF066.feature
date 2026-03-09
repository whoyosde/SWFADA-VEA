#language: es
@PF066
Característica: : PF066 - Verificar que se pueda localizar y continuar un borrador desde el listado de borrador con un solo interesado
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para verificar y continuar con el borrador

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Verificar que se pueda localizar y continuar un borrador desde el listado de borrador con un solo interesado
    Cuando PF066 - se accede al borrador del procedimiento
    Y PF066 - se pulsa sobre el botón Completar del formulario
    Y PF066 - se cumplimenta el formulario
    Y PF066 - se pulsa el botón Guardar y cerrar
    Entonces PF066 - se valida que el formulario se guarde correctamente
    Cuando PF066 - se pulsa sobre el botón Aportar
    Y PF066 - se selecciona la opción Subir desde mi equipo
    Y PF066 - se adjunta el documento
    Y PF066 - se pulsa sobre el botón Aceptar
    Entonces PF066 - se valida que el documento se ha incorporado correctamente
    Cuando PF066 - se pulsa el botón Firmar documentos
    Y PF066 - se selecciona los documentos
    Y PF066 - se firman los documentos
    Entonces PF066 - se valida que los documentos se han firmado correctamente
    Y PF066 - se obtiene el número del borrador
    Y PF066 - se cierra sesión
    Y PF066 - se autentica con Certificado electrónico
    Cuando PF066 - se accede al borrador
    Y PF066 - se pulsa el botón Presentar solicitud
    Entonces PF066 - se valida que la solicitud se presento correctamente

