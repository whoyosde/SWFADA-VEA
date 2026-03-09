#language: es
@PF068
Característica: : PF068 - Verificar que se pueda continuar un borrador a través de la funcionalidad "Continuar borrador"
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para continuar un borrador

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Verificar que se pueda continuar un borrador a través de la funcionalidad "Continuar borrador"
    Cuando PF068 - se accede al borrador del procedimiento
    Y PF068 - se pulsa sobre el botón Completar del formulario
    Y PF068 - se cumplimenta el formulario
    Y PF068 - se pulsa el botón Guardar y cerrar
    Entonces PF068 - se valida que el formulario se guarde correctamente
    Cuando PF068 - se pulsa sobre el botón Aportar
    Y PF068 - se selecciona la opción Subir desde mi equipo
    Y PF068 - se adjunta el documento
    Y PF068 - se pulsa sobre el botón Aceptar
    Entonces PF068 - se valida que el documento se ha incorporado correctamente
    Cuando PF068 - se pulsa el botón Firmar documentos
    Y PF068 - se selecciona los documentos
    Y PF068 - se firman los documentos
    Entonces PF068 - se valida que los documentos se han firmado correctamente
    Y PF068 - se obtiene el número del borrador
    Y PF068 - se cierra sesión
    Y PF068 - se ingresa al procedimiento
    Y PF068 - se pulsar sobre el botón Continuar Borrador
    Y PF068 - se selecciona la opción Lista de borradores
    Y PF068 - se autentica con Certificado electrónico
    Cuando PF068 - se accede al borrador
    Y PF068 - se pulsa el botón Presentar solicitud
    Entonces PF068 - se valida que la solicitud se presento correctamente

