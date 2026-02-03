#language: es
@PF023
Característica: : PF023 - Validar la presentación de la "Presentación electrónica general" con certificado de persona física
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para presentar solicitud

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    
    Esquema del escenario: Validar la presentación de la "Presentación electrónica general" con certificado de persona física
      Dado PF023 - que se ingresa el nombre del procedimiento en el campo de busqueda "<procedimiento>"
      Cuando PF023 - se pulsa sobre el procedimiento filtrado
      Y PF023 - se pulsa sobre el botón Iniciar solicitud
      Y PF023 - se autentica con Certificado electrónico
      Entonces PF023 - se accede al borrador del procedimiento
      Cuando PF023 - se pulsa sobre el botón Completar del formulario
      Y PF023 - se cumplimenta el formulario
      Y PF023 - se pulsa el botón Guardar y cerrar
      Y PF023 - se pulsa el botón Firmar documentos
      Y PF023 - se seleccionan los documentos a firmar
      Y PF023 - se firman los documentos
      Y PF023 - se pulsa el botón Presentar solicitud
      Entonces PF023 - se valida que la solicitud se presento correctamente
      Ejemplos:
        | procedimiento                    |
        | Presentación electrónica general |
      
