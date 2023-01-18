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

public val BoldGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.4f, 157.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.3f, 17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.3f)
                arcToRelative(38.7f, 38.7f, 0.0f, false, false, -53.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.7f, -17.3f)
                arcToRelative(62.8f, 62.8f, 0.0f, false, true, 86.8f, 0.0f)
                close()
                moveTo(217.0f, 80.0f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(200.0f, 63.0f)
                lineTo(184.5f, 47.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(183.0f, 80.0f)
                lineTo(167.5f, 95.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(200.0f, 97.0f)
                lineToRelative(15.5f, 15.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(135.4f, 68.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 1.2f, -24.0f)
                lineTo(128.0f, 44.0f)
                arcTo(157.5f, 157.5f, 0.0f, false, false, 16.6f, 89.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 16.9f, 17.1f)
                arcTo(133.7f, 133.7f, 0.0f, false, true, 128.0f, 68.0f)
                close()
                moveTo(135.0f, 116.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 13.0f, -11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.0f, -12.9f)
                curveToRelative(-3.0f, -0.3f, -6.0f, -0.4f, -9.0f, -0.4f)
                arcToRelative(109.6f, 109.6f, 0.0f, false, false, -77.4f, 31.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.2f, 16.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.6f, 3.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.4f, -3.4f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 128.0f, 116.0f)
                curveTo(130.3f, 116.0f, 132.7f, 116.1f, 135.0f, 116.3f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
