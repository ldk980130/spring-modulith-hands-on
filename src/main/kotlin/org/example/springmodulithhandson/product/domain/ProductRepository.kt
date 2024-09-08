package org.example.springmodulithhandson.product.domain

import org.example.springmodulithhandson.product.domain.root.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>
