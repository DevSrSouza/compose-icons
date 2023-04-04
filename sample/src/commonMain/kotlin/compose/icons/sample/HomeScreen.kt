package compose.icons.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import compose.icons.sample.data.IconPackModel
import compose.icons.sample.data.iconPacks
import compose.icons.FeatherIcons
import compose.icons.feathericons.ChevronRight

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Compose Icons",
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
                    .padding(top = 32.dp, bottom = 32.dp),
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ) {
                for(iconPack in iconPacks) {
                    IconPackCard(iconPack)
                }
            }
        }
    }

    @Composable
    private fun IconPackCard(
        iconPack: IconPackModel,
    ) {
        val navigator = LocalNavigator.currentOrThrow
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.padding(all = 8.dp)
        ) {
            Row(
                modifier = Modifier.clickable {
                    navigator.push(IconPackScreen(iconPack))
                }.padding(all = 16.dp)
            ) {
                Text(
                    text = iconPack.packName,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Image(imageVector = FeatherIcons.ChevronRight, contentDescription = null)
            }
        }
    }
}