#language: es
@PF056
Característica: PF056 - Eliminar un documento obligatorio firmado
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para eliminar documento firmado

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Escenario: Eliminar un documento obligatorio firmado
    Cuando PF056 - se accede al borrador del procedimiento
    Y PF056 - se cumplimenta el formulario
    Y PF056 - se pulsa sobre el botón Aportar
    Y PF056 - se selecciona la opción Subir desde mi equipo
    Y PF056 - se adjunta el documento
    Y PF056 - se pulsa sobre el botón Aceptar
    Entonces PF056 - se valida que el documento se ha incorporado correctamente
    Cuando PF056 - se pulsa el botón Firmar documentos
    Y PF056 - se selecciona el documento aportado
    Y PF056 - se firma el documento
    Entonces PF056 - se valida que el documento se ha firmado correctamente
    Cuando PF056 - se pulsa el icono eliminar documento
    Y PF056 - se pulsa sobre el botón Borrar
    Entonces PF056 - se valida que el documento se ha eliminado correctamente


