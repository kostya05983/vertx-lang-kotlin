package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpFrame
import io.vertx.core.http.HttpServerFileUpload
import io.vertx.core.http.HttpServerRequest
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun HttpServerRequest.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpServerRequest.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun HttpServerRequest.endHandlerAwait() : Void {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun HttpServerRequest.bodyHandlerAwait() : Buffer {
    return awaitEvent{
        this.bodyHandler(it)
    }
}

suspend fun HttpServerRequest.uploadHandlerAwait() : HttpServerFileUpload {
    return awaitEvent{
        this.uploadHandler(it)
    }
}

suspend fun HttpServerRequest.customFrameHandlerAwait() : HttpFrame {
    return awaitEvent{
        this.customFrameHandler(it)
    }
}

