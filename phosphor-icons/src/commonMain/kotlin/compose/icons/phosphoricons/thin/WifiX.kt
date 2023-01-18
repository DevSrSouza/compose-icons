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

public val ThinGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.8f, 163.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.1f, 5.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.8f, 1.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(46.9f, 46.9f, 0.0f, false, false, -64.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, -5.6f)
                arcToRelative(54.7f, 54.7f, 0.0f, false, true, 75.7f, 0.0f)
                close()
                moveTo(205.7f, 80.0f)
                lineToRelative(21.1f, -21.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineTo(200.0f, 74.3f)
                lineTo(178.8f, 53.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(194.3f, 80.0f)
                lineToRelative(-21.1f, 21.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(200.0f, 85.7f)
                lineToRelative(21.2f, 21.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                close()
                moveTo(143.6f, 60.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.4f, -3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.6f, -4.4f)
                arcTo(150.6f, 150.6f, 0.0f, false, false, 22.3f, 95.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.1f, 5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcTo(141.6f, 141.6f, 0.0f, false, true, 128.0f, 60.0f)
                curveTo(133.2f, 60.0f, 138.4f, 60.3f, 143.6f, 60.8f)
                close()
                moveTo(143.4f, 109.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.6f, -3.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.3f, -4.6f)
                arcTo(116.3f, 116.3f, 0.0f, false, false, 128.0f, 100.0f)
                arcToRelative(101.7f, 101.7f, 0.0f, false, false, -71.8f, 29.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, 5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, 1.2f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.8f, -1.1f)
                arcTo(93.8f, 93.8f, 0.0f, false, true, 128.0f, 108.0f)
                arcTo(98.9f, 98.9f, 0.0f, false, true, 143.4f, 109.2f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
