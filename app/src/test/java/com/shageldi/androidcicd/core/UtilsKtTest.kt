package com.shageldi.androidcicd.core

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class UtilsKtTest {
    @Test
    fun `Test 2 numbers add function`() {
        val expected = addTwoNumbers(2, 2)
        val actual = 4

        assertThat(actual).isEqualTo(expected)
    }
}