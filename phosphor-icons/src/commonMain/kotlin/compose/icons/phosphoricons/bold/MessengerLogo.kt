package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) {
            return _messengerLogo!!
        }
        _messengerLogo = Builder(name = "MessengerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 32.5f, 178.5f)
                lineToRelative(-8.1f, 28.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.7f, 24.7f)
                lineToRelative(28.4f, -8.1f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, true, -42.9f, -11.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -6.1f, -1.7f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -3.3f, 0.4f)
                lineToRelative(-26.2f, 7.5f)
                lineTo(57.0f, 180.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.3f, -9.4f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, 84.0f)
                close()
                moveTo(184.5f, 120.5f)
                lineTo(152.5f, 152.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(112.0f, 129.0f)
                lineTo(88.5f, 152.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(144.0f, 127.0f)
                lineToRelative(23.5f, -23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
