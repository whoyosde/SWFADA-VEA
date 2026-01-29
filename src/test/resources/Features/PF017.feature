#language: es
@PF017
Característica: PF017 - Acceso con certificado digital de persona física al área privada de ventanilla
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  para acceder al área personal

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y acepto los Cookies

  Escenario: Acceso con certificado digital de persona física al área privada de ventanilla
    Dado PF017 - que pulso sobre la acción Area privada de ventanilla
    Cuando PF017 - me autentico con Certificado electrónico
    Entonces PF017 - accedo al Area personal

    