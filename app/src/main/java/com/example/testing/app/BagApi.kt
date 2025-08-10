package com.example.testing.app

/**
 * Created by Ismaeinz  (@ismaeinz)
 * Date: 09 Aug 2025 at 19:44
 */
class BagApi {
    fun getBagSize(id: Int): String {
        return when (id) {
            1 -> return "S"
            2 -> return "M"
            3 -> return "L"
            else -> "S"
        }
    }

    class PassengerRepository(val api: BagApi) {
        fun getPassengerBagSize(id: Int): String {
            return api.getBagSize(id)
        }
    }
}