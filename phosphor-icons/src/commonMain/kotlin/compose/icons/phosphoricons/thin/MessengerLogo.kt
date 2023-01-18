package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) {
            return _messengerLogo!!
        }
        _messengerLogo = Builder(name = "MessengerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 41.1f, 177.5f)
                lineToRelative(-9.0f, 31.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.8f, 14.8f)
                lineToRelative(31.6f, -9.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, true, -47.0f, -12.9f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.0f, -0.5f)
                lineTo(77.9f, 206.6f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.9f, -4.9f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.4f, -3.1f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
                moveTo(178.8f, 109.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(112.0f, 117.7f)
                lineTo(82.8f, 146.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineTo(144.0f, 138.3f)
                lineToRelative(29.2f, -29.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 178.8f, 109.2f)
                close()
            }
        }
        .build()
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
