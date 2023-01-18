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

public val BoldGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.9f, 207.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -0.8f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, -0.8f)
                lineToRelative(-46.9f, -51.6f)
                arcToRelative(38.7f, 38.7f, 0.0f, false, false, -50.9f, 2.2f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -8.4f, 3.4f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.6f, -3.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.3f, -17.0f)
                arcToRelative(62.3f, 62.3f, 0.0f, false, true, 38.3f, -17.2f)
                lineToRelative(-19.0f, -20.8f)
                arcToRelative(85.5f, 85.5f, 0.0f, false, false, -36.5f, 21.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.4f, 3.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -8.6f, -3.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.2f, -16.9f)
                arcToRelative(107.5f, 107.5f, 0.0f, false, true, 35.8f, -23.5f)
                lineToRelative(-17.0f, -18.7f)
                arcToRelative(134.2f, 134.2f, 0.0f, false, false, -35.9f, 25.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.4f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -20.6f)
                arcTo(158.8f, 158.8f, 0.0f, false, true, 52.7f, 63.0f)
                lineTo(39.1f, 48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.9f, 31.9f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(239.4f, 89.6f)
                arcTo(157.5f, 157.5f, 0.0f, false, false, 128.0f, 44.0f)
                curveToRelative(-4.0f, 0.0f, -8.0f, 0.2f, -11.9f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.8f, 24.0f)
                curveToRelative(3.3f, -0.3f, 6.7f, -0.4f, 10.1f, -0.4f)
                arcToRelative(133.7f, 133.7f, 0.0f, false, true, 94.5f, 38.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.4f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -20.6f)
                close()
                moveTo(188.6f, 140.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.4f, 3.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.6f, -3.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.2f, -16.9f)
                arcToRelative(109.1f, 109.1f, 0.0f, false, false, -32.7f, -22.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.7f, 22.0f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 188.6f, 140.7f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
