#language: es
@PF044
Característica: PF044 - Eliminar un documento indicando que ya están en poder de la administración
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para eliminar documento que ya está en poder de la administración

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Esquema del escenario: Eliminar un documento indicando que ya están en poder de la administración
    Cuando PF044 - se accede al borrador del procedimiento
    Y PF044 - se pulsa sobre el botón Aportar
    Y PF044 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF044 - se cumplimenta los campos obligatorios: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>"
    Y PF044 - se pulsa sobre el botón Aceptar
    Entonces PF044 - se valida que el documento se ha incorporado correctamente
    Y PF044 - se pulsa sobre el botón Aportar del documento opcional
    Y PF044 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF044 - se cumplimenta los campos obligatorios del documento opcional: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>", "<descripcion>"
    Y PF044 - se pulsa sobre el botón Aceptar
    Entonces PF044 - se valida que el siguiente documento se ha incorporado correctamente
    Cuando PF044 - se pulsa sobre el icono Eliminar del documento obligatorio
    Y PF044 - se pulsa sobre el botón Eliminar
    Entonces PF044 - se valida que el documento se ha eliminado correctamente
    Y PF044 - se valida que la Autorización no se elimine del expediente
    Ejemplos:
      | documento         | procedimiento           | fecha      | consejeria | descripcion      |
      | AcuerdoOficio.pdf | Registro de Licitadores | 11/02/2026 | CHAP       | Documento prueba |

