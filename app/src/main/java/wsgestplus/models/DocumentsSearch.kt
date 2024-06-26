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

/**
 * 
 * @param listOfTypeDocuments 
 * @param loadTicket 
 * @param serieEquip 
 * @param entidadeTipo 
 * @param estadoDoc 
 * @param categoriaMain 
 * @param apenasPorPagar 
 * @param apenasPorPagarIncluirSemMov 
 * @param apenasDocsCC 
 * @param filtrarAno 
 * @param filtrarFavoritos 
 * @param numeroDocumento 
 * @param numeroDocumentoLike 
 * @param &#x60;data&#x60; 
 * @param nomeCliente 
 * @param idCliente 
 * @param idProduto 
 * @param contribuinte 
 * @param total 
 * @param totalMaiorQue 
 * @param totalMenorQue 
 * @param naoAssociadosImpBanco 
 * @param apenasContemServicos 
 * @param idUser 
 * @param referenciaMultibanco 
 * @param idTipoDocumento 
 * @param filtraLoja 
 * @param vReferencia 
 * @param ocultarAnulados 
 * @param ocultarPertencentesAGestplus 
 * @param docModule 
 * @param numeroRegistosPesquisa 
 * @param numeroPaginaPesquisa 
 * @param documentoSusceptivelDeConversao 
 * @param armazem 
 * @param idImpBanco 
 * @param serie 
 * @param descricao 
 * @param webSearch 
 * @param sorting 
 * @param sortingOrder 
 * @param vencimento 
 * @param datade 
 * @param docidRast 
 * @param dataate 
 * @param idtask 
 * @param idTecnico 
 * @param porDevolverouFaturar 
 * @param idEquip 
 * @param gestplusIDCliente 
 * @param gestplusExpiradosFilter 
 * @param gestplusExpirados 
 * @param opcoesManuais 
 * @param nDocNomeNif 
 * @param movimento 
 * @param idMotorista 
 */
data class DocumentsSearch (

    val listOfTypeDocuments: kotlin.Array<kotlin.Int>? = arrayOf<kotlin.Int>(),
    val loadTicket: kotlin.Boolean? = false,
    val serieEquip: kotlin.String? = "",
    val entidadeTipo: kotlin.String? = "",
    val estadoDoc: kotlin.Int?=1,
    val categoriaMain: kotlin.Int? = 0,
    val apenasPorPagar: kotlin.Boolean? = false,
    val apenasPorPagarIncluirSemMov: kotlin.Boolean? = false,
    val apenasDocsCC: kotlin.Boolean? = false,
    val filtrarAno: kotlin.Int? = 0,
    val filtrarFavoritos: kotlin.String? = "",
    val numeroDocumento: kotlin.Int? = 0,
    val numeroDocumentoLike: kotlin.String? = "",
    val `data`: java.time.LocalDateTime? = null,
    val nomeCliente: kotlin.String? = "",
    val idCliente: kotlin.String? = "",
    val idProduto: kotlin.String? = "",
    val contribuinte: kotlin.String? = "",
    val total: kotlin.Double? = 0.0,
    val totalMaiorQue: kotlin.Double? = 0.0,
    val totalMenorQue: kotlin.Double? = 0.0,
    val naoAssociadosImpBanco: kotlin.Int? = 0,
    val apenasContemServicos: kotlin.Boolean? = false,
    val idUser: kotlin.Int? = 0,
    val referenciaMultibanco: kotlin.String? = "",
    val idTipoDocumento: kotlin.Int? = 0,
    val filtraLoja: kotlin.Boolean? = false,
    val vReferencia: kotlin.String? = "",
    val ocultarAnulados: kotlin.Boolean? = false,
    val ocultarPertencentesAGestplus: kotlin.Boolean? = false,
    val docModule: kotlin.String? = "",
    val numeroRegistosPesquisa: kotlin.Int? = 0,
    val numeroPaginaPesquisa: kotlin.Int? = 0,
    val documentoSusceptivelDeConversao: kotlin.Boolean? = false,
    val armazem: kotlin.Int? = 0,
    val idImpBanco: kotlin.Int? = 0,
    val serie: kotlin.String? = "",
    val descricao: kotlin.String? = "",
    val webSearch: kotlin.Boolean? = false,
    val sorting: kotlin.Int?=1,
    val sortingOrder: kotlin.Int?=1,
    val vencimento: java.time.LocalDateTime? = null,
    val datade: java.time.LocalDateTime? = null,
    val docidRast: kotlin.String? = "",
    val dataate: java.time.LocalDateTime? = null,
    val idtask: kotlin.Int? = 0,
    val idTecnico: kotlin.Int? = 0,
    val porDevolverouFaturar: kotlin.Boolean? = false,
    val idEquip: kotlin.Int? = 0,
    val gestplusIDCliente: kotlin.Int? = 0,
    val gestplusExpiradosFilter: kotlin.Boolean? = false,
    val gestplusExpirados: java.time.LocalDateTime? =null,
    val opcoesManuais: kotlin.Int? = 0,
    val nDocNomeNif: kotlin.String? = "",
    val movimento: kotlin.String? = "",
    val idMotorista: kotlin.Int? = 0
) {
}