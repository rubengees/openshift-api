package com.rubengees.playground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController("/todos")
class TodoController {

    @GetMapping
    fun todos(): Mono<List<Todo>> {
        return Mono.just(
            listOf(
                Todo(1, "Reactive", "Spring", true),
                Todo(2, "Kotlin", "Boot", false)
            )
        )
    }
}
