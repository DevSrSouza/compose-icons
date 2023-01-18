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

public val DuotoneGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(172.4f, 165.0f)
                horizontalLineToRelative(0.0f)
                lineTo(53.9f, 34.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                lineToRelative(4.6f, 5.1f)
                arcTo(185.8f, 185.8f, 0.0f, false, false, 15.4f, 69.6f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 9.2f, 80.5f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 3.7f, 12.3f)
                lineTo(115.8f, 214.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 24.3f, 0.1f)
                lineToRelative(26.7f, -31.5f)
                lineToRelative(35.3f, 38.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(128.0f, 203.6f)
                lineTo(25.1f, 82.4f)
                horizontalLineToRelative(0.0f)
                arcTo(167.3f, 167.3f, 0.0f, false, true, 58.0f, 62.9f)
                lineToRelative(98.0f, 107.8f)
                close()
                moveTo(243.1f, 92.7f)
                lineToRelative(-49.5f, 58.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.1f, 2.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.2f, -1.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -0.9f, -11.3f)
                lineToRelative(49.5f, -58.3f)
                horizontalLineToRelative(0.0f)
                arcTo(171.4f, 171.4f, 0.0f, false, false, 95.7f, 51.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, -15.8f)
                arcTo(187.6f, 187.6f, 0.0f, false, true, 240.6f, 69.6f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, true, 6.2f, 10.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 243.1f, 92.7f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
