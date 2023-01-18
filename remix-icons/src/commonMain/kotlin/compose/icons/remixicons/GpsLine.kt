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

public val RemixIcons.GpsLine: ImageVector
    get() {
        if (_gpsLine != null) {
            return _gpsLine!!
        }
        _gpsLine = Builder(name = "GpsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.132f, 20.737f)
                arcTo(9.997f, 9.997f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.997f, 9.997f, 0.0f, false, true, -5.132f, 8.737f)
                lineToRelative(-0.896f, -1.791f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.945f, 0.0f)
                lineToRelative(-0.895f, 1.791f)
                close()
                moveTo(8.924f, 17.153f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.151f, 0.0f)
                lineToRelative(-0.898f, -1.797f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.354f, 0.0f)
                lineToRelative(-0.899f, 1.797f)
                close()
                moveTo(12.0f, 16.0f)
                lineToRelative(3.0f, 6.0f)
                lineTo(9.0f, 22.0f)
                lineToRelative(3.0f, -6.0f)
                close()
            }
        }
        .build()
        return _gpsLine!!
    }

private var _gpsLine: ImageVector? = null
