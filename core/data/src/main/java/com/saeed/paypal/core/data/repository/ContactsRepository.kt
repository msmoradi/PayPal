package com.saeed.paypal.core.data.repository

import com.saeed.paypal.core.model.ContactModel
import kotlinx.coroutines.flow.Flow

interface ContactsRepository {

    fun getContacts(): Flow<List<ContactModel>>
}