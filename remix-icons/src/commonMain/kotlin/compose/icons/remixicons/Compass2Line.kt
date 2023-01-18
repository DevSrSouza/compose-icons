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

public val RemixIcons.Compass2Line: ImageVector
    get() {
        if (_compass2Line != null) {
            return _compass2Line!!
        }
        _compass2Line = Builder(name = "Compass2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.625f, 3.133f)
                lineToRelative(-1.5f, 1.5f)
                arcTo(7.98f, 7.98f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                arcToRelative(7.98f, 7.98f, 0.0f, false, false, -0.633f, -3.125f)
                lineToRelative(1.5f, -1.5f)
                arcTo(9.951f, 9.951f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.668f, 0.0f, 3.241f, 0.41f, 4.625f, 1.133f)
                close()
                moveTo(18.364f, 4.222f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineTo(10.586f, 12.0f)
                lineToRelative(7.778f, -7.778f)
                close()
            }
        }
        .build()
        return _compass2Line!!
    }

private var _compass2Line: ImageVector? = null
