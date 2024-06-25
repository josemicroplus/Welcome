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
package com.microplus.wsGestplus.apis

import com.microplus.wsGestplus.models.ParamGetPhoneNumbers
import com.microplus.wsGestplus.models.ResultGetPhoneNumbers

import com.microplus.wsGestplus.infrastructure.*

class GetPhoneNumbersApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param body  (optional)
     * @return ResultGetPhoneNumbers
     */
    @Suppress("UNCHECKED_CAST")
    fun getPhoneNumbers(body: ParamGetPhoneNumbers? = null): ResultGetPhoneNumbers {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/getPhoneNumbers"
        )
        val response = request<ResultGetPhoneNumbers>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResultGetPhoneNumbers
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
