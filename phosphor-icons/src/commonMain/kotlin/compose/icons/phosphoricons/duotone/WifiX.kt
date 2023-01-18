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

public val DuotoneGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(229.7f, 98.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(200.0f, 91.3f)
                lineToRelative(-18.3f, 18.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(188.7f, 80.0f)
                lineTo(170.3f, 61.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(200.0f, 68.7f)
                lineToRelative(18.3f, -18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(211.3f, 80.0f)
                close()
                moveTo(207.9f, 121.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.3f, 0.9f)
                lineTo(128.0f, 203.6f)
                lineTo(25.1f, 82.4f)
                horizontalLineToRelative(0.0f)
                arcTo(170.9f, 170.9f, 0.0f, false, true, 146.8f, 49.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.7f, -15.9f)
                arcTo(186.1f, 186.1f, 0.0f, false, false, 15.4f, 69.6f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 9.2f, 80.5f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 3.7f, 12.3f)
                lineTo(115.8f, 214.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 24.3f, 0.1f)
                lineToRelative(68.7f, -81.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 207.9f, 121.8f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
