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

import com.microplus.wsGestplus.models.GestError
import com.microplus.wsGestplus.models.User

/**
 * 
 * @param objUsers 
 * @param err 
 */
data class UsersPesqResult (

    val objUsers: kotlin.Array<User>? = null,
    val err: GestError? = null
) {
}