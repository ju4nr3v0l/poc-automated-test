#Author: Laura y Juan
  #language: es

Característica: : Como usuario pagador deseo consultar mis creditos ingresando documento y tipo documentos

  @ingresoDocumentoTipoDocumento
  Escenario: : flujo normal consulta de creditos inicio
    Dado usuario ingresa a recaudo en linea
    Cuando aparezca el selector de tipos document
    Entonces deberá seleccionar el documento e ingresar el numero de documento