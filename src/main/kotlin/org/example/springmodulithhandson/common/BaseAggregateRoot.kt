package org.example.springmodulithhandson.common

import jakarta.persistence.MappedSuperclass
import org.springframework.data.domain.AfterDomainEventPublication
import org.springframework.data.domain.DomainEvents

@MappedSuperclass
abstract class BaseAggregateRoot<A : BaseAggregateRoot<A>> : BaseEntity() {
    @org.springframework.data.annotation.Transient
    @Transient
    private val domainEvents: MutableList<Any> = ArrayList()

    protected final fun <T : Any> registerEvent(event: T): T {
        domainEvents.add(event)
        return event
    }

    @AfterDomainEventPublication
    protected fun clearDomainEvents() {
        domainEvents.clear()
    }

    @DomainEvents
    fun domainEvents(): List<Any> = domainEvents.toList()

    protected fun andEventsFrom(aggregate: A): A {
        domainEvents.addAll(aggregate.domainEvents())
        return this as A
    }

    protected fun andEvent(event: Any): A {
        registerEvent(event)
        return this as A
    }
}
