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

public val ThinGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 213.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.7f, -0.3f)
                lineToRelative(-47.3f, -52.0f)
                arcToRelative(46.7f, 46.7f, 0.0f, false, false, -62.0f, 2.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.8f, -1.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                arcTo(54.7f, 54.7f, 0.0f, false, true, 142.6f, 150.0f)
                lineToRelative(-36.0f, -39.6f)
                arcTo(94.0f, 94.0f, 0.0f, false, false, 61.8f, 135.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.8f, 1.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, -1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, -5.6f)
                arcToRelative(101.6f, 101.6f, 0.0f, false, true, 44.3f, -25.6f)
                lineToRelative(-29.1f, -32.0f)
                arcTo(139.6f, 139.6f, 0.0f, false, false, 27.9f, 101.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, -1.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.1f, -5.7f)
                arcTo(147.6f, 147.6f, 0.0f, false, true, 65.7f, 65.4f)
                lineTo(45.0f, 42.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.4f)
                close()
                moveTo(233.7f, 95.3f)
                arcTo(149.4f, 149.4f, 0.0f, false, false, 128.0f, 52.0f)
                arcToRelative(151.8f, 151.8f, 0.0f, false, false, -21.4f, 1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.1f, 7.9f)
                arcTo(152.7f, 152.7f, 0.0f, false, true, 128.0f, 60.0f)
                arcToRelative(141.6f, 141.6f, 0.0f, false, true, 100.1f, 41.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, -1.2f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 233.7f, 95.3f)
                close()
                moveTo(194.2f, 135.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.8f, 1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, -1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, -5.6f)
                arcToRelative(101.1f, 101.1f, 0.0f, false, false, -46.7f, -26.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.9f, 7.7f)
                arcTo(93.7f, 93.7f, 0.0f, false, true, 194.2f, 135.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
