#language: es
@PF040
Característica: PF040 - Descargar autorización que se encuentra en poder de la administración
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para descargar autorización de documento

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Esquema del escenario: Descargar autorización que se encuentra en poder de la administración
    Cuando PF040 - se accede al borrador del procedimiento
    Y PF040 - se pulsa sobre el botón Aportar
    Y PF040 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF040 - se cumplimenta los campos obligatorios: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>"
    Y PF040 - se pulsa sobre el botón Aceptar
    Entonces PF040 - se valida que el documento se ha incorporado correctamente
    Cuando PF040 - se pulsa sobre el icono descargar autorización
    Entonces PF040 - se valida que el documento se ha descargado correctamente

    Ejemplos:
      | documento         | procedimiento           | fecha      | consejeria |
      | AcuerdoOficio.pdf | Registro de Licitadores | 11/02/2026 | CHAP       |

