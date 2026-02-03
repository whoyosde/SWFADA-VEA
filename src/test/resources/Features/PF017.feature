#language: es
@PF017
Característica: PF017 - Acceso con certificado digital de persona física al área privada de ventanilla
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma Vea Cloud
  Para acceder al área personal

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Vea Cloud
    Y se acepta las Cookies

  Escenario: Acceso con certificado digital de persona física al área privada de ventanilla
    Dado PF017 - que pulso sobre la acción Area privada de ventanilla
    Cuando PF017 - se autentica con Certificado electrónico
    Entonces PF017 - valido el acceso al Area personal

    