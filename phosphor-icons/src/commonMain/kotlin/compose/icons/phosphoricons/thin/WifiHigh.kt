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

public val ThinGroup.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) {
            return _wifiHigh!!
        }
        _wifiHigh = Builder(name = "WifiHigh", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.9f, 163.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.8f, 1.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(46.9f, 46.9f, 0.0f, false, false, -64.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, -0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(54.9f, 54.9f, 0.0f, false, true, 75.8f, 0.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(101.7f, 101.7f, 0.0f, false, false, -71.8f, 29.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, 5.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.1f)
                arcToRelative(94.7f, 94.7f, 0.0f, false, true, 132.4f, 0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.8f, 1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, -1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, -5.6f)
                arcTo(101.7f, 101.7f, 0.0f, false, false, 128.0f, 100.0f)
                close()
                moveTo(233.7f, 95.3f)
                arcToRelative(150.7f, 150.7f, 0.0f, false, false, -211.4f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.1f, 5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 0.0f)
                arcToRelative(142.7f, 142.7f, 0.0f, false, true, 200.2f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, -1.2f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 233.7f, 95.3f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
