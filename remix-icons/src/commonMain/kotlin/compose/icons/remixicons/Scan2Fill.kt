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

public val RemixIcons.Scan2Fill: ImageVector
    get() {
        if (_scan2Fill != null) {
            return _scan2Fill!!
        }
        _scan2Fill = Builder(name = "Scan2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.257f, 5.671f)
                lineToRelative(2.137f, 2.137f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineTo(5.67f, 4.257f)
                arcTo(9.959f, 9.959f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.401f, 0.846f, -4.605f, 2.257f, -6.329f)
                close()
                moveTo(7.828f, 9.243f)
                lineTo(12.0f, 13.414f)
                lineTo(13.414f, 12.0f)
                lineTo(9.243f, 7.828f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _scan2Fill!!
    }

private var _scan2Fill: ImageVector? = null
