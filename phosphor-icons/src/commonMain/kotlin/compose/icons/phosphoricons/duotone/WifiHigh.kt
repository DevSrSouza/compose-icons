package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) {
            return _wifiHigh!!
        }
        _wifiHigh = Builder(name = "WifiHigh", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.2f, 75.9f)
                curveTo(83.7f, 28.0f, 172.3f, 28.0f, 235.8f, 75.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.0f, 87.5f)
                lineTo(134.0f, 208.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -12.1f, -0.1f)
                lineTo(19.0f, 87.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 20.2f, 75.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 219.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -12.2f, -5.7f)
                lineTo(12.9f, 92.8f)
                arcTo(16.6f, 16.6f, 0.0f, false, true, 9.2f, 80.5f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 6.2f, -10.9f)
                curveToRelative(66.3f, -50.1f, 158.9f, -50.1f, 225.2f, 0.0f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, true, 6.2f, 10.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.7f, 12.2f)
                lineToRelative(-103.0f, 121.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 219.7f)
                close()
                moveTo(25.1f, 82.3f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 203.6f)
                lineTo(230.9f, 82.4f)
                horizontalLineToRelative(0.0f)
                curveTo(170.4f, 36.6f, 85.7f, 36.6f, 25.1f, 82.3f)
                close()
                moveTo(20.2f, 75.9f)
                lineTo(25.0f, 82.3f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(20.2f, 75.9f)
                close()
            }
        }
        .build()
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
