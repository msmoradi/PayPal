package com.saeed.paypal.feature.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.ui.DevicePreviews
import com.saeed.paypal.feature.home.R
import com.saeed.paypal.core.designsystem.R as DR

@Composable
fun HomeAppBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .aspectRatio(1.3786f)
            .paint(
                painter = painterResource(id = R.drawable.frame_header_background),
                contentScale = ContentScale.FillWidth
            )
            .padding(horizontal = 32.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = DR.drawable.ic_paypal_logo),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(52.dp),
                painter = painterResource(id = R.drawable.profile_13),
                contentDescription = null
            )
        }

        Text(
            modifier = Modifier.paddingFromBaseline(top = 22.dp, bottom = 32.dp),
            text = "Hello, Vadim!",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Text(
            text = "$ 272.30",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Text(
            modifier = Modifier.paddingFromBaseline(top = 4.dp),
            text = "Your Balance",
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@DevicePreviews
@Composable
fun HomeAppBarPreview() {
    PayPalTheme {
        HomeAppBar()
    }
}