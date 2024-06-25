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

import com.microplus.wsGestplus.infrastructure.ApiClient
import com.microplus.wsGestplus.infrastructure.ClientError
import com.microplus.wsGestplus.infrastructure.ClientException
import com.microplus.wsGestplus.infrastructure.RequestConfig
import com.microplus.wsGestplus.infrastructure.RequestMethod
import com.microplus.wsGestplus.infrastructure.ResponseType
import com.microplus.wsGestplus.infrastructure.ServerError
import com.microplus.wsGestplus.infrastructure.ServerException
import com.microplus.wsGestplus.infrastructure.Success
import com.microplus.wsGestplus.models.ProductSearchResult
import com.microplus.wsGestplus.models.ProductsSearch

class GetProductSearchApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param body  (optional)
     * @return ProductSearchResult
     */
    @Suppress("UNCHECKED_CAST")
    fun getProductSearch(body: ProductsSearch? = null): ProductSearchResult {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/getProductSearch"
        )
        val response = request<ProductSearchResult>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ProductSearchResult
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
