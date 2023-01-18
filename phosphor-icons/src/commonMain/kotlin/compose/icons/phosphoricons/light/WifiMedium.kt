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

public val LightGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.2f, 161.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.1f, 10.3f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.2f, -1.7f)
                arcToRelative(44.7f, 44.7f, 0.0f, false, false, -61.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.5f, -0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.2f, -8.4f)
                arcToRelative(56.5f, 56.5f, 0.0f, false, true, 78.4f, 0.0f)
                close()
                moveTo(201.2f, 127.8f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, false, -146.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 8.6f)
                arcToRelative(92.7f, 92.7f, 0.0f, false, true, 129.6f, 0.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.2f, 1.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.2f, -10.3f)
                close()
                moveTo(128.0f, 190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 190.0f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
