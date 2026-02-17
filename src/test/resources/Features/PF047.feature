#language: es
@PF047
Característica: PF047 - Firmar documento obligatorio que ya está en poder de la administración
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para firmar documento indicando que ya está en poder de la administración

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies
    Y se ingresa el nombre del procedimiento en el campo de busqueda
      | Procedimiento para prueba de firma con clave |
    Y se pulsa sobre el procedimiento filtrado
    Y se pulsa sobre el botón Iniciar solicitud
    Y se autentica con Certificado electrónico

  Esquema del escenario: Firmar documento obligatorio que ya está en poder de la administración
    Cuando PF047 - se accede al borrador del procedimiento
    Y PF047 - se cumplimenta el formulario
    Y PF047 - se pulsa sobre el botón Aportar
    Y PF047 - se selecciona la opción Indicar documentación que ya tiene la administración
    Y PF047 - se cumplimenta los campos obligatorios: "<documento>", "<procedimiento>", "<fecha>", "<consejeria>"
    Y PF047 - se pulsa sobre el botón Aceptar
    Entonces PF047 - se valida que el documento se ha incorporado correctamente
    Cuando PF047 - se pulsa el botón Firmar documentos
    Y PF047 - se selecciona el documento aportado
    Y PF047 - se firma el documento
    Entonces PF047 - se valida que el documento se ha firmado correctamente
    Ejemplos:
      | documento         | procedimiento           | fecha      | consejeria |
      | AcuerdoOficio.pdf | Registro de Licitadores | 11/02/2026 | CHAP       |

