package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) {
            return _messengerLogo!!
        }
        _messengerLogo = Builder(name = "MessengerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 39.0f, 177.8f)
                lineToRelative(-8.8f, 30.7f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.3f, 17.3f)
                lineTo(78.2f, 217.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.9f, -12.6f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -3.1f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.6f, 0.2f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, -2.5f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.6f, -4.7f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
                moveTo(180.2f, 107.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineTo(112.0f, 120.5f)
                lineTo(84.2f, 148.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                lineTo(144.0f, 135.5f)
                lineToRelative(27.8f, -27.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 180.2f, 107.8f)
                close()
            }
        }
        .build()
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
