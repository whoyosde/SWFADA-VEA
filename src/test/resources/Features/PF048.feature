#language: es
@PF048
Característica: PF048 - Eliminar firma de documento obligatorio que ya está en poder de la administración
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para eliminar firma del documento autorizado

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Esquema del escenario: Eliminar firma de documento obligatorio que ya está en poder de la administración
    Cuando PF048 - se accede al borrador del procedimiento
    Y PF048 - se cumplimenta el formulario
    Y PF048 - se pulsa sobre el botón Aportar
    Y PF048 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF048 - se cumplimenta los campos obligatorios: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>"
    Y PF048 - se pulsa sobre el botón Aceptar
    Entonces PF048 - se valida que el documento se ha incorporado correctamente
    Cuando PF048 - se pulsa el botón Firmar documentos
    Y PF048 - se selecciona el documento aportado
    Y PF048 - se firma el documento
    Entonces PF048 - se valida que el documento se ha firmado correctamente
    Cuando PF048 - se pulsa el icono eliminar firma
    Y PF048 - se pulsa sobre el botón Borrar firma
    Entonces PF048 - se valida que la firma se ha eliminado correctamente
    Ejemplos:
      | documento         | procedimiento           | fecha      | consejeria |
      | AcuerdoOficio.pdf | Registro de Licitadores | 11/02/2026 | CHAP       |

