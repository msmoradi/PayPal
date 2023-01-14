package com.saeed.paypal.core.data.repository.fake

import com.saeed.paypal.core.data.repository.ContactsRepository
import com.saeed.paypal.core.model.ContactModel
import com.saeed.paypal.core.network.Dispatcher
import com.saeed.paypal.core.network.PayPalDispatchers
import com.saeed.paypal.core.network.fake.FakePaypalNetworkDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class FakeContactsRepository @Inject constructor(
    @Dispatcher(PayPalDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val datasource: FakePaypalNetworkDataSource
) : ContactsRepository {

    override fun getContacts(): Flow<List<ContactModel>> = flow {
        emit(
            datasource.getContacts().map {
                ContactModel(
                    name = it.name,
                    email = it.email,
                )
            }
        )
    }.flowOn(ioDispatcher)
}
