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

public val LightGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.4f, 212.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -0.4f, 8.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.0f, 1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.4f, -2.0f)
                lineToRelative(-47.2f, -51.9f)
                arcTo(44.8f, 44.8f, 0.0f, false, false, 128.0f, 158.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -30.9f, 12.4f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.2f, 1.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.1f, -10.3f)
                arcTo(55.7f, 55.7f, 0.0f, false, true, 128.0f, 146.0f)
                arcToRelative(65.4f, 65.4f, 0.0f, false, true, 8.9f, 0.7f)
                lineToRelative(-31.0f, -34.1f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, false, -42.7f, 23.8f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.2f, 1.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -10.3f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, true, 42.1f, -25.1f)
                lineToRelative(-26.0f, -28.6f)
                arcToRelative(138.8f, 138.8f, 0.0f, false, false, -41.6f, 28.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.1f, -8.5f)
                arcTo(148.1f, 148.1f, 0.0f, false, true, 62.4f, 64.8f)
                lineTo(43.6f, 44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.8f, -8.0f)
                close()
                moveTo(235.1f, 93.9f)
                arcTo(151.2f, 151.2f, 0.0f, false, false, 128.0f, 50.0f)
                arcToRelative(156.1f, 156.1f, 0.0f, false, false, -21.7f, 1.5f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 108.0f, 63.4f)
                arcTo(148.3f, 148.3f, 0.0f, false, true, 128.0f, 62.0f)
                arcToRelative(139.8f, 139.8f, 0.0f, false, true, 98.7f, 40.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.5f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 235.1f, 93.9f)
                close()
                moveTo(192.8f, 136.4f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.2f, 1.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.2f, -10.3f)
                arcToRelative(104.4f, 104.4f, 0.0f, false, false, -47.6f, -26.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.9f, 11.7f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 192.8f, 136.4f)
                close()
                moveTo(128.0f, 190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 190.0f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
