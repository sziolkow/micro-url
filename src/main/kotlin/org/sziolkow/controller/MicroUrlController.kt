package org.sziolkow.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import org.sziolkow.controller.UrlRequest
import org.sziolkow.controller.UrlResponse

@Controller("/urls")
class MicroUrlController {

    @Post
    fun createMicroUrl(@Body urlRequest: UrlRequest?): HttpResponse<UrlResponse> {
        return HttpResponse.created(UrlResponse())
    }

    @Get("/")
    fun getMicroUrl(): HttpResponse<UrlResponse> {
        return HttpResponse.ok(UrlResponse())
    }

}