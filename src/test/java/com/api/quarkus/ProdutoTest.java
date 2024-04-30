package com.api.quarkus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.api.quarkus.Produto;
import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@DBRider
@QuarkusTest
@QuarkusTestResource(DatabaseLifecycle.class)
class ProdutoTest {

    @Test
    @DataSet("produtos1.yml")
    void testUm() {
        Assert.assertEquals(1, Produto.count());
    }

}