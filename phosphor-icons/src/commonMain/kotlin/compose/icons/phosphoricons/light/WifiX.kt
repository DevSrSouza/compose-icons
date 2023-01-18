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

public val LightGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.2f, 161.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.1f, 10.3f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.2f, -1.7f)
                arcToRelative(44.7f, 44.7f, 0.0f, false, false, -61.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.4f, -8.6f)
                arcToRelative(56.7f, 56.7f, 0.0f, false, true, 78.5f, 0.0f)
                close()
                moveTo(208.5f, 80.0f)
                lineToRelative(19.7f, -19.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(200.0f, 71.5f)
                lineTo(180.2f, 51.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(191.5f, 80.0f)
                lineTo(171.8f, 99.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(200.0f, 88.5f)
                lineToRelative(19.8f, 19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                close()
                moveTo(143.4f, 62.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.6f, -5.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -5.3f, -6.6f)
                arcTo(154.3f, 154.3f, 0.0f, false, false, 128.0f, 50.0f)
                arcTo(151.6f, 151.6f, 0.0f, false, false, 20.8f, 93.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.5f, 0.0f)
                arcTo(139.6f, 139.6f, 0.0f, false, true, 128.0f, 62.0f)
                curveTo(133.1f, 62.0f, 138.3f, 62.3f, 143.4f, 62.8f)
                close()
                moveTo(143.1f, 111.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 145.0f, 99.4f)
                arcTo(107.3f, 107.3f, 0.0f, false, false, 128.0f, 98.0f)
                arcToRelative(103.7f, 103.7f, 0.0f, false, false, -73.2f, 29.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 59.0f, 138.1f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.2f, -1.7f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 128.0f, 110.0f)
                arcTo(96.1f, 96.1f, 0.0f, false, true, 143.1f, 111.2f)
                close()
                moveTo(128.0f, 190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 190.0f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
