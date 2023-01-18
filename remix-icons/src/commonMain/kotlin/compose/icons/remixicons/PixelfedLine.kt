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

public val RemixIcons.PixelfedLine: ImageVector
    get() {
        if (_pixelfedLine != null) {
            return _pixelfedLine!!
        }
        _pixelfedLine = Builder(name = "PixelfedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.582f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.582f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.582f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(13.031f, 8.099f)
                curveToRelative(1.713f, 0.0f, 3.101f, 1.345f, 3.101f, 3.005f)
                reflectiveCurveToRelative(-1.388f, 3.005f, -3.1f, 3.005f)
                horizontalLineToRelative(-1.819f)
                lineTo(8.618f, 16.58f)
                lineTo(8.618f, 9.832f)
                curveToRelative(0.0f, -0.957f, 0.801f, -1.733f, 1.79f, -1.733f)
                horizontalLineToRelative(2.623f)
                close()
            }
        }
        .build()
        return _pixelfedLine!!
    }

private var _pixelfedLine: ImageVector? = null
