package com.samweeklyprojects.honorsociety.web.rest

import com.samweeklyprojects.honorsociety.web.api.ApiApiDelegate
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.context.request.NativeWebRequest
import java.util.*

@Suppress("SpringJavaInjectionPointsAutowiringInspection")
@Service
class HelloController(private val request: NativeWebRequest) : ApiApiDelegate {

    override fun getRequest(): Optional<NativeWebRequest> {
        return Optional.of(request);
    }

    override fun hello(): ResponseEntity<String> {
        return ResponseEntity.ok("Yo!")
    }
}
