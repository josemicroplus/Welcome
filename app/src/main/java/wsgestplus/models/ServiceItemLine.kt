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
 * @param servicoId 
 * @param servicoDataProximoAlerta 
 * @param servicoPeriodicidade 
 * @param servicoDescricao 
 * @param servicoCalendario 
 */
data class ServiceItemLine (

    val servicoId: kotlin.Int? = null,
    val servicoDataProximoAlerta: java.time.LocalDateTime? = null,
    val servicoPeriodicidade: kotlin.Int? = null,
    val servicoDescricao: kotlin.String? = null,
    val servicoCalendario: kotlin.Array<java.time.LocalDateTime>? = null
) {
}