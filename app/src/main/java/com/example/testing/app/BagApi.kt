package com.example.testing.app

/**
 * Created by Ismaeinz  (@ismaeinz)
 * Date: 09 Aug 2025 at 19:44
 */
class BagApi {
    suspend fun getBagSize(id: Int, size: String): String {
        return when (id) {
            1 -> return "S"
            2 -> return "M"
            3 -> return "L"
            else -> "S"
        } + size
    }

    class PassengerRepository(val api: BagApi) {
        suspend fun getPassengerBagSize(id: Int, size: String): String {
            return api.getBagSize(id, size)
        }
    }
}