/**
 * wsGestplusAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.microplus.wsGestplus.models

import java.io.Serializable

/**
 *
 * @param subscricaoorigem
 * @param iddoc
 * @param isoriginal
 * @param descontogarantia
 * @param descontoClienteValor
 * @param descontoFinanceiroValor
 * @param descontoCliente
 * @param descontofinanceiro
 * @param mbWayNumero
 * @param mbWaytoken
 * @param mbWaytokenDone
 * @param origemID
 * @param erro
 * @param docID
 * @param docIDOrigem
 * @param docIDHistorico
 * @param armazemNome
 * @param estado
 * @param textoEmail
 * @param isManual
 * @param isImportDoc
 * @param exportadoSAFT
 * @param exportadoData
 * @param objDadosHash
 * @param anulado
 * @param anuladoData
 * @param localDescarga
 * @param localCarga
 * @param objlinhas
 * @param objTotais
 * @param objTotaisConverted
 * @param objTaxas
 * @param objCliente
 * @param isDocumentoSAFT
 * @param isDocumentTransporte
 * @param objTipoDocumento
 * @param datapedido
 * @param dataconclusao
 * @param ticketN
 * @param idTicketPrioridade
 * @param servicoperiodicidade
 * @param servicodataproximoalerta
 * @param servicodescricao
 * @param servicoid
 * @param gestplusIDCliente
 * @param gestplusPeriodicidade
 * @param gestplusDataProximoAlerta
 * @param avencaNPrestacoes
 * @param avencaNPrestacoesDone
 * @param avencaNPrestacoesPaid
 * @param docnome
 * @param idlogin
 * @param documentonumero
 * @param documentotipo
 * @param documentoloja
 * @param documentoSerie
 * @param documentoprograma
 * @param idserie
 * @param serie
 * @param nif
 * @param idMesa
 * @param pago
 * @param pagotot
 * @param docCli
 * @param &#x60;data&#x60;
 * @param dataInicio
 * @param dataFim
 * @param prioricidade
 * @param dataPagamento
 * @param vencomendaonline
 * @param vreferencia
 * @param numeroenc
 * @param objTipoPagamentoDocumento
 * @param apartirdesubscricao
 * @param facturaassociadaagt
 * @param confirmartipopagamento
 * @param talaorecibo
 * @param vendadirecta
 * @param pos
 * @param moeda
 * @param obs
 * @param pendenteRevendedor
 * @param eLicElectronica
 * @param idClienteRetalhista
 * @param idLicTemp
 * @param dataaprovacaoliceletronica
 * @param rascunhoTDoc
 * @param rascunhodocid
 * @param versionCert
 * @param titulo
 * @param idTecnico
 * @param idEstadoTecnico
 * @param docforn
 * @param idbancoconta
 * @param clienteNome
 * @param clienteMorada
 * @param clienteCidade
 * @param clienteCodPost
 * @param clientePais
 * @param clientePaisID
 * @param nCartao
 * @param geraMB
 * @param motAnulado
 * @param entidade
 * @param referencia
 * @param vencimentoobs
 * @param troco
 * @param cdgoPedNumero
 * @param nomeComercial
 * @param idTransportadora
 * @param nTransporte
 * @param irsTexto
 * @param valorPago
 * @param valorSaldado
 * @param tipoDescontoRecibo
 * @param descontoRecibo
 * @param valorAposDescontoRec
 * @param invoiceStatus
 * @param estadoDoc
 * @param dataEntrega
 * @param estadoData
 * @param numeradoroffline
 * @param idLojaEntrega
 * @param sourceBilling
 * @param idContacto
 * @param idClienteFAC
 * @param confirmacaoPagamento
 * @param userConfirmacaoPagamento
 * @param referenciaValorPago
 * @param referenteDocumentosNumero
 * @param referenteDocumentosTipo
 * @param referenteDocumentosPrograma
 * @param referenteDocumentosLoja
 * @param atDocCodeID
 * @param returnCode
 * @param returnMessage
 * @param atDocCodeIDA
 * @param returnCodeA
 * @param returnMessageA
 * @param isFilial
 * @param clienteNome
 * @param clienteMorada
 * @param clienteCodigoPostal
 * @param clienteLocalidade
 * @param clientePais
 * @param objRevendedor
 * @param objGestor
 * @param objVendedor
 * @param objVendedor
 * @param postPoneQuerys
 * @param prePoneQuerys
 * @param metodoEntrega
 */
data class DocumentHeader (

    val subscricaoorigem: kotlin.Int? = null,
    val iddoc: kotlin.Int? = null,
    val isoriginal: kotlin.Boolean? = null,
    val descontogarantia: kotlin.Double? = null,
    val descontoClienteValor: kotlin.Double? = null,
    val descontoFinanceiroValor: kotlin.Double? = null,
    val descontoCliente: kotlin.Double? = null,
    val descontofinanceiro: kotlin.Double? = null,
    val mbWayNumero: kotlin.String? = null,
    val mbWaytoken: kotlin.String? = null,
    val mbWaytokenDone: kotlin.Int? = null,
    val origemID: Int? = null,
    val erro: GestError? = null,
    val docID: kotlin.String? = null,
    val docIDOrigem: kotlin.String? = null,
    val docIDHistorico: kotlin.String? = null,
    val armazemNome: kotlin.String? = null,
    val estado: Int? = null,
    val textoEmail: kotlin.String? = null,
    val isManual: kotlin.Boolean? = null,
    val isImportDoc: kotlin.Boolean? = null,
    val exportadoSAFT: kotlin.Boolean? = null,
    val exportadoData: java.time.LocalDateTime? = null,
    val objDadosHash: DataHash? = null,
    val anulado: kotlin.Boolean? = null,
    val anuladoData: java.time.LocalDateTime? = null,
    val localDescarga: ShipToData? = null,
    val localCarga: ShipmentData? = null,
    var objlinhas: kotlin.Array<DocumentLine>? = null,
    val objTotais: TotalDocument? = null,
    val objTotaisConverted: TotalDocument? = null,
    val objTaxas: RegimeIVA? = null,
    val objCliente: EntityInfo? = null,
    val isDocumentoSAFT: kotlin.Boolean? = null,
    val isDocumentTransporte: kotlin.Boolean? = null,
    val objTipoDocumento: TypeDocument? = null,
    val datapedido: java.time.LocalDateTime? = null,
    val dataconclusao: java.time.LocalDateTime? = null,
    val ticketN: kotlin.String? = null,
    val idTicketPrioridade: kotlin.Int? = null,
    val servicoperiodicidade: kotlin.Int? = null,
    val servicodataproximoalerta: java.time.LocalDateTime? = null,
    val servicodescricao: kotlin.String? = null,
    val servicoid: kotlin.Int? = null,
    val gestplusIDCliente: kotlin.Int? = null,
    val gestplusPeriodicidade: kotlin.Int? = null,
    val gestplusDataProximoAlerta: java.time.LocalDateTime? = null,
    val avencaNPrestacoes: kotlin.Int? = null,
    val avencaNPrestacoesDone: kotlin.Int? = null,
    val avencaNPrestacoesPaid: kotlin.Int? = null,
    val docnome: kotlin.String? = null,
    val idlogin: kotlin.Int? = null,
    val documentonumero: kotlin.Int? = null,
    val documentotipo: kotlin.Int? = null,
    val documentoloja: kotlin.String? = null,
    val documentoSerie: kotlin.String? = null,
    val documentoprograma: Int? = null,
    val idserie: kotlin.String? = null,
    val serie: Series? = null,
    val nif: kotlin.String? = null,
    val idMesa: kotlin.Int? = null,
    val pago: kotlin.Boolean? = null,
    val pagotot: kotlin.Double? = null,
    val docCli: kotlin.String? = null,
    val `data`: java.time.LocalDateTime? = null,
    val dataInicio: java.time.LocalDateTime? = null,
    val dataFim: java.time.LocalDateTime? = null,
    val prioricidade: kotlin.Int? = null,
    val dataPagamento: java.time.LocalDateTime? = null,
    val vencomendaonline: kotlin.String? = null,
    val vreferencia: kotlin.String? = null,
    val numeroenc: kotlin.Int? = null,
    val objTipoPagamentoDocumento: TypePaymentDocument? = null,
    val apartirdesubscricao: kotlin.Int? = null,
    val facturaassociadaagt: kotlin.Int? = null,
    val confirmartipopagamento: kotlin.Int? = null,
    val talaorecibo: kotlin.String? = null,
    val vendadirecta: kotlin.Int? = null,
    val pos: kotlin.Int? = null,
    val moeda: Currency? = null,
    val obs: kotlin.String? = null,
    val pendenteRevendedor: kotlin.Boolean? = null,
    val eLicElectronica: kotlin.Boolean? = null,
    val idClienteRetalhista: kotlin.Int? = null,
    val idLicTemp: kotlin.String? = null,
    val dataaprovacaoliceletronica: java.time.LocalDateTime? = null,
    val rascunhoTDoc: kotlin.Int? = null,
    val rascunhodocid: kotlin.String? = null,
    val versionCert: kotlin.Int? = null,
    val titulo: kotlin.String? = null,
    val idTecnico: kotlin.Int? = null,
    val idEstadoTecnico: kotlin.Int? = null,
    val docforn: kotlin.String? = null,
    val idbancoconta: kotlin.Int? = null,
    val clienteNome: kotlin.String? = null,
    val clienteMorada: kotlin.String? = null,
    val clienteCidade: kotlin.String? = null,
    val clienteCodPost: kotlin.String? = null,
    val clientePais: kotlin.String? = null,
    val clientePaisID: kotlin.Int? = null,
    val nCartao: kotlin.String? = null,
    val geraMB: kotlin.Boolean? = null,
    val motAnulado: kotlin.String? = null,
    val entidade: kotlin.String? = null,
    val referencia: kotlin.String? = null,
    val vencimentoobs: kotlin.String? = null,
    val troco: kotlin.Double? = null,
    val cdgoPedNumero: kotlin.String? = null,
    val nomeComercial: kotlin.String? = null,
    val idTransportadora: kotlin.Int? = null,
    val nTransporte: kotlin.String? = null,
    val irsTexto: kotlin.String? = null,
    val valorPago: kotlin.Double? = null,
    val valorSaldado: kotlin.Double? = null,
    val tipoDescontoRecibo: kotlin.Int? = null,
    val descontoRecibo: kotlin.Double? = null,
    val valorAposDescontoRec: kotlin.Double? = null,
    val invoiceStatus: kotlin.String? = null,
    val estadoDoc: Int? = null,
    val dataEntrega: java.time.LocalDateTime? = null,
    val estadoData: java.time.LocalDateTime? = null,
    val numeradoroffline: kotlin.String? = null,
    val idLojaEntrega: kotlin.Int? = null,
    val sourceBilling: kotlin.String? = null,
    val idContacto: kotlin.Int? = null,
    val idClienteFAC: kotlin.Int? = null,
    val confirmacaoPagamento: kotlin.Boolean? = null,
    val userConfirmacaoPagamento: kotlin.Int? = null,
    val referenciaValorPago: kotlin.Double? = null,
    val referenteDocumentosNumero: kotlin.Int? = null,
    val referenteDocumentosTipo: kotlin.Int? = null,
    val referenteDocumentosPrograma: kotlin.Int? = null,
    val referenteDocumentosLoja: kotlin.String? = null,
    val atDocCodeID: kotlin.String? = null,
    val returnCode: kotlin.String? = null,
    val returnMessage: kotlin.String? = null,
    val atDocCodeIDA: kotlin.String? = null,
    val returnCodeA: kotlin.String? = null,
    val returnMessageA: kotlin.String? = null,
    val isFilial: kotlin.Boolean? = null,
    val clienteCodigoPostal: kotlin.String? = null,
    val clienteLocalidade: kotlin.String? = null,
    val objRevendedor: EntityAssociated? = null,
    val objGestor: EntityAssociated? = null,
    val objVendedor: EntityAssociated? = null,
    val postPoneQuerys: kotlin.Array<PostPoneQuerys>? = null,
    val prePoneQuerys: kotlin.Array<kotlin.String>? = null,
    val metodoEntrega: kotlin.Int? = null
): Serializable {
}