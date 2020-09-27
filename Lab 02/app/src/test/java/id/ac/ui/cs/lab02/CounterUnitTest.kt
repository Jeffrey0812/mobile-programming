package id.ac.ui.cs.lab02

import org.junit.Assert
import org.junit.Test

class CounterUnitTest {
    @Test
    fun testIncrement() {
        val obj = Counter()
        obj.incrementCount()
        Assert.assertEquals(1, obj.getCount())
    }

    @Test
    fun testDecrement() {
        val obj = Counter()
        obj.incrementCount()
        obj.incrementCount()
        obj.decrementCount()
        Assert.assertEquals(1, obj.getCount())
    }

    @Test
    fun testReset() {
        val obj = Counter()
        obj.incrementCount()
        obj.incrementCount()
        Assert.assertEquals(2, obj.getCount())
        obj.resetCount()
        Assert.assertEquals(0, obj.getCount())
    }
}