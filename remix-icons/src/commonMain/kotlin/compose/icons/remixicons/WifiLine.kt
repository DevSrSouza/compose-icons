package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.WifiLine: ImageVector
    get() {
        if (_wifiLine != null) {
            return _wifiLine!!
        }
        _wifiLine = Builder(name = "WifiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.69f, 6.997f)
                arcTo(17.925f, 17.925f, 0.0f, false, true, 12.0f, 3.0f)
                curveToRelative(4.285f, 0.0f, 8.22f, 1.497f, 11.31f, 3.997f)
                lineToRelative(-1.256f, 1.556f)
                arcTo(15.933f, 15.933f, 0.0f, false, false, 12.0f, 5.0f)
                curveTo(8.191f, 5.0f, 4.694f, 6.33f, 1.946f, 8.553f)
                lineTo(0.69f, 6.997f)
                close()
                moveTo(3.831f, 10.887f)
                arcTo(12.946f, 12.946f, 0.0f, false, true, 12.0f, 8.0f)
                curveToRelative(3.094f, 0.0f, 5.936f, 1.081f, 8.169f, 2.886f)
                lineToRelative(-1.257f, 1.556f)
                arcTo(10.954f, 10.954f, 0.0f, false, false, 12.0f, 10.0f)
                curveToRelative(-2.618f, 0.0f, -5.023f, 0.915f, -6.912f, 2.442f)
                lineToRelative(-1.257f, -1.556f)
                close()
                moveTo(6.973f, 14.777f)
                arcTo(7.967f, 7.967f, 0.0f, false, true, 12.0f, 13.0f)
                curveToRelative(1.904f, 0.0f, 3.653f, 0.665f, 5.027f, 1.776f)
                lineToRelative(-1.257f, 1.556f)
                arcTo(5.975f, 5.975f, 0.0f, false, false, 12.0f, 15.0f)
                curveToRelative(-1.428f, 0.0f, -2.74f, 0.499f, -3.77f, 1.332f)
                lineToRelative(-1.257f, -1.556f)
                close()
                moveTo(10.115f, 18.667f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 12.0f, 18.0f)
                curveToRelative(0.714f, 0.0f, 1.37f, 0.25f, 1.885f, 0.666f)
                lineTo(12.0f, 21.0f)
                lineToRelative(-1.885f, -2.334f)
                close()
            }
        }
        .build()
        return _wifiLine!!
    }

private var _wifiLine: ImageVector? = null
