package com.github.aistomin.deutsche.post.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by aistomin on 12.01.20.
 * <p>
 * Test for {@link Dummy}
 */
class DummyTest {

    /**
     * Dummy test method.
     */
    @Test
    void testDummy() {
        Assertions.assertEquals("test", new Dummy().dummy());
    }
}
