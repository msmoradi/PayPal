package com.google.samples.apps.nowinandroid.core.domain

import com.saeed.paypal.core.data.repository.ContactsRepository
import com.saeed.paypal.core.model.ContactModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetContactsUseCase @Inject constructor(
    private val contactsRepository: ContactsRepository,
) {

    operator fun invoke(): Flow<List<ContactModel>> {
        return contactsRepository.getContacts()
    }
}