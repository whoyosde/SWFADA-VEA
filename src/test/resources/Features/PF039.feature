#language: es
@PF039
Característica: PF039 - Incorporar un documento obligatorio indicando que ya está en poder de la administración
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para incorporar documento indicando que ya está en poder de la administración

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Esquema del escenario: Incorporar un documento obligatorio indicando que ya está en poder de la administración
    Cuando PF039 - se accede al borrador del procedimiento
    Y PF039 - se pulsa sobre el botón Aportar
    Y PF039 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF039 - se cumplimenta los campos obligatorios: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>"
    Y PF039 - se pulsa sobre el botón Aceptar
    Entonces PF039 - se valida que el documento se ha incorporado correctamente
    Ejemplos:
      | documento         | procedimiento           | fecha      | consejeria |
      | AcuerdoOficio.pdf | Registro de Licitadores | 11/02/2026 | CHAP       |

