package br.qa.henriquealmeida.rest_assured

import io.restassured.builder.RequestSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification

class RequestSpecificationFactory private constructor() {

    companion object {
        @JvmStatic
        fun of(baseURL: String): RequestSpecification {
            return RequestSpecBuilder().setBaseUri(baseURL).log(LogDetail.ALL)
                .addHeader("Content-Type", ContentType.JSON.toString())
                .build()
        }
    }
}
