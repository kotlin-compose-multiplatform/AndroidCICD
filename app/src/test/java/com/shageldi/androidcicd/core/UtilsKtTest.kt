package com.shageldi.androidcicd.core

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class UtilsKtTest {
    @Test
    fun `Test 2 numbers add function`() {
        val expected = addTwoNumbers(4, 4)
        val actual = 8

        assertThat(actual).isEqualTo(expected)
    }
}